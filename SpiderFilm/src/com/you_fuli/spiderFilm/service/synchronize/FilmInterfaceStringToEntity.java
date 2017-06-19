package com.you_fuli.spiderFilm.service.synchronize;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.you_fuli.spiderFilm.dto.SpiderCinemalistOrg;
import com.you_fuli.spiderFilm.dto.SpiderCitylist;
import com.you_fuli.spiderFilm.dto.SpiderFilmlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderHalllistOrg;
import com.you_fuli.spiderFilm.dto.SpiderRegionlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderSeatlistOrg;
import com.you_fuli.spiderFilm.dto.SpiderShowlistOrg;
import com.you_fuli.spiderFilm.utils.NotEmpty;

public class FilmInterfaceStringToEntity extends GetFilmInterfaceOriginalData{

	public FilmInterfaceStringToEntity() throws IOException {
		super();
	}
	
	public List<SpiderShowlistOrg>getSpiderShowlistOrg(String cinemaId,String filmId,String showDate){
		try {
			JSONArray jsonArray = JSON.parseObject(getShowList(cinemaId, filmId, showDate)).getJSONArray("data");
			if(notEmpty(jsonArray)&&jsonArray.size()!=0){
				List<SpiderShowlistOrg>list=new ArrayList<SpiderShowlistOrg>( );
				for(int n=0;n<jsonArray.size();++n){
					SpiderShowlistOrg s=new SpiderShowlistOrg( );
					JSONObject j = jsonArray.getJSONObject(n);
					s.setShowid(j.getString("showId"));
					s.setCinemaid(j.getString("cinemaId"));
					s.setCinemaname(j.getString("cinemaName"));
					s.setHallid(j.getString("hallId"));
					s.setHallname(j.getString("hallName"));
					s.setFilmid(j.getString("filmId"));
					s.setFilmname(j.getString("filmName"));
					s.setShowdate(j.getString("showDate"));
					s.setShowtime(j.getString("showTime"));
					s.setStaprice(j.getString("staPrice"));
					s.setUserprice(j.getString("userPrice"));
					s.setMerprice(j.getString("merPrice"));
					s.setFeeprice(j.getString("feePrice"));
					s.setLanguage(j.getString("language"));
					s.setDuration(j.getString("duration"));
					s.setDimensional(j.getString("dimensional"));
					s.setActivityid(j.getString("activityId"));
					s.setIsdiscount(j.getString("isDiscount"));
					list.add(s);
				}
				return list;
			}
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		return null;
		
	}
	
	public List<SpiderCitylist> getSpiderCitylist( ){
		try {
			JSONArray jsonArray = JSON.parseObject(getCityList()).getJSONArray("data");
			List<SpiderCitylist>list=new ArrayList<SpiderCitylist>( );
			for(int n=0;n<jsonArray.size();++n){
				SpiderCitylist spiderCitylist=new SpiderCitylist( );
				JSONObject jsonObject = jsonArray.getJSONObject(n);
				spiderCitylist.setCityid(jsonObject.getString("cityId"));
				spiderCitylist.setCityname(jsonObject.getString("cityName"));
				spiderCitylist.setCitytype(jsonObject.getString("cityType"));
				list.add(spiderCitylist);
			}
			return list;
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		return null;
	}
	
	public List<SpiderRegionlistOrg> getSpiderRegionlistOrg(String cityId){
		try {
			JSONArray jsonArray = JSON.parseObject(getRegionList(cityId)).getJSONArray("data");
			List<SpiderRegionlistOrg>list=new ArrayList<SpiderRegionlistOrg>( );
			for(int n=0;n<jsonArray.size();++n){
				SpiderRegionlistOrg spiderRegionlistOrg=new SpiderRegionlistOrg( );
				JSONObject jsonObject = jsonArray.getJSONObject(n);
				spiderRegionlistOrg.setRegionid(jsonObject.getString("regionId"));
				spiderRegionlistOrg.setRegionname(jsonObject.getString("regionName"));
				list.add(spiderRegionlistOrg);
			}
			return list;
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		return null;
	}
	
	public List<SpiderCinemalistOrg>getSpiderCinemalist(String cityId){
		
		try {
			JSONArray jsonArray = JSON.parseObject(getCinemaList(cityId)).getJSONArray("data");
			List<SpiderCinemalistOrg>list=new ArrayList<SpiderCinemalistOrg>( );
			for(int n=0;n<jsonArray.size();++n){
				SpiderCinemalistOrg spiderCinemalist=new SpiderCinemalistOrg( );
				JSONObject jsonObject = jsonArray.getJSONObject(n);
				spiderCinemalist.setRegionid(jsonObject.getString("regionId"));
				spiderCinemalist.setCinemaid(jsonObject.getString("cinemaId"));
				spiderCinemalist.setCinemaname(jsonObject.getString("cinemaName"));
				spiderCinemalist.setCinemalogo(jsonObject.getString("cinemaLogo"));
				spiderCinemalist.setCinemaadd(jsonObject.getString("cinemaAdd"));
				spiderCinemalist.setContact(jsonObject.getString("contact"));
				spiderCinemalist.setGetticketway(jsonObject.getString("getTicketWay"));
				spiderCinemalist.setCityid(jsonObject.getString("cityId"));
				spiderCinemalist.setEndbuydate(jsonObject.getString("endbuyDate"));
				spiderCinemalist.setPresaleday(jsonObject.getString("presaleDay"));
				spiderCinemalist.setLongitude(jsonObject.getString("longitude"));
				spiderCinemalist.setLatitude(jsonObject.getString("latitude"));
				list.add(spiderCinemalist);
			}
			return list;
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		return null;
	}
	
	
	
	public List<SpiderHalllistOrg>getSpiderHalllist(String cinemaId){
		
		try {
			String hallList = getHallList(cinemaId);
			List<SpiderHalllistOrg>list=new ArrayList<SpiderHalllistOrg>( );
			if(notEmpty(hallList)){
				JSONArray jsonArray = JSON.parseObject(hallList).getJSONArray("data");
				if(jsonArray!=null&&jsonArray.size()!=0){
					for(int n=0;n<jsonArray.size();++n){
						SpiderHalllistOrg spiderHalllist=new SpiderHalllistOrg( );
						JSONObject jsonObject = jsonArray.getJSONObject(n);
						spiderHalllist.setHallid(jsonObject.getString("hallId"));
						spiderHalllist.setCinemaid(jsonObject.getString("cinemaId"));
						spiderHalllist.setHallname(jsonObject.getString("hallName"));
						spiderHalllist.setHalltype(jsonObject.getString("hallType"));
						list.add(spiderHalllist);
					}
				}
			}
			return list;
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		return null;
	}
	
	public SpiderSeatlistOrg getSpiderSeatlist(String cinemaId,String hallId){
		
		try {
			if(NotEmpty.allNotEmpty(new Object[]{cinemaId,hallId})){
				String seatListJson = getSeatList(cinemaId,hallId);
				if(notEmpty(seatListJson)){
					JSONObject jsonObject = JSON.parseObject(seatListJson).getJSONObject("data");
					SpiderSeatlistOrg spiderSeatlist=new SpiderSeatlistOrg( );		
//					spiderSeatlist.setHallid(jsonObject.getString("hallId"));
//					spiderSeatlist.setCinemaid(jsonObject.getString("cinemaId"));
					spiderSeatlist.setHallid(hallId);
					spiderSeatlist.setCinemaid(cinemaId);
					spiderSeatlist.setMaxcolumn(jsonObject.getString("maxcolumn"));
					spiderSeatlist.setMaxrownum(jsonObject.getString("maxrowNum"));
					spiderSeatlist.setRow(jsonObject.getString("row"));
					if(NotEmpty.allNotEmpty(new Object[]{hallId,cinemaId,spiderSeatlist.getMaxcolumn(),spiderSeatlist.getMaxrownum(),spiderSeatlist.getRow()})){
						return spiderSeatlist;
					}
				}
			}
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		return null;
	}
	
	
	public List<SpiderFilmlistOrg>getSpiderFilmlistsOrg(String filmId){
		try {
			String filmListJson=getFilmList(filmId);
			if(notEmpty(filmListJson)){
				List<SpiderFilmlistOrg>list=new ArrayList<SpiderFilmlistOrg>( );
				JSONArray jsonArray = JSON.parseObject(filmListJson).getJSONArray("data");
				if(jsonArray!=null&&jsonArray.size()!=0){
					for(int n=0;n<jsonArray.size();++n){
						SpiderFilmlistOrg s=new SpiderFilmlistOrg( );
						JSONObject jsonObject = jsonArray.getJSONObject(n);
						s.setFilmid(jsonObject.getString("filmId"));
						s.setFilmname(jsonObject.getString("filmName"));
						s.setEnglishname(jsonObject.getString("englishName"));
						s.setLanguage(jsonObject.getString("language"));
						s.setDuration(jsonObject.getString("duration"));
						s.setDimensional(jsonObject.getString("dimensional"));
						s.setCountry(jsonObject.getString("country"));
						s.setDirector(jsonObject.getString("director"));
						s.setActor(jsonObject.getString("actor"));
						s.setOpeningdate(jsonObject.getString("openingDate"));
						s.setCatalog(jsonObject.getString("catalog"));
						s.setPicture(jsonObject.getString("picture"));
						s.setDescription(jsonObject.getString("description"));
						list.add(s);
					}
				}
				return list;
			}
		} catch (Exception e) {
			log.error("-------------"+e.getMessage()+"-----------",e);
		}
		return null;
	}
	
	
	public static void main(String[] args) throws IOException {
		System.out.println(new FilmInterfaceStringToEntity( ).getSpiderShowlistOrg("31020701","","2014-07-01"));
//		System.out.println(new FilmInterfaceStringToEntity( ).getSpiderFilmlistsOrg(""));
		/*System.out.println(new FilmInterfaceStringToEntity( ).getSpiderCitylist( ));
		System.out.println(new FilmInterfaceStringToEntity( ).getSpiderRegionlistOrg("lasa"));
		System.out.println(new FilmInterfaceStringToEntity( ).getSpiderCinemalist("lasa"));
		System.out.println(new FilmInterfaceStringToEntity( ).getSpiderHalllist("CMT54010204"));
		System.out.println(new FilmInterfaceStringToEntity( ).getSpiderSeatlist("CMT54010204","06").getRow());*/
	}
	
	
	
	
	
	
	
	public boolean notEmpty(Object ob){
		if(ob==null){
			return false;
		}else{
			if(ob instanceof String){
				if("".equals(ob)){return false;}else{return true;}
			}else{return true;}
		}
	}
	
	
	
	
	

}
