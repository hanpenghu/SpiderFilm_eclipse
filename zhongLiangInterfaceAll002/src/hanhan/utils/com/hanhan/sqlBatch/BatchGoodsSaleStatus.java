package hanhan.utils.com.hanhan.sqlBatch;

import hanhan.entity.goodsEntity.goodsDetail.GoodsDetail;
import hanhan.entity.goodsEntity.goodsUp1AndDown0status.GoodsUp1AndDown0Status;
import hanhan.utils.com.hanhan.jdbcUtil;
import hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.goods.DoYuanFeng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//insert into shang_pin_shang_xia_jia(goodsid,status)values(#{item.goodsid,jdbcType=VARCHAR},#{item.status,jdbcType=VARCHAR});
public class BatchGoodsSaleStatus {
	Logger log = LogManager.getLogger(DoYuanFeng.class.getName());
	// 全局参数									
			private static Connection con=null;									
			private PreparedStatement pstmt;									
			private ResultSet rs;		
		public void save(List<GoodsUp1AndDown0Status> list) {									
			// SQL
			String sql = "insert into shang_pin_shang_xia_jia(goodsid,status)values(?,?)";
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
						GoodsUp1AndDown0Status goodsUp1AndDown0Status = list.get(i);						
						// 设置参数						
						pstmt.setString(1, goodsUp1AndDown0Status.getGoodsid());
						pstmt.setString(2, goodsUp1AndDown0Status.getStatus());
						// 添加批处理						
						pstmt.addBatch();					// 【不需要传入SQL】
						// 测试：每30条执行一次批处理						
						if (i %30 == 0) {					
							// 批量执行 					
							pstmt.executeBatch();					
							// 清空批处理					
							pstmt.clearBatch();					
						}
					} catch (Exception e) {log.error("-------------"+e.getMessage()+"-----------",e);}						
				}							
				// 批量执行 							
				pstmt.executeBatch();							
				// 清空批处理							
				pstmt.clearBatch();							
			} catch (Exception e) {								
				log.error("-------------"+e.getMessage()+"-----------",e);							
			} finally {								
				jdbcUtil.close(null, pstmt, rs);							
			}								
		}
}
