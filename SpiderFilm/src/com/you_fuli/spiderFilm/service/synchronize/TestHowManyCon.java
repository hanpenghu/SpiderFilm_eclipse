package com.you_fuli.spiderFilm.service.synchronize;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sqlUtils.jdbcUtil;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrg;
import com.you_fuli.spiderFilm.service.synchronize.SyncShow.Run;

public class TestHowManyCon {
//	Logger log = LogManager.getLogger(BatchCinema.class.getName());
	// 全局参数									
		private  Connection con;									
		private PreparedStatement pstmt;									
		private ResultSet rs;		
		public void save() {									
			
				// 获取连接							
				con = jdbcUtil.getConnection();	
				System.out.println(con.hashCode());
											
		}
		
		
		public static void main(String[] args){
//			ThreadPoolExecutor exe=new ThreadPoolExecutor(7, 8, 12,TimeUnit.MILLISECONDS, new ArrayBlockingQueue(10));
			for(int i=0;i<10;i++) {
		
				new TestHowManyCon().save();
//				exe.execute(new Run1());
			}
			

		}
		
		
		
		
		
}

class Run1 implements Runnable{

	@Override
	public void run() {
		new TestHowManyCon().save();
		
	}
	
}

