package com.you_fuli.spiderFilm.service.synchronize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sqlUtils.jdbcUtil;
import com.you_fuli.spiderFilm.dto.SpiderHalllist;
import com.you_fuli.spiderFilm.dto.SpiderHalllistOrg;

public class BatchHall {
	Logger log = LogManager.getLogger(BatchHall.class.getName());
	// 全局参数									
			private static Connection con;									
			private PreparedStatement pstmt;									
			private ResultSet rs;		
		public void save(List<SpiderHalllistOrg> list) {									
			// SQL
			String sql = "insert into Spider_hallList_org(hallId,hallName,cinemaId,hallType)values(?,?,?,?)";
			try {								
				// 获取连接							
				con = jdbcUtil.getConnection();							
				// 创建stmt 							
				pstmt = con.prepareStatement(sql); // 【预编译SQL语句】  							
				for (int i=0; i<list.size(); i++) {							
					try {
						SpiderHalllistOrg s = list.get(i);
						if(s!=null){
							// 设置参数
							pstmt.setString(1, s.getHallid());
							pstmt.setString(2, s.getHallname());
							pstmt.setString(3, s.getCinemaid());
							pstmt.setString(4, s.getHalltype());
							// 添加批处理						
							pstmt.addBatch();					// 【不需要传入SQL】
						}
						
						// 测试：每30条执行一次批处理						
						if (i %300 == 0) {					
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
				jdbcUtil.close(con, pstmt, rs);							
			}								
		}
}
