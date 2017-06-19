package hanhan.utils.com.hanhan.sqlBatch;

import hanhan.entity.goodsEntity.goodsUp1AndDown0status.GoodsUp1AndDown0Status;
import hanhan.entity.goodsEntity.imageEtity.shang_pin_tu_pian;
import hanhan.utils.com.hanhan.jdbcUtil;
import hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.goods.DoYuanFeng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*insert into shang_pin_tu_pian(goodsid,path1,isprimary1,path2,isprimary2,path3,isprimary3,path4,isprimary4)values
<foreach collection="list" item="item" separator=",">
	(
	#{item.goodsid,jdbcType=VARCHAR},#{item.path1,jdbcType=VARCHAR},#{item.isprimary1,jdbcType=VARCHAR},
	#{item.path2,jdbcType=VARCHAR},#{item.isprimary2,jdbcType=VARCHAR},
	#{item.path3,jdbcType=VARCHAR},#{item.isprimary3,jdbcType=VARCHAR},
	#{item.path4,jdbcType=VARCHAR},#{item.isprimary4,jdbcType=VARCHAR}
	)*/
public class BatchImageDetail {
	Logger log = LogManager.getLogger(DoYuanFeng.class.getName());
	// 全局参数									
			private static Connection con=null;									
			private PreparedStatement pstmt;									
			private ResultSet rs;		
		public void save(List<shang_pin_tu_pian> list) {									
			// SQL
			String sql = "insert into shang_pin_tu_pian(goodsid,path1,isprimary1,path2,isprimary2,path3,isprimary3,path4,isprimary4)values(?,?,?,?,?,?,?,?,?)";
			try {								
				// 获取连接							
				// 获取唯一连接
				if(con==null){
					con = jdbcUtil.getConnection();	
				}						
				// 创建stmt 							
				pstmt = con.prepareStatement(sql); // 【预编译SQL语句】  							
				for (int i=0; i<list.size(); i++) {							
					try {
						shang_pin_tu_pian shang_pin_tu_pian = list.get(i);						
						// 设置参数						
						pstmt.setString(1,shang_pin_tu_pian.getGoodsid());
						pstmt.setString(2,shang_pin_tu_pian.getPath1());
						pstmt.setString(3,shang_pin_tu_pian.getIsprimary1());
						pstmt.setString(4,shang_pin_tu_pian.getPath2( ));
						pstmt.setString(5,shang_pin_tu_pian.getIsprimary2());
						pstmt.setString(6,shang_pin_tu_pian.getPath3());
						pstmt.setString(7,shang_pin_tu_pian.getIsprimary3());
						pstmt.setString(8,shang_pin_tu_pian.getPath4());
						pstmt.setString(9,shang_pin_tu_pian.getIsprimary4());
						// 添加批处理						
						pstmt.addBatch();					// 【不需要传入SQL】
						// 测试：每30条执行一次批处理						
						if (i %30 == 0) {					
							// 批量执行 					
							pstmt.executeBatch();					
							// 清空批处理					
							pstmt.clearBatch();					
						}
					} catch (Exception e) {log.error("！！！！！！！！！！！！！-------------"+e.getMessage()+"-----------",e);}						
				}							
				// 批量执行 							
				pstmt.executeBatch();							
				// 清空批处理							
				pstmt.clearBatch();							
			} catch (Exception e) {								
				log.error("！！！！！！！！！！1-------------"+e.getMessage()+"-----------",e);							
			} finally {								
				jdbcUtil.close(null, pstmt, rs);							
			}								
		}
}
