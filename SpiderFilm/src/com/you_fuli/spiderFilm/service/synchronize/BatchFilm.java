package com.you_fuli.spiderFilm.service.synchronize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sqlUtils.jdbcUtil;
import com.you_fuli.spiderFilm.dto.SpiderFilmlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderRegionlistOrg;

public class BatchFilm {
	Logger log = LogManager.getLogger(this.getClass( ).getName());
	// 全局参数									
			private static Connection con;									
			private PreparedStatement pstmt;									
			private ResultSet rs;		
		public void save(List<SpiderFilmlistOrg> list) {									
			// SQL
			String sql = "insert into Spider_filmList_org(filmId,filmName,englishName,language,duration,dimensional,country,director,actor,openingDate,catalog,picture,description)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try {								
				// 获取连接							
				con = jdbcUtil.getConnection();							
				// 创建stmt 							
				pstmt = con.prepareStatement(sql); // 【预编译SQL语句】  							
				for (int i=0; i<list.size(); i++) {							
					try {
						SpiderFilmlistOrg s = list.get(i);	
						if(s!=null){
							// 设置参数
							pstmt.setString(1, s.getFilmid());
							pstmt.setString(2, s.getFilmname());
							pstmt.setString(3, s.getEnglishname());
							pstmt.setString(4, s.getLanguage());
							pstmt.setString(5, s.getDuration());
							pstmt.setString(6, s.getDimensional());
							pstmt.setString(7, s.getCountry());
							pstmt.setString(8, s.getDirector());
							pstmt.setString(9, s.getActor());
							pstmt.setString(10, s.getOpeningdate());
							pstmt.setString(11, s.getCatalog());
							pstmt.setString(12, s.getPicture());
							pstmt.setString(13, s.getDescription());
			
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
