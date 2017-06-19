package hanhan.utils.com.hanhan.sqlBatch;								
import hanhan.entity.goodsEntity.GoodsPool;
import hanhan.utils.com.hanhan.jdbcUtil;
import hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.goods.DoYuanFeng;

import java.sql.Connection;										
import java.sql.PreparedStatement;										
import java.sql.ResultSet;										
import java.sql.Statement;										
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.support.JdbcUtils;
// 封装所有的与数据库的操作										
public class BatchGoodsPool {		
//	Logger log = LogManager.getLogger(DoYuanFeng.class.getName());
	// 全局参数									
	private static Connection con=null;									
	private PreparedStatement pstmt;									
	private ResultSet rs;									
										
	// 									
	public void save(List<GoodsPool> list) {									
		// SQL								
//		String sql = "insert into shang_pin_chi_ye_ma_he_ming_zi(name,page_num)values(#{item.name,jdbcType=VARCHAR},#{item.page_num,jdbcType=INTEGER})";
		String sql = "insert into shang_pin_chi_ye_ma_he_ming_zi(name,page_num)values(?,?)";
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
					GoodsPool goodsPool = list.get(i);						
					// 设置参数						
					pstmt.setString(1, goodsPool.getName());						
					pstmt.setInt(2, goodsPool.getPage_num());						
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

