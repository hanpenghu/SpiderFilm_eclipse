package hanhan.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import hanhan.AbstractedOfAll.AbstractedAll;
import hanhan.I.OrderI;
import hanhan.entity.orderEntity.AddRuCanFengZhuangNeiCeng;
import hanhan.entity.orderEntity.AddRuCanFengZhuangWaiCeng;
import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfMd5AndPostZL;
import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfReadProperties;

public class OrderInfo extends AbstractedAll implements OrderI{
//////////////////////////////////////////////////////////////////////////////
	public OrderInfo() {
		// TODO Auto-generated constructor stub
	}
//////////////////////////////////////////////////////////////////////////////
	//通用方法,输入请求的JSON,和读取方法名的properties文件路径(使用资源绑定器路径)后,就会返回一个响应的JSON结果
	public String f(String jsonStr,String propertiesName) {
		try {
			String[ ]strs=UtilsOfReadProperties.getValue("strUrl","method","appkey","appsecret",propertiesName);
			String strUrl1="";String method1=strs[1];String appkey1="";String appsecret1="";
			if(strs[0]==null||strs[0].length()==0||strs[0]==""){strUrl1=strUrl;}else{strUrl1=strs[0];}
			if(strs[2]==null||strs[2].length()==0||strs[2]==""){appkey1=appkey;}else{appkey1=strs[2];}
			if(strs[3]==null||strs[3].length()==0||strs[3]==""){appsecret1=appsecret;}else{appsecret1=strs[3];}
			String param=jsonStr;
			String sign=UtilsOfMd5AndPostZL.getMd5Str(method1+appkey1+appsecret1+param);
			 Map<String,String> params = new HashMap<String,String>();//请求参数
			 params.put("method",method1);
			 params.put("appkey",appkey1);
			 params.put("sign",sign);
			 params.put("param",param);
			String result = UtilsOfMd5AndPostZL.getPostResult(strUrl1, params);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
	@Override
	public String add(List<AddRuCanFengZhuangNeiCeng> addRuCanFengZhuangNeiCengList, AddRuCanFengZhuangWaiCeng addRuCanFengZhuangWaiCeng) {
		try {
			JSONArray order=new JSONArray();
			for(AddRuCanFengZhuangNeiCeng add1:addRuCanFengZhuangNeiCengList){
				JSONObject jsonObject=new JSONObject();
				jsonObject.put("tid",add1.getTid());
				jsonObject.put("oid",add1.getOid());
				jsonObject.put("total_fee",add1.getTotal_fee());
				jsonObject.put("discount_fee",add1.getDiscount_fee());//
				jsonObject.put("adjust_fee",add1.getAdjust_fee());//
				jsonObject.put("iid",add1.getIid());
				jsonObject.put("sku_id",add1.getSku_id());//
				jsonObject.put("num",add1.getNum());
				jsonObject.put("price",add1.getPrice());
				jsonObject.put("outer_iid",add1.getOuter_iid());
				jsonObject.put("payment",add1.getPayment());//
				jsonObject.put("is_oversold",add1.getIs_oversold());//
				jsonObject.put("title",add1.getTitle());
				order.add(jsonObject);
			}
			String str1="\"orders\":{"+"\"order\":"+order.toString( )+"}";
			JSONObject js=new JSONObject();
			js.put("tid",addRuCanFengZhuangWaiCeng.getTid());
			js.put("trade_type",addRuCanFengZhuangWaiCeng.getTrade_type());
			js.put("created",addRuCanFengZhuangWaiCeng.getCreated());
			js.put("end_time",addRuCanFengZhuangWaiCeng.getEnd_time());//
			js.put("buyer_nick",addRuCanFengZhuangWaiCeng.getBuyer_nick());
			js.put("num",addRuCanFengZhuangWaiCeng.getNum());//
			js.put("buyer_message",addRuCanFengZhuangWaiCeng.getBuyer_message());//
			js.put("shipping_type",addRuCanFengZhuangWaiCeng.getShipping_type());//
			js.put("payment",addRuCanFengZhuangWaiCeng.getPayment());
			js.put("discount_fee",addRuCanFengZhuangWaiCeng.getDiscount_fee());
			js.put("adjust_fee",addRuCanFengZhuangWaiCeng.getAdjust_fee());
			js.put("status",addRuCanFengZhuangWaiCeng.getStatus());//
			js.put("pay_time",addRuCanFengZhuangWaiCeng.getPay_time());
			js.put("modified",addRuCanFengZhuangWaiCeng.getModified());//
			js.put("point_fee",addRuCanFengZhuangWaiCeng.getPoint_fee());//
			js.put("total_fee",addRuCanFengZhuangWaiCeng.getTotal_fee());
			js.put("post_fee",addRuCanFengZhuangWaiCeng.getPost_fee());
			js.put("receiver_name",addRuCanFengZhuangWaiCeng.getReceiver_name());
			js.put("receiver_state",addRuCanFengZhuangWaiCeng.getReceiver_state());
			js.put("receiver_city",addRuCanFengZhuangWaiCeng.getReceiver_city());
			js.put("receiver_district",addRuCanFengZhuangWaiCeng.getReceiver_district());
			js.put("receiver_address",addRuCanFengZhuangWaiCeng.getReceiver_address());
			
			js.put("receiver_zip",addRuCanFengZhuangWaiCeng.getReceiver_zip());//
			
			js.put("receiver_mobile",addRuCanFengZhuangWaiCeng.getReceiver_mobile());
			
			
			js.put("receiver_phone",addRuCanFengZhuangWaiCeng.getReceiver_phone());
			js.put("consign_time",addRuCanFengZhuangWaiCeng.getConsign_time());
			js.put("buyer_email",addRuCanFengZhuangWaiCeng.getBuyer_email());
			js.put("commission_fee",addRuCanFengZhuangWaiCeng.getCommission_fee());
			js.put("has_post_fee",addRuCanFengZhuangWaiCeng.getHas_post_fee());
			js.put("cod_fee",addRuCanFengZhuangWaiCeng.getCod_fee());
			js.put("cod_status",addRuCanFengZhuangWaiCeng.getCod_status());
			js.put("promotion",addRuCanFengZhuangWaiCeng.getPromotion());
			js.put("invoice_name",addRuCanFengZhuangWaiCeng.getInvoice_name());
			js.put("express_agency_fee",addRuCanFengZhuangWaiCeng.getExpress_agency_fee());
			js.put("isverifyinventory",addRuCanFengZhuangWaiCeng.getIsverifyinventory());
			js.put("DM_roadNum",addRuCanFengZhuangWaiCeng.getDM_roadNum());
			js.put("DM_storeroomName",addRuCanFengZhuangWaiCeng.getDM_storeroomName());
			js.put("DM_tid2",addRuCanFengZhuangWaiCeng.getDM_tid2());
			js.put("DM_produceStoreId",addRuCanFengZhuangWaiCeng.getDM_produceStoreId());
			js.put("DM_produceStoreName",addRuCanFengZhuangWaiCeng.getDM_produceStoreName());
			js.put("DM_shipmentType",addRuCanFengZhuangWaiCeng.getDM_shipmentType());
			js.put("DM_roadAreaName",addRuCanFengZhuangWaiCeng.getDM_roadAreaName());
			js.put("DM_specialLabel",addRuCanFengZhuangWaiCeng.getDM_specialLabel());
			String str2 = js.toString();
			str2 = str2.substring(0, str2.length()-1)+","+str1+"}";
			//下面一句话就把整个参数拼接完成了
			str2="{\"trade\":{\"trade_add_request\":{\"trade\":"+str2+"}}}";
//			System.out.println(str2);
			String result = f(str2,"hanhan.properties.order.add");
			return result;
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
//////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		List<AddRuCanFengZhuangNeiCeng>nei=new ArrayList<AddRuCanFengZhuangNeiCeng>( );
		AddRuCanFengZhuangNeiCeng a=new AddRuCanFengZhuangNeiCeng( );
		/* "tid": "15091815293651815689",
         "num": 1,
         "iid": "bde1ff38cf953738",
         "oid": "150918152936518156890",
         "outer_iid": "515292",
         "price": 43,
         "title": "进口嘎啦果（盒装 6只）",
         "total_fee": 43*/
			a.setTid("15091815293651815689");
			a.setNum(1);
			a.setIid("bde1ff38cf953738");
			a.setOid("150918152936518156890");
			a.setOuter_iid("515292");
			a.setPrice(43);
			a.setTitle("进口嘎啦果（盒装 6只）");
			a.setTotal_fee(43);
			nei.add(a);
			AddRuCanFengZhuangNeiCeng b=new AddRuCanFengZhuangNeiCeng( );
			/*{
                "tid": "15091815293651815689",
                "num": 1,
                "iid": "a91885b6a4fcb738",
                "oid": "150918152936518156891",
                "outer_iid": "529330",
                "price": 67,
                "title": "进口黑提（盒装1000g）",
                "total_fee": 67
            }*/
			b.setTid("15091815293651815689");
			b.setNum(1);
			b.setIid("a91885b6a4fcb738");
			b.setOid("150918152936518156891");
			b.setOuter_iid("529330");
			b.setPrice(67);
			b.setTitle("进口黑提（盒装1000g）");
			b.setTotal_fee(67);
			nei.add(b);
		/* "adjust_fee": 0,
        "buyer_nick": "俞艳",
        "created": "2015-9-18 15:29:19",
        "discount_fee": 0,
        "payment": 203,
        "pay_time": "2015-9-18 15:29:19",
        "receiver_name": "俞艳",
        "receiver_state": "上海",
        "receiver_city": "上海市",
        "receiver_district": "闸北区",
        "receiver_address": "上海市闸北区广中西路777弄90室",
        "receiver_mobile": "13651828112",
        "post_fee": 15,
        "tid": "15091815293651815689",
        "total_fee": 203,
        "trade_type": "presale",*/
		
		AddRuCanFengZhuangWaiCeng c=new AddRuCanFengZhuangWaiCeng( );
		c.setBuyer_nick("俞艳");
		c.setAdjust_fee(0);
		c.setCreated("2015-9-18 15:29:19");
		c.setDiscount_fee(0);
		c.setPayment(203);
		c.setPay_time("2015-9-18 15:29:19");
		c.setReceiver_name("俞艳");
		c.setReceiver_state("上海");
		c.setReceiver_city("上海市");
		c.setReceiver_district("闸北区");
		c.setReceiver_address("上海市闸北区广中西路777弄90室");
		c.setReceiver_mobile("13651828112");
		c.setPost_fee(15);
		c.setTid("15091815293651815689");
		c.setTotal_fee(203);
		c.setTrade_type("presale");
		String str=new OrderInfo( ).add(nei, c);
		System.out.println(str);	
	}
//////////////////////////////////////////////////////////////////////////////

	
//////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////