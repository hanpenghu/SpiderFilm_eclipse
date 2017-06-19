package com.you_fuli.spiderFilm.service.synchronize;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderFilmlistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderFilmlistOrgMapper;
import com.you_fuli.spiderFilm.dto.SpiderFilmlistExample;
import com.you_fuli.spiderFilm.dto.SpiderFilmlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderFilmlistOrgExample;
import com.you_fuli.spiderFilm.utils.SpringUtil;
@Component
public class SyncFilm {
	private Logger log=LogManager.getLogger(this.getClass().getName());
	@Autowired
	SpiderFilmlistOrgMapper spiderFilmlistOrgMapper;
	@Autowired
	SpiderFilmlistMapper spiderFilmlistMapper;
	public void delFilmOrg( ){
		SpiderFilmlistOrgExample example=new SpiderFilmlistOrgExample( );
		spiderFilmlistOrgMapper.deleteByExample(example);
	}
	public void delFilm( ){
		SpiderFilmlistExample example=new SpiderFilmlistExample( );
		spiderFilmlistMapper.deleteByExample(example);
	}
	
	public void syncFilmOrg( ){
		long time0=new Date( ).getTime();
		log.info("---FilmOrg---------------同步电影影片详情开始--"+new Date( )+"-----------------");
		try {
			delFilmOrg( );
			List<SpiderFilmlistOrg> spiderFilmlistsOrg = new FilmInterfaceStringToEntity( ).getSpiderFilmlistsOrg("");
			new BatchFilm( ).save(spiderFilmlistsOrg);
		} catch (IOException e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		log.info("--FilmOrg----"+new Date( )+"------------同步电影影片详情----结束,--耗时"+((new Date( ).getTime()-time0)/1000/60)+"分钟-------------");
		
	}
	public void syncFilm( ){
		try {
			 delFilm( );
			spiderFilmlistOrgMapper.insertFilmList();
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
	}
	
	public void gather( ){
		long time0=new Date( ).getTime();
		log.info("------Film------------同步电影影片详情开始--"+new Date( )+"-----------------");
		syncFilmOrg( );
		syncFilm( );
		log.info("----Film----"+new Date( )+"------------同步电影影片详情----结束,--耗时"+((new Date( ).getTime()-time0)/1000/60)+"分钟-------------");
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		SyncFilm sync = SpringUtil.getBean(SyncFilm.class);
		sync.gather();
	}
	
}
