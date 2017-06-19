package com.you_fuli.spiderFilm.service.synchronize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sqlUtils.jdbcUtil;
import com.you_fuli.spiderFilm.dto.SpiderShowlistOrg;

public class BatchShow {
	Logger log = LogManager.getLogger(this.getClass().getName());
	// 全局参数									
			private static Connection con;									
			private PreparedStatement pstmt;									
			private ResultSet rs;		
		public void save(List<SpiderShowlistOrg> list) {									
			// SQL
			String sql = "insert into Spider_showList_org("
					+"showId," 		
					+"cinemaId,"
					+"cinemaName,"
					+"hallId,"
					+"hallName,"
					+"filmId,"
					+"filmName,"
					+"showDate,"
					+"showTime,"
					+"staPrice,"
					+"userPrice,"
					+"merPrice,"
					+"feePrice,"
					+"language,"
					+"duration,"
					+"dimensional,"
					+"activityId,"
					+"isDiscount"
					+")values"
					+"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try {								
				// 获取连接							
				con = jdbcUtil.getConnection();							
				// 创建stmt 							
				pstmt = con.prepareStatement(sql); // 【预编译SQL语句】  							
				for (int i=0; i<list.size(); i++) {							
					try {
						SpiderShowlistOrg s = list.get(i);
						if(s!=null){
							// 设置参数
							pstmt.setString(1, s.getShowid());
							pstmt.setString(2, s.getCinemaid());
							pstmt.setString(3, s.getCinemaname());
							pstmt.setString(4, s.getHallid());
							pstmt.setString(5, s.getHallname());
							pstmt.setString(6, s.getFilmid());
							pstmt.setString(7, s.getFilmname());
							pstmt.setString(8, s.getShowdate());
							pstmt.setString(9, s.getShowtime());
							pstmt.setString(10, s.getStaprice());
							pstmt.setString(11, s.getUserprice());
							pstmt.setString(12, s.getMerprice());
							pstmt.setString(13, s.getFeeprice());
							pstmt.setString(14, s.getLanguage());
							pstmt.setString(15, s.getDuration());
							pstmt.setString(16, s.getDimensional());
							pstmt.setString(17, s.getActivityid());
							pstmt.setString(18, s.getIsdiscount());
							// 添加批处理						
							pstmt.addBatch();					// 【不需要传入SQL】
						}
						// 测试：每30条执行一次批处理						
						if (i %600 == 0) {					
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
