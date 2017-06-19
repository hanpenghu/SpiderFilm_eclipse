package com.you_fuli.spiderFilm.service.synchronize;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractAll {
	protected Logger log=LogManager.getLogger(this.getClass().getName());
	protected String urlCe="http://test.spider.com.cn:9391/v2/{商户key}/{method}.html";
	protected String urlZheng="http://filmapi.spider.com.cn/v2/{商户key}/{method}.html";
	protected String urlStart=null;//这个是通用的
	protected String filetypeJson="json";
	protected String filetypeXml="xml";
	protected String sendMethod1="POST";
	protected String sendMethod2="GET";
	protected String key="ceshi";
	protected String secret="0051657786";
	protected AbstractAll() throws IOException{
		try {
			Properties prop=new Properties();
			prop.load(this.getClass().getResourceAsStream("/dataSource.properties"));
			this.urlStart=prop.getProperty("urlStart");
			this.key=prop.getProperty("appkey");
			this.secret=prop.getProperty("appsecret");
		} catch (Exception e) {
			log.error("------加载dataSource.properties失败-------"+e.getMessage()+"-----------",e);
		}
	}
	
}
