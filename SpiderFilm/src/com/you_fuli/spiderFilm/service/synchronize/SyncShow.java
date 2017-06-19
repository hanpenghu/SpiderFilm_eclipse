package com.you_fuli.spiderFilm.service.synchronize;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.you_fuli.spiderFilm.dto.SpiderCinemalist;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistExample;
import com.you_fuli.spiderFilm.dto.SpiderShowlistExample;
import com.you_fuli.spiderFilm.dto.SpiderShowlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderShowlistOrgExample;
import com.you_fuli.spiderFilm.utils.NextDate;
import com.you_fuli.spiderFilm.utils.NotEmpty;
import com.you_fuli.spiderFilm.utils.SpringUtil;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderCinemalistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderShowlistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderShowlistOrgMapper;
@Component
public class SyncShow {
	@Autowired
	SpiderShowlistOrgMapper spiderShowlistOrgMapper;
	@Autowired
	SpiderShowlistMapper spiderShowlistMapper;
	private Logger log=LogManager.getLogger(this.getClass().getName());
	@Autowired
	SpiderCinemalistMapper spiderCinemalistMapper;
	private FilmInterfaceStringToEntity filmInterfaceStringToEntity=null;
	private String cinemaId=null;
	
	public SyncShow( ) throws Exception{
		filmInterfaceStringToEntity=new FilmInterfaceStringToEntity( );
	}
	
	public List<String> getAllCimemalId( ){
		SpiderCinemalistExample example=new SpiderCinemalistExample( );
		example.createCriteria().andCinemaidIsNotNull();
		List<SpiderCinemalist> SpiderCinemalists = spiderCinemalistMapper.selectByExample(example);
		if(NotEmpty.notEmpty(SpiderCinemalists)){
			List<String>list=new ArrayList<String>( );
			for(SpiderCinemalist s:SpiderCinemalists){
				list.add(s.getCinemaid());
			}
			if(NotEmpty.notEmpty(list)){
				return list;
			}
		}else{return null;}
		return null;
	}
	/**
	 * 参数addDates是总共要往容器里增加的天数,
	 * */
	public List<String> getAllDate(int addDates){
		List<String>datesList=new ArrayList<String>( );
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date ( );
		datesList.add(sf.format(date));
		for(int n=1;n<=addDates;++n){
			Date nextDay = NextDate.getNextDay(date,+n);
			datesList.add(sf.format(nextDay));
		}
		if(NotEmpty.notEmpty(datesList)){
			return datesList;
		}
		return null;
	}
	
	public void delShowOrg( ){
		SpiderShowlistOrgExample example=new SpiderShowlistOrgExample( );
		example.createCriteria().andIdIsNotNull();
		spiderShowlistOrgMapper.deleteByExample(example);
	}
	public void copyShowOrg( ){
		delShowOrg( );
		Date time0=new Date( );
		log.info("场次同步开始时间--------"+time0+"---------------------");	
		List<String> dateList = getAllDate(6);
		List<String> list = getAllCimemalId();
		List<SpiderShowlistOrg>list0=new ArrayList<SpiderShowlistOrg>( );
		ThreadPoolExecutor exe=new ThreadPoolExecutor(7, 8, 12,TimeUnit.MILLISECONDS, new ArrayBlockingQueue(10));
		for(String date1:dateList){
			try {
				exe.execute(new Run(dateList,list,date1,list0));
			} catch (Exception e) {
				log.error("-------------"+e.getMessage()+"-----------",e);
			}
		}
		while(true){
			if(exe.getActiveCount()==0){
				exe.shutdown();
				break;
			}
		}
		log.info("===同步场次之: 开始插入数据库====");
		if(NotEmpty.notEmpty(list0)){
			new BatchShow( ).save(list0);
		}
		Date time1=new Date( );
		log.info("场次同步结束时间-----------"+time1+"---------------------");
		log.info("场次同步总共时间(秒)-----"+((time1.getTime()-time0.getTime())/1000)+"秒------------------");
	}
	
	class Run implements Runnable{
		List<String> dateList =null;
		List<String> list = null;
		List<SpiderShowlistOrg>list0=null;
		String date1=null;
		Run(List<String> dateList,List<String> list,String date1,List<SpiderShowlistOrg>list0){
			this.dateList=dateList;this.list=list;this.date1=date1;this.list0=list0;
		}
		@Override
		public void run() {
			log.info("--------开启一个场次同步线程---------");
			for(String str:list){
				try {
					List<SpiderShowlistOrg> spiderShowlistsOrg = filmInterfaceStringToEntity.getSpiderShowlistOrg(str,"",date1);
					if(NotEmpty.notEmpty(spiderShowlistsOrg)){
						list0.addAll(spiderShowlistsOrg);
					}
				} catch (Exception e) {
					log.error("-------------"+e.getMessage()+"-----------",e);
				}
			}
		}
		
	}
	
	public void gather( ){
		Date time0=new Date( );
		log.info("场次同步开始时间--------"+time0+"---------------------");	
		System.out.println(getAllCimemalId( ).size());
		copyShowOrg( );
		copyShow( );
		Date time1=new Date( );
		log.info("场次同步结束时间-----------"+time1+"---------------------");
		log.info("场次同步总共时间(秒)-----"+((time1.getTime()-time0.getTime())/1000)+"秒------------------");
	}
	
	private void copyShow() {
		SpiderShowlistOrgExample example=new SpiderShowlistOrgExample( );
		example.createCriteria().andIdIsNotNull();
		long count = spiderShowlistOrgMapper.countByExample(example);
		if(count!=0){
			SpiderShowlistExample example0=new SpiderShowlistExample( );
			example0.createCriteria().andIdIsNotNull();
			spiderShowlistMapper.deleteByExample(example0);
			spiderShowlistOrgMapper.insertIntoSpider_showList( );
		}
		
	}

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		SyncShow syncA = SpringUtil.getBean(SyncShow.class);
		syncA.gather();
		
		

	}

}
