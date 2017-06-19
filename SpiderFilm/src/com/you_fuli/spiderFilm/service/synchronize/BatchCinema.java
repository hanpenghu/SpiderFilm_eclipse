package com.you_fuli.spiderFilm.service.synchronize;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.sqlUtils.jdbcUtil;
import com.you_fuli.spiderFilm.dto.SpiderCinemalist;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrg;

public class BatchCinema {
		Logger log = LogManager.getLogger(BatchCinema.class.getName());
	// 全局参数									
		private static Connection con;									
		private PreparedStatement pstmt;									
		private ResultSet rs;		
		public void save(List<SpiderCinemalistOrg> list) {									
			// SQL
			StringBuffer sb =new StringBuffer("insert into Spider_cinemaList_org");
			sb.append("(cinemaId,cinemaName,cinemaLogo,cinemaAdd,contact,");
			sb.append("getTicketWay,cityId,regionId,endbuyDate,presaleDay,longitude,");		
			sb.append("latitude)values(?,?,?,?,?,?,?,?,?,?,?,?)");
			String sql=sb.toString();
			try {								
				// 获取连接							
				con = jdbcUtil.getConnection();							
				// 创建stmt 							
				pstmt = con.prepareStatement(sql); // 【预编译SQL语句】  							
				for (int i=0; i<list.size(); i++) {							
					try {
						SpiderCinemalistOrg s = list.get(i);
						if(s!=null){
							// 设置参数
							pstmt.setString(1, s.getCinemaid());
							pstmt.setString(2, s.getCinemaname());
							pstmt.setString(3, s.getCinemalogo());
							pstmt.setString(4, s.getCinemaadd());
							pstmt.setString(5, s.getContact());
							pstmt.setString(6, s.getGetticketway());
							pstmt.setString(7, s.getCityid());
							pstmt.setString(8, s.getRegionid());
							pstmt.setString(9, s.getEndbuydate());
							pstmt.setString(10, s.getPresaleday());
							pstmt.setString(11, s.getLongitude());
							pstmt.setString(12, s.getLatitude());
							// 添加批处理						
							pstmt.addBatch();					// 【不需要传入SQL】
						}
						// 测试：每30条执行一次批处理						
						if (i %500 == 0) {					
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

