package com.you_fuli.spiderFilm.service.synchronize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderCitylistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderHalllistMapper;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistExample;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrgExample;
import com.you_fuli.spiderFilm.dto.SpiderCitylistExample;
import com.you_fuli.spiderFilm.dto.SpiderHalllistExample;
import com.you_fuli.spiderFilm.dto.SpiderHalllistOrgExample;
import com.you_fuli.spiderFilm.dto.SpiderRegionlistExample;
import com.you_fuli.spiderFilm.dto.SpiderRegionlistOrgExample;
import com.you_fuli.spiderFilm.dto.SpiderSeatlistExample;
import com.you_fuli.spiderFilm.dto.SpiderSeatlistOrgExample;
import com.you_fuli.spiderFilm.utils.SpringUtil;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderRegionlistOrgMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderSeatlistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderSeatlistOrgMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderCinemalistMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderCinemalistOrgMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderHalllistOrgMapper;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderRegionlistMapper;
@Component
public class SyncAssort {
	@Autowired
	SpiderCitylistMapper SpiderCity;
	@Autowired
	SpiderRegionlistOrgMapper SpiderRegionOrg;
	@Autowired
	SpiderRegionlistMapper SpiderRegion;
	@Autowired
	SpiderCinemalistOrgMapper SpiderCinemaOrg;
	@Autowired
	SpiderCinemalistMapper SpiderCinema;
	@Autowired
	SpiderHalllistOrgMapper SpiderHalllOrg;
	@Autowired
	SpiderHalllistMapper SpiderHalll;
	@Autowired
	SpiderSeatlistOrgMapper SpiderSeatOrg;
	@Autowired
	SpiderSeatlistMapper spiderSeat;
	public void delCity( ){
		SpiderCitylistExample example=new SpiderCitylistExample( );
		example.createCriteria().andCityidIsNotNull();
		SpiderCity.deleteByExample(example);
	}
	
	public void delRegionOrg(){
		SpiderRegionlistOrgExample example=new SpiderRegionlistOrgExample( );
		example.createCriteria().andIdIsNotNull();
		SpiderRegionOrg.deleteByExample(example);
	}
	
	public void syncRegion( ){
		SpiderRegionlistOrgExample sroe=new SpiderRegionlistOrgExample( );
		sroe.createCriteria().andIdIsNotNull();
		//必须等到org表中有数据(代表org同步成功)之后,才能同步主表
		if(SpiderRegionOrg.countByExample(sroe)>0){
			SpiderRegionlistExample example=new SpiderRegionlistExample( );
			example.createCriteria().andIdIsNotNull();
			SpiderRegion.deleteByExample(example);
			SpiderRegionOrg.insertIntoSpiderRegionlist();
		}
		
	}
	
	public void delCinemaOrg(){
		SpiderCinemalistOrgExample example=new SpiderCinemalistOrgExample( );
		example.createCriteria().andIdIsNotNull();
		SpiderCinemaOrg.deleteByExample(example);
	}
	
	public void syncCinema( ){
		SpiderCinemalistOrgExample example0=new SpiderCinemalistOrgExample( );
		example0.createCriteria().andIdIsNotNull();
		if(SpiderCinemaOrg.countByExample(example0)>0){
			SpiderCinemalistExample example=new SpiderCinemalistExample( );
			example.createCriteria().andIdIsNotNull();
			SpiderCinema.deleteByExample(example);
			SpiderCinemaOrg.insertIntoSpiderCinemalist();
		}
	}
	
	public void delHallOrg( ){
		SpiderHalllistOrgExample example=new SpiderHalllistOrgExample( );
		example.createCriteria().andIdIsNotNull();
		SpiderHalllOrg.deleteByExample(example);
	}
	
	public void syncHall( ){
		SpiderHalllistOrgExample example0=new SpiderHalllistOrgExample( );
		example0.createCriteria().andIdIsNotNull();
		if(SpiderHalllOrg.countByExample(example0)>0){
			SpiderHalllistExample example=new SpiderHalllistExample( );
			example.createCriteria().andIdIsNotNull();
			SpiderHalll.deleteByExample(example);
			SpiderHalllOrg.insertIntoSpiderHalllist();
		}
	}
	
	public void delSeatOrg( ){
		SpiderSeatlistOrgExample example =new SpiderSeatlistOrgExample();
		example.createCriteria().andIdIsNotNull();
		SpiderSeatOrg.deleteByExample(example);
	}
	
	public void syncSeat( ){
		SpiderSeatlistOrgExample example0=new SpiderSeatlistOrgExample( );
		example0.createCriteria().andIdIsNotNull();
		if(SpiderSeatOrg.countByExample(example0)>0){
			SpiderSeatlistExample example=new SpiderSeatlistExample( );
			example.createCriteria().andIdIsNotNull();
			spiderSeat.deleteByExample(example);
			SpiderSeatOrg.insertIntoSpiderSeatlist();
		}
		
	}
	
	
	public void gather( ){
		/*delCity( );
		 delRegionOrg();
		 delCinemaOrg();
		 delHallOrg( );
		delSeatOrg( );*/
//		syncRegion( );
//		syncCinema( );
		//syncHall( );
		syncSeat( );
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		SyncAssort syncA = SpringUtil.getBean(SyncAssort.class);
		syncA.gather();
	}
	
	
}
