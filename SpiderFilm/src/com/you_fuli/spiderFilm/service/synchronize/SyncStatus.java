package com.you_fuli.spiderFilm.service.synchronize;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.you_fuli.spiderFilm.dao.mapperJava.SpiderTransactioninfoMapper;
import com.you_fuli.spiderFilm.utils.NotEmpty;
import com.you_fuli.spiderFilm.utils.SpringUtil;
/**
 * 轮询订单状态修改数据库
 * */
@Component
public class SyncStatus {
Logger log=LogManager.getLogger(this);
	GetFilmInterfaceOriginalData getData=null;
	@Autowired
	private SpiderTransactioninfoMapper stm;
	public SyncStatus( ) throws IOException{
		getData = new GetFilmInterfaceOriginalData( );
	}
	
	public void syncStatus( ){
		List<String> allOrds = stm.allOrd();
		log.info("======蜘蛛网订单状态是doing的订单号的个数是:"+allOrds.size()+"个=============================================================");
		log.info("----在订单表中找到的所有状态是doing的蜘蛛网订单号------"+allOrds+"------------");
		if(NotEmpty.notEmpty(allOrds)){
			for(String ord:allOrds){
				log.info("----当前要处理的蜘蛛网状态是doing的订单号------"+ord+"------------");
				if(NotEmpty.notEmpty(ord)){
					String json = getData.getOrderStatus(ord);
					log.info("---通过蜘蛛订单号拿到的订单状态的JSON报文-------"+json+"------------");
					if(NotEmpty.notEmpty(json)){
						JSONObject jo = JSONObject.parseObject(json);
						log.info("---被JSONObject化的蜘蛛报文-------"+jo+"------------");
						if(NotEmpty.notEmpty(jo)){
							JSONObject j = jo.getJSONObject("data");
							log.info("------订单中的实际数据data="+j+"------------");
							if(NotEmpty.notEmpty(j)){
								String status = (String) j.get("status");
								if(NotEmpty.notEmpty(status)){
									if(!("doing".equals(status))){
										Map<String,Object>map=new HashMap<String,Object>( );
										map.put("orderId",j.get("orderId"));
										map.put("status",status);
										map.put("confirmationId",j.get("confirmationId"));
										map.put("partnerbookingid",j.get("partnerbookingid"));
										map.put("content",j.get("content"));
										log.info("----------"+map+"------------");
										stm.updateStatus(map);
									}
								}
							}else{log.error("-----通过蜘蛛的订单的到返回报文json,但具体内容data这个jsonObject是空的------"+j+"-------------");}
						}else{log.error("--"+jo+"-------蜘蛛网返回的该订单对应的jsonObject是个空的,返回有误---------------");}
					}else{log.error("----"+json+"--该订单存在,但是没能用该订单从蜘蛛网拿到返回信息,应该是连接超时或者蜘蛛网本身问题,后者偏重-----------");}
				}else{log.error("-------"+ord+"------该蜘蛛订单不存在,但是存在拿到该订单的状态是doing的记录存在！奇怪了！-----------");}
			}
		}else{log.error("-------"+allOrds+"------订单表不存在状态是doing的订单-----------");}
	}
	
	/*public static void main(String[ ] args){
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		SyncStatus ss = SpringUtil.getBean(SyncStatus.class);
		ss.syncStatus();
	}*/
}
