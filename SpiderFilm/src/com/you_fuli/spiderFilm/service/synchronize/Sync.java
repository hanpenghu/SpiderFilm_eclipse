package com.you_fuli.spiderFilm.service.synchronize;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.you_fuli.spiderFilm.utils.NotEmpty;
import com.you_fuli.spiderFilm.utils.SpringUtil;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderCinemalistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderCinemalistOrgMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderCitylistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderHalllistOrgMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderSeatlistOrgMapper;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistExample;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrg;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrgExample;
import com.you_fuli.spiderFilm.dto.SpiderCitylist;
import com.you_fuli.spiderFilm.dto.SpiderCitylistExample;
import com.you_fuli.spiderFilm.dto.SpiderHalllistOrg;
import com.you_fuli.spiderFilm.dto.SpiderHalllistOrgExample;
import com.you_fuli.spiderFilm.dto.SpiderRegionlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderSeatlistOrg;
@Component
public class Sync {
	@Autowired
	SpiderCitylistMapper spiderCitylistMapper;
	@Autowired
	SpiderCinemalistOrgMapper spiderCinemalistOrgMapper;
	@Autowired
	SpiderCinemalistMapper spiderCinemalistMapper;
	@Autowired
	SpiderHalllistOrgMapper spiderHalllistOrgMapper;
	@Autowired
	SpiderSeatlistOrgMapper spiderSeatlistOrgMapper;
	private Logger log=LogManager.getLogger(this.getClass().getName());
	private FilmInterfaceStringToEntity filmInterfaceStringToEntity = null;
	private List<SpiderCitylist> spiderCitylists = null;
	private List<SpiderCinemalistOrg>spiderCinemalistsOrg=null;
	private List<SpiderHalllistOrg>spiderHalllistsOrg=null;
	
	public void setSpiderHalllistsOrg() {
		SpiderHalllistOrgExample example=new SpiderHalllistOrgExample( );
		example.createCriteria().andHallidIsNotNull().andCinemaidIsNotNull();
		spiderHalllistsOrg=spiderHalllistOrgMapper.selectByExample(example);
	}
	
	public void setSpiderCitylistsOrg() {
		SpiderCitylistExample example=new SpiderCitylistExample( );
		example.createCriteria().andCityidIsNotNull();
		spiderCitylists = spiderCitylistMapper.selectByExample(example);
	}
	
	public void setSpiderCinemalistOrg( ){
		SpiderCinemalistOrgExample example=new SpiderCinemalistOrgExample( );
		example.createCriteria().andCinemaidIsNotNull();
		spiderCinemalistsOrg=spiderCinemalistOrgMapper.selectByExample(example);
	}
	
	public Sync( ) throws IOException{
		filmInterfaceStringToEntity = new FilmInterfaceStringToEntity( );
	}
	
	public void copyCity( ){
		try {
				new BatchCity( ).save(filmInterfaceStringToEntity.getSpiderCitylist());
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
	}
	//先有copyCity方法,再有下面这个方法copyRegion
	public void copyCityRegionOrg(){
		long time = new Date( ).getTime();
		log.info("===========开始同步城市和地区的对照表================");
		for(SpiderCitylist spiderCitylist:spiderCitylists){
			List<SpiderRegionlistOrg> spiderRegionlistsOrg = filmInterfaceStringToEntity.getSpiderRegionlistOrg(spiderCitylist.getCityid());
			for(SpiderRegionlistOrg spiderRegionlistOrg:spiderRegionlistsOrg){
				spiderRegionlistOrg.setCityid(spiderCitylist.getCityid());
				spiderRegionlistOrg.setCityname(spiderCitylist.getCityname());
				spiderRegionlistOrg.setCitytype(spiderCitylist.getCitytype());
			}
			new BatchCityRegion( ).save(spiderRegionlistsOrg);
		}
		log.info("===========结束同步城市和地区的对照表================");
		log.info("===========同步时间:"+((new Date( ).getTime()-time)/1000)+"秒钟================");
	}
	
	
	public void copyCinemaOrg( ){
		long time = new Date( ).getTime();
		log.info("===========开始同步影院表================");
		 List<SpiderCinemalistOrg> list=new ArrayList<SpiderCinemalistOrg>( );
		for(SpiderCitylist spiderCitylist:spiderCitylists){
			list.addAll(filmInterfaceStringToEntity.getSpiderCinemalist(spiderCitylist.getCityid()));
		}
		new BatchCinema().save(list);
		log.info("===========结束同步影院表===用时:"+((new Date( ).getTime()-time)/1000)+"秒钟=============");
	}
	
	
	public void copyHallOrg( ){
		long time = new Date( ).getTime();
		log.info("===========开始同步影厅表================");
		List<SpiderHalllistOrg> list=new ArrayList<SpiderHalllistOrg>( );
		for(SpiderCinemalistOrg spiderCinemalist:spiderCinemalistsOrg){
			List<SpiderHalllistOrg> spiderHalllist = filmInterfaceStringToEntity.getSpiderHalllist(spiderCinemalist.getCinemaid());
			if(spiderHalllist!=null&&spiderHalllist.size()>0){
				list.addAll(spiderHalllist);
			}	
		}
		new BatchHall( ).save(list);
		log.info("===========结束同步影厅表===用时:"+((new Date( ).getTime()-time)/1000)+"秒钟=============");
	}
	
	
	public void copySeatOrg( ){
		long time = new Date( ).getTime();
		log.info("===========开始同步座位================");
		if(NotEmpty.notEmpty(spiderHalllistsOrg)){
			List<SpiderSeatlistOrg> list=new ArrayList<SpiderSeatlistOrg>( );
			for(SpiderHalllistOrg spiderHalllist :spiderHalllistsOrg){
				try {
					SpiderSeatlistOrg spiderSeatlist = filmInterfaceStringToEntity.getSpiderSeatlist(spiderHalllist.getCinemaid(),spiderHalllist.getHallid());
					if(spiderSeatlist!=null){
						spiderSeatlistOrgMapper.insertNoId(spiderSeatlist);
					}
				} catch (Exception e) {log.error("-------------"+e.getMessage()+"-----------",e);}
			}
		}
		log.info("===========结束同步座位表===用时:"+((new Date( ).getTime()-time)/1000)+"秒钟=============");
	}
	
	
	
	
	@Scheduled(cron = "0 00 08 * * ?")//早上8点开始同步
	public void gather( ){
		long time = new Date( ).getTime();
		log.info("===========总开始时间"+(new Date( ))+"================");
		SyncAssort syncAssort = SpringUtil.getBean(SyncAssort.class);
		
		syncAssort.delCity();
		copyCity();
		
		setSpiderCitylistsOrg();//zhu yi "set" fangfa de ciXu
		syncAssort.delRegionOrg();
		copyCityRegionOrg();
		syncAssort.syncRegion( );
		
		syncAssort.delCinemaOrg();
		copyCinemaOrg( );
		syncAssort.syncCinema();
		
		setSpiderCinemalistOrg( );
		syncAssort.delHallOrg( );
		copyHallOrg( );
		syncAssort.syncHall();
		
		setSpiderHalllistsOrg();
		syncAssort.delSeatOrg( );
		copySeatOrg( );
		syncAssort.syncSeat();
		
		log.info("===========总的同步结束===用时:"+((new Date( ).getTime()-time)/1000)+"秒钟=============");
	}
	
	@Scheduled(initialDelay=20000,fixedDelay=15*60*1000)//10分钟一次
	public void gatherFilm( ){//不依赖任何其他表,不必判断其他表有无数据
		SyncFilm syncFilm = SpringUtil.getBean(SyncFilm.class);
		syncFilm.gather();
	}
	
	@Scheduled(initialDelay=20000,fixedDelay=15*60*1000)//10分钟一次
	public void gatherShow( ){
		SpiderCinemalistExample example=new SpiderCinemalistExample( );
		example.createCriteria().andIdIsNotNull();
		//注意:场次同步的时候影厅表必须有数据
		if(spiderCinemalistMapper.countByExample(example)>10){
			SyncShow syncShow = SpringUtil.getBean(SyncShow.class);
			syncShow.gather();
		}
	}
	
	//轮询订单状态
	@Scheduled(initialDelay=20000,fixedDelay=2*60*1000)//2分钟一次
	public void syncStauts( ){
		SpringUtil.getBean(SyncStatus.class).syncStatus();
	}
	
	/*@Scheduled(initialDelay=1300,fixedDelay=2000)
	public void testScheduled(){
		System.out.println("你好！！！我是实验定时任务的！！");
		
	}*/
/*	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Sync sync = SpringUtil.getBean(Sync.class);
//		sync.syncStauts( );
//		sync.gather();
//		sync.gatherFilm( );
		
	}*/
	
}
