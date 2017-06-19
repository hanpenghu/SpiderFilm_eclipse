package hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.tongBuDingDanWuLiuXinXi;
import java.util.*;

import hanhan.AbstractedOfAll.AbstractedAll;
import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfMd5AndPostZL;
import hanhan.zhongLiangTongBuKuKuangJia.a002IterfacMapper.ICRUDmanDB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component("syncLogistics")
public class ZhongLiangTongBuWuLiuZhuangTaiDaoHaiShangDingDanBiao extends AbstractedAll{
	Logger log = LogManager.getLogger(ZhongLiangTongBuWuLiuZhuangTaiDaoHaiShangDingDanBiao.class.getName());
	private static final Integer meiYeXianShiShuo=500;
	private static final Integer OrderStatus2=2;
	private static final String method1="womai.logistics.get";
	@Autowired
	private ICRUDmanDB iCRUDmanDB;
	public ZhongLiangTongBuWuLiuZhuangTaiDaoHaiShangDingDanBiao() {
		super();
	}
	public static void main(String[] args) {
		String[] configs = {"classpath*:hanhan/zhongLiangTongBuKuKuangJia/xml/b003SpringXml/spring.xml"};  
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
		ZhongLiangTongBuWuLiuZhuangTaiDaoHaiShangDingDanBiao syncLogistics=(ZhongLiangTongBuWuLiuZhuangTaiDaoHaiShangDingDanBiao)ctx.getBean("syncLogistics");
		//syncLogistics.synchrnizeLogisticsShiYongFenYe( );
		syncLogistics.synchrnizeLogisticsShiYongFenYe();
	}
//	 @Scheduled(cron ="0 50 18 * * ?")
//	@Scheduled(initialDelay=360000000,fixedDelay=3600000)//shangYiCiJieShuHouTuiChiYiXiaoShiKaiShiXiaYiCi
	//guDingMeiXiaoShiZhiXingYiCi
//	 @Scheduled(initialDelay=360000000,fixedRate=3600000)//1xiaoShiZhiXingYiCi
	@Scheduled(initialDelay=10000,fixedRate=7200000)
	public void synchrnizeLogisticsShiYongFenYe( ){
		 System.out.println("-----物流状态同步开始!!!---------");
		try {
			Integer yiFuKuanZongShuLiangYongLaiFenYe = iCRUDmanDB.chaXunSuoYouYiFuKuanDingDanZongShuLiang(OrderStatus2);
			System.out.println("-------已付款总数量用来分页="+yiFuKuanZongShuLiangYongLaiFenYe);
			if(yiFuKuanZongShuLiangYongLaiFenYe>0){
				Integer suoYouDingDanZongShuLiang = iCRUDmanDB.chaXunDingDanBiaoZongShuLiang();
				System.out.println("---------所有订单总数量="+suoYouDingDanZongShuLiang);
				Integer zongYeShu=null;
				if(suoYouDingDanZongShuLiang%meiYeXianShiShuo==0){
					zongYeShu=suoYouDingDanZongShuLiang/meiYeXianShiShuo;
				}else{
					zongYeShu=suoYouDingDanZongShuLiang/meiYeXianShiShuo+1;
				}
				for(int n=0;n<zongYeShu;++n){
					try {
						int dangQianYe=n+1;
						List<Map<String,String>> dangQianYeOrderIdMapList = iCRUDmanDB.zhaoChuDangQianYeDeOrderIdMapList(meiYeXianShiShuo,dangQianYe,OrderStatus2);
						for(Map<String,String> mapDangQianYiTiaoJiLu:dangQianYeOrderIdMapList){
							try {
								String OrderId = mapDangQianYiTiaoJiLu.get("OrderId");
								String tuiSongDingDanHouZhongLiangFanHuiJieGuo = tuiSongDingDan(OrderId);
								
								log.error("----------------[[推送订单后中粮返回结果="+tuiSongDingDanHouZhongLiangFanHuiJieGuo+"]]-------------------");
								System.out.println("[[推动订单后中粮返回结果="+tuiSongDingDanHouZhongLiangFanHuiJieGuo+"]]");
								
								if(tuiSongDingDanHouZhongLiangFanHuiJieGuo.contains("logistics")){
									Integer gengXinDingDanZongShu = iCRUDmanDB.gengXinDingDanZhuangTaiCongYiFuKuanDaoYiFaHuo(OrderId);
									log.error("---------------更新订单总数="+gengXinDingDanZongShu+"-----------------------");
									System.out.println("------------更新订单总数="+gengXinDingDanZongShu);
									if(gengXinDingDanZongShu==1){
										
										log.error("---------------[[订单号为"+OrderId+"--的订单更新!!!!]]-----------------------");
										System.out.println("[[订单号为--"+OrderId+"--的订单更新!!!!]]");
										
									}else{log.error("---------------[[订单号为--"+OrderId+"--的订单更新!!!!]]-----------------------");System.out.println("[[订单号为--"+OrderId+"--的订单没有更新!!!!]]");}
								}else{log.error("---------------[[[[该订单暂未发货！！]]!!!!]]-----------------------");System.out.println("[[该订单暂未发货！！]]");}
							} catch (Exception e) {log.error(e.getMessage());}
						}
					} catch (Exception e) {log.error(e.getMessage());}
				}
			}else{log.error("---------[[订单表中没有已付款状态码为2的状态!!]]----------");System.out.println("[[订单表中没有已付款状态码为2的状态!!]]");}
		} catch (Exception e) {log.error("----------"+e.getMessage()+"--------");}
	}
	// zhe ge fang fa he xia mian yi ge fang fa xuan yi ge jiu hao le 
	//select top(1) OrderId from Hishop_Orders where OrderStatus=2 order by UpdateDate asc
	//zhe zhong fang fa hui dao zhi: dang di yi tiao yi zhi mei you wu liu fa huo zhuang tai,zui hou yong yuan tui song de shi di yi tiao,qi ta ke hu de ji lu de bu dao tui song 
//	@Scheduled(initialDelay=360000000,fixedRate=3600000)
	//@Scheduled(initialDelay=20000,fixedRate=3600000)
	public void tongBuWuLiuZhuangTaiBuShiYongFenYeMeiCiQuZuiZaoYiGe(){
		System.out.println("---------------开始了！！！！-------------------------");
		Integer yiFuKuanZongShuLiang = iCRUDmanDB.chaXunSuoYouYiFuKuanDingDanZongShuLiang(OrderStatus2);
		System.out.println("yiFuKuanZongShuLiang="+yiFuKuanZongShuLiang);
		if(yiFuKuanZongShuLiang!=0){
			for(int n=0;n<yiFuKuanZongShuLiang;++n){
				Map<String, String> zuiZaoYiGeMap = iCRUDmanDB.xuanZeZuiZaoYiTiaoBingQieZhuangTaiMaShi2DeDingDanJiLu( );
				if(zuiZaoYiGeMap.size()!=0){
					String OrderId = zuiZaoYiGeMap.get("OrderId");
					if(OrderId!=null){
						
						String tuiSongDingDanHouZhongLiangFanHuiJieGuo = tuiSongDingDan(OrderId);
						
						
						log.debug("tuiSongDingDanHouZhongLiangFanHuiJieGuo="+tuiSongDingDanHouZhongLiangFanHuiJieGuo);
						System.out.println("-------------tuiSongDingDanHouZhongLiangFanHuiJieGuo="+tuiSongDingDanHouZhongLiangFanHuiJieGuo+"--------------------");
						
						if(tuiSongDingDanHouZhongLiangFanHuiJieGuo.contains("logistics")){
							
							Integer gengXinJiLuShu = iCRUDmanDB.gengXinDingDanZhuangTaiCongYiFuKuanDaoYiFaHuo(OrderId);
							
							
							log.debug("----------------gengXinJiLuShu="+gengXinJiLuShu+"-------------------");
							System.out.println("gengXinJiLuShu="+gengXinJiLuShu);
						}
					}
				}
			}
		}
	}

	
	
	
	public String tuiSongDingDan(String OrderId){
		String tuiSongJSON="{\"tid\":\""+OrderId+"\"}";
		String sign = UtilsOfMd5AndPostZL.getMd5Str(method1+appkey+appsecret+tuiSongJSON);
		Map<String,String>params=new HashMap<String,String>();
		params.put("method", method1);
		params.put("appkey", appkey);
		params.put("sign", sign);
		params.put("param", tuiSongJSON);
		try {
			String result = UtilsOfMd5AndPostZL.getPostResult(strUrl, params);
			return result;
		} catch (Exception e) {log.error(e.getMessage());}
		return null;
	}
	
	
}
