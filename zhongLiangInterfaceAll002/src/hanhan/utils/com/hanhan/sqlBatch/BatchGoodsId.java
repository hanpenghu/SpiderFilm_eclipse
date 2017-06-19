package hanhan.utils.com.hanhan.sqlBatch;

import hanhan.entity.goodsEntity.GoodsPool;
import hanhan.entity.goodsEntity.goodsID.GoodsID;
import hanhan.utils.com.hanhan.jdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class BatchGoodsId {
	// 全局参数									
	private static Connection con=null;									
	private PreparedStatement pstmt;									
	private ResultSet rs;		
	public void save(List<GoodsID> list) {									
		// SQL
		String sql = "insert into suo_you_shang_pin_id_lin_shi_ku (itemid) values (?)";
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
					GoodsID goodsID = list.get(i);						
					// 设置参数						
					pstmt.setString(1, goodsID.getItemid());					
					// 添加批处理						
					pstmt.addBatch();					// 【不需要传入SQL】
					// 测试：每50条执行一次批处理						
					if (i % 50 == 0) {						
						// 批量执行 					
						pstmt.executeBatch();					
						// 清空批处理					
						pstmt.clearBatch();					
					}
				} catch (Exception e) {e.printStackTrace();}						
			}							
			// 批量执行 							
			pstmt.executeBatch();							
			// 清空批处理							
			pstmt.clearBatch();							
		} catch (Exception e) {								
			e.printStackTrace();							
		} finally {								
			jdbcUtil.close(null, pstmt, rs);							
		}								
	}
}
