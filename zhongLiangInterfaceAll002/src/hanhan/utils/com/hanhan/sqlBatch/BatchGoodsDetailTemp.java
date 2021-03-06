package hanhan.utils.com.hanhan.sqlBatch;

import hanhan.entity.goodsEntity.goodsDetail.GoodsDetail;
import hanhan.entity.goodsEntity.goodsID.GoodsID;
import hanhan.utils.com.hanhan.jdbcUtil;
import hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.goods.DoYuanFeng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*#{item.goodsid,jdbcType=VARCHAR},#{item.weight,jdbcType=VARCHAR},
#{item.brandName,jdbcType=VARCHAR},#{item.category,jdbcType=VARCHAR},
#{item.goodsname,jdbcType=VARCHAR},#{item.place_production,jdbcType=VARCHAR},
#{item.goodsbarcode,jdbcType=VARCHAR},#{item.unit,jdbcType=VARCHAR},
#{item.prodescription,jdbcType=VARCHAR},#{item.specification,jdbcType=VARCHAR},
#{item.pubflag,jdbcType=VARCHAR}*/
public class BatchGoodsDetailTemp {
	Logger log = LogManager.getLogger(DoYuanFeng.class.getName());
	// 全局参数									
		private static Connection con=null;									
		private PreparedStatement pstmt;									
		private ResultSet rs;		
		public void save(List<GoodsDetail> list) {									
			// SQL
			String sql = "insert into shang_pin_xiang_qing_lin_shi_ku(goodsid,weight,brandName,category,goodsname,place_production,goodsbarcode,unit,prodescription,specification,pubflag)values(?,?,?,?,?,?,?,?,?,?,?)";
			try {								
				// 获取唯一连接
				if(con==null){
					con = jdbcUtil.getConnection();	
				}					
				// 创建stmt 							
				pstmt = con.prepareStatement(sql); // 【预编译SQL语句】  							
				for (int i=0; i<list.size(); i++) {							
					try {
						GoodsDetail goodsDetail = list.get(i);						
						// 设置参数						
						pstmt.setString(1, goodsDetail.getGoodsid());
						pstmt.setString(2, goodsDetail.getWeight());
						pstmt.setString(3, goodsDetail.getBrandName());
						pstmt.setString(4, goodsDetail.getCategory( ));
						pstmt.setString(5, goodsDetail.getGoodsname());
						pstmt.setString(6, goodsDetail.getPlace_production( ));
						pstmt.setString(7, goodsDetail.getGoodsbarcode());
						pstmt.setString(8, goodsDetail.getUnit());
						pstmt.setString(9, goodsDetail.getProdescription());
						pstmt.setString(10, goodsDetail.getSpecification());
						pstmt.setString(11, goodsDetail.getPubflag());
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
