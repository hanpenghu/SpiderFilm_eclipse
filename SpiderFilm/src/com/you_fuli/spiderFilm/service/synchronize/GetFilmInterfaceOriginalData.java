package com.you_fuli.spiderFilm.service.synchronize;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.utilsOfHanHan.HttpHanHan;
import com.utilsOfHanHan.MD5Utils;

public class GetFilmInterfaceOriginalData extends AbstractAll {

	protected GetFilmInterfaceOriginalData() throws IOException {
		super();
	}
	/*orderId	蜘蛛网订单号	字符串	蜘蛛网订单号	N
	status	出票状态	字符串	true:出票成功 false:出票失败	N
	confirmationId	机器取票码	字符串	例如：
	12345678或123456|654321
	2码使用|分隔，机器取票可能有2个码，比如：金逸	N
	partnerbookingid	柜台取票码	字符串	12345678或123456|654321
	2码使用|分隔，柜台取票可能有1个码，比如：火凤凰	Y
	content	取票信息	字符串	包含出票码，取票方式。
	取票码为%s，请在蜘蛛网取票机上取票	N
	params	json报文	字符串	除params和sign参数外，其余参数组装成json格式。需要URLDecoder解码	
	sign	签名	字符串	Md5(orderId + status + confirmationId + partnerbookingid + content + key + 私钥)	N
	这个接口由于没有确定那个
				params	json报文	字符串	除params和sign参数外，其余参数组装成json格式。需要URLDecoder解码
	怎么拼写, 蜘蛛网说可以不调了
	*/
	public String getNotify(String orderId,String status,String confirmationId,String partnerbookingid,String content){
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("orderId",orderId);
			params.put("status",status);
			params.put("confirmationId",confirmationId);
			params.put("partnerbookingid",partnerbookingid);
			params.put("content",content);
			//还有一个param参数未确定
			params.put("sign", MD5Utils.generatePassword(orderId+status+confirmationId+partnerbookingid+content+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"notifyUrl.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("-------------" + e.getMessage() + "-----------",e);
		}
		return null;
	}
	
	public String getOrderStatus(String orderId){
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("orderId",orderId);
			params.put("sign", MD5Utils.generatePassword(orderId+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"qryOrderStatus.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("-------------" + e.getMessage() + "-----------",e);
		}
		return null;
	}
	
	public String getShowList(String cinemaId,String filmId,String showDate){
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("cinemaId",cinemaId);
			params.put("filmId",filmId);
			params.put("showDate",showDate);
			params.put("sign", MD5Utils.generatePassword(cinemaId+filmId+showDate+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"showList.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("-------------" + e.getMessage() + "-----------",e);
		}
		return null;
	}

	public String getCityList() {
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("sign", MD5Utils.generatePassword(this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"cityList.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("----类GetFilmInterfaceOriginalData下的getCityList方法异常---------" + e.getMessage() + "-----------",e);
		}
		return null;
	}
	
	public String getRegionList(String cityId) {
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("cityId",cityId);
			params.put("sign", MD5Utils.generatePassword(cityId+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"regionList.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("----类GetFilmInterfaceOriginalData下的getRegionList方法异常---------" + e.getMessage() + "-----------",e);
		}
		return null;
	}
	
	
	public String getCinemaList(String cityId) {
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("cityId",cityId);
			params.put("sign", MD5Utils.generatePassword(cityId+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"cinemaList.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("----类GetFilmInterfaceOriginalData下的getRegionList方法异常---------" + e.getMessage() + "-----------",e);
		}
		return null;
	}
	
	
	
	public String getHallList(String cinemaId) {
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("cinemaId",cinemaId);
			params.put("sign", MD5Utils.generatePassword(cinemaId+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"hallList.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("-------------" + e.getMessage() + "-----------",e);
		}
		return null;
	}
	
	
	public String getFilmList(String filmId){
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("filmId",filmId);
			params.put("sign", MD5Utils.generatePassword(filmId+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"filmList.html",params,sendMethod1);
		} catch (Exception e) {log.error("-------------" + e.getMessage() + "-----------",e);}
		
		return null;
	} 
	
	
	public static void main(String[] args) throws IOException {
		System.out.println(new GetFilmInterfaceOriginalData( ).getShowList("31020701","","2014-07-01"));
		/*System.out.println(new GetFilmInterfaceOriginalData( ).getFilmList(""));
		System.out.println();
		System.out.println(new GetFilmInterfaceOriginalData( ).getCityList());
		System.out.println();
		System.out.println(new GetFilmInterfaceOriginalData( ).getRegionList("dongguan"));
		System.out.println();
		System.out.println(new GetFilmInterfaceOriginalData( ).getCinemaList("dongguan"));
		System.out.println();
		System.out.println(new GetFilmInterfaceOriginalData( ).getHallList("01850"));
		System.out.println();
		System.out.println(new GetFilmInterfaceOriginalData( ).getSeatList("01850","446"));*/
	}
	
	
	public String getSeatList(String cinemaId,String hallId) {
		try {
			Map params=new HashMap( );
			params.put("filetype",filetypeJson);
			params.put("key",key);
			params.put("cinemaId",cinemaId);
			params.put("hallId",hallId);
			params.put("sign", MD5Utils.generatePassword(cinemaId+hallId+this.key+this.secret));
			return HttpHanHan.net(this.urlStart+"seatList.html",params,sendMethod1);
		} catch (Exception e) {
			log.error("----类GetFilmInterfaceOriginalData下的getRegionList方法异常---------" + e.getMessage() + "-----------",e);
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
