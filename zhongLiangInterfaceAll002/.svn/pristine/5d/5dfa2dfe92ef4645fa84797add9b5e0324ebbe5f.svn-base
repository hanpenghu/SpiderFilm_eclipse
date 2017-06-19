package hanhan.webServiceZL.Impl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import org.apache.commons.io.FileUtils;
import hanhan.AbstractedOfAll.AbstractedAll;

import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfMd5AndPostZL;
import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfReadProperties;
import hanhan.webServiceZL.I.GoodsInterface;
@WebService(endpointInterface="hanhan.webServiceZL.I.GoodsInterface") 
public class GoodsInfo extends AbstractedAll implements GoodsInterface {
	//////////////////////////////////////////////////////////////////////////////
	public String f(String jsonStr, String method) {
		try {
			String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret", method);
			String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";
			if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
				strUrl1 = strUrl;
			} else {
				strUrl1 = strs[0];
			}
			if (strs[2] == null || strs[2].length() == 0 || strs[2] == "") {
				appkey1 = appkey;
			} else {
				appkey1 = strs[2];
			}
			if (strs[3] == null || strs[3].length() == 0 || strs[3] == "") {
				appsecret1 = appsecret;
			} else {
				appsecret1 = strs[3];
			}
			String param = jsonStr;
			String sign = UtilsOfMd5AndPostZL.getMd5Str(method1 + appkey1 + appsecret1 + param);
			Map<String, String> params = new HashMap<String, String>();// 请求参数
			params.put("method", method1);
			params.put("appkey", appkey1);
			params.put("sign", sign);
			params.put("param", param);
			String result = UtilsOfMd5AndPostZL.getPostResult(strUrl1, params);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().getAllGoodsPoolId("{}"));
	}*/
	@Override
	public String getAllGoodsPoolId(String jsonStr) {
		try {
			return f(jsonStr,"hanhan.properties.Goods.getAllGoodsPoolId");	 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().getAllGoodsIdsWithPageNum("{\"pagenum\":\"1\"}"));
	}*/
	@Override
	public String getAllGoodsIdsWithPageNum(String jsonStr) {
		try {
			return f(jsonStr,"hanhan.properties.Goods.getAllGoodsIdsWithPageNum");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().get1GoodsDetailWithSkuid("{\"skuid\":\"524955, 522909\"}"));
	}*/
	@Override
	public String get1GoodsDetailWithSkuid(String jsonStr) {
		try {
			return f(jsonStr,"hanhan.properties.Goods.get1GoodsDetailWithSkuid");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().getGoodsUpOrDownStatuses("{\"skuid\":\"524955, 522909\"}"));
	}*/
	@Override
	public String getGoodsUpOrDownStatuses(String jsonStr) {
		try {
			return f(jsonStr,"hanhan.properties.Goods.getGoodsUpOrDownStatuses");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().getGoodsImages("{\"skuid\":\"516785, 524955\"}"));
	}*/
	@Override
	public String getGoodsImages(String jsonStr) {
		try {
			return f(jsonStr,"hanhan.properties.Goods.getGoodsImages");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().getGoodsComments("{\"skuid\":\"516785, 522114\"}"));
	}*/
	@Override
	public String getGoodsComments(String jsonStr) {
		try {
			return f(jsonStr,"hanhan.properties.Goods.getGoodsComments");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ JSONObject js=new JSONObject();
	 * js.put("area",""); js.put("warehouseid","100"); js.put("skuids",
	 * "5178122, 3418933, 5367933, 510986"); System.out.println(js.toString( ));
	 * System.out.println(new GoodsInfo( ).getInventoryInfo(js.toString( ))); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().getInventoryInfo("{\"area\":\"\",\"warehouseid\":\"100\",\"skuids\":\"5178122, 3418933, 5367933, 510986\"}"));
	}*/
	@Override // 沙箱测不到
	public String getInventoryInfo(String jsonStr) {
		try {
		return f(jsonStr,"hanhan.properties.Goods.getInventoryInfoWithProvinceIdAndSkuids");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[] args) {
		System.out.println(
				new GoodsInfo().getGoodsPricesWithSkuids("{\"skuids\": \"5178122, 3418933, 5367933, 510986\"}"));
	}*/

	//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo().getGoodsPricesWithSkuids("{\"skuids\":\"5178122, 3418933, 5367933, 510986\"}"));
	}*/
	@Override
	public String getGoodsPricesWithSkuids(String jsonStr) {
		try {
			return f(jsonStr,"hanhan.properties.Goods.getGoodsPricesWithSkuids");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////

/////////////////////////////一下是订单///and then is the order//////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String orderAdd(String jsonStr) {
		try {
			String result = f(jsonStr, "hanhan.properties.order.add");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	//////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo( ).confirm("{\"supplierorderid\":\"13011111593465886851\"}"));
	 * }
	 */
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String orderConfirm(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.confirm");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo( ).cancel("{\"supplierorderid\":\"739700828496228\"}")); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String orderCancel(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.cancel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo( ).query("{\"supplierorderid\":\"13011111593465886851\"}")); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String orderQuery(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.query");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo( ).aftersale(
	 * "{\"aftersale\":{\"supplierorderid\":\"20150309161221149\",//我买订单号\"worktype\":1,//申请售后类型，1为未收到，2为退货，3为换货\"is_refund\":\"1\",//是否有退款,1为是,0为否\"workinfo\":\"退款\",//备注信息\"detail\":[{\"skuid\":\"95537\",//商品编号\"num\":\"1\",//商品数量\"batchnumber\":\"PC1232\",//批次号\"price\":\"30\"//商品价格},{\"skuid\":\"95538\",\"num\":\"1\",\"batchnumber\":\"PC1232\",\"price\":\"30\"}]}}"
	 * )); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String orderAftersale(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.aftersale");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	@Override // 售后订单取消
	public String orderAftersaleCancle(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.aftersaleCancle");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo(
	 * ).aftersaleCancle("{\"SupplierOrderId\":\"739700828496228\"}")); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String orderAftersaleStatus(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.aftersaleStatus");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo(
	 * ).aftersaleStatus("{\"SupplierOrderId\":\"739700828496228\"}")); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String orderMessageGet(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.messageGet");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo( ).messageGet("{\"type\":\"1\"}")); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * OrderInfo( ).messageDel("{\"type\":\"1\",\"id\":\"1\"}")); }
	 */
	@Override
	public String orderMessageDel(String jsonStr) {
		try {
			return f(jsonStr, "hanhan.properties.order.messageDel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
////////////////////////以下是区域接口,/then we start the area interface/////////////////////////////////////////////////////
	/*public static void main(String[ ] args){ System.out.println(new 
			GoodsInfo( ).getAreaMessage("{\"area_type\":\"3\"}")); }*/
	
	public String getAreaMessage(String jsonStr){
		try {
			return f(jsonStr,"hanhan.properties.getAreaMessage.getAreaMessage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
////////////////////////以下物流//////////////////////////////////////////////////////
	public String getLogistics(String jsonStr){
		try {
			return f(jsonStr,"hanhan.properties.wuLiu.getLogistics");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}//物流信息
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo( ).getLogistics("{\"tid\":\"2133009934334\":}"));
	}*/
//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo( ).getPackageMessage("{\" tid\":\"2133009934334\":}"));
	}*/
	public String getPackageMessage(String jsonStr){
		try {
			return f(jsonStr,"hanhan.properties.wuLiu.getPackageMessage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	};//包裹信息
////////////////////////////得到区域和地区对应关系//////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfo( ).getAllAreaAndWarehouseInfo());
	}*/
	public String getAllAreaAndWarehouseInfo(){
		try {
			String str =File.separator;//得到系统通用分隔符
			//得到classpath的办法
			String path = this.getClass().getResource("/").getPath();
			path+="hanhan"+str+"properties"+str+"areaAndWarehouse"+str+"areaAndWarehouse.properties";
			return FileUtils.readFileToString(new File(path),"UTF-8");		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////
