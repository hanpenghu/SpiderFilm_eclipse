package com.you_fuli.spiderFilm.service.synchronize;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.you_fuli.spiderFilm.dao.mapperJava.SpiderTransactioninfoMapper;
import com.you_fuli.spiderFilm.utils.NotEmpty;
import com.you_fuli.spiderFilm.utils.SpringUtil;
/**
 * 通知蜘蛛网我们的订单状态,只通知false和true,
 * 不通知doing,doing被轮询到最后
 * */
@Component
public class NotifySpiderOrderStatus {
	@Autowired
	SpiderTransactioninfoMapper stm;
	/*orderId	蜘蛛网订单号	字符串
	status	出票状态	字符串
	confirmationId	机器取票码	字符串
	partnerbookingid	柜台取票码	字符串
	content	取票信息	字符串
	params	json报文	字符串
	sign	签名	字符串*/
//订单通知接口由于蜘蛛网自己不知道params参数如何拼写, 可以不调,就是会多一些log
	public void notif(){
		List<Map<String,Object>> list = stm.allFalseAndTrue( );
		if(NotEmpty.notEmpty(list)){
			for(Map<String,Object> map:list){
				
			}
		}
	}
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		NotifySpiderOrderStatus ns=SpringUtil.getBean(NotifySpiderOrderStatus.class);
		ns.notif( );
	}

}
