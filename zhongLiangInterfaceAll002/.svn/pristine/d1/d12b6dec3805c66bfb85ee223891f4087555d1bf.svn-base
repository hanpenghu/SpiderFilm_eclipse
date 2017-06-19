package hanhan.Impl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;

import hanhan.AbstractedOfAll.AbstractedAll;
import hanhan.I.GoodsInterface;
import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfMd5AndPostZL;
import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfReadProperties;

public class GoodsInfo extends AbstractedAll implements GoodsInterface {
	// 无参构造
	public GoodsInfo() {
		super();
	}

	/**
	 * huo de suo you shang pin chi de bian hao
	 */
	@Override
	public String getAllGoodsPoolId() {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getAllGoodsPoolId");*/
			//上面的走了读取文件,下面不再读取,而是硬编码
			/*String[] strs={"","womai.itempagenum.get","",""};
			String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.itempagenum.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			String param = "{}";
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

	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * GoodsInfo( ).getAllGoodsPoolId()); }
	 */
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String getAllGoodsIdsWithPageNum(String pageNum) {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getAllGoodsIdsWithPageNum");*/
			/*String[] strs={"","womai.itemlist.get","",""};
			String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.itemlist.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			String param = "{\"pagenum\":\"" + pageNum + "\"}";
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

	@Override
	public String get1GoodsDetailWithSkuid(String skuid) {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.get1GoodsDetailWithSkuid");*/
			/*String[] strs={"","womai.itemdetail.get","",""};
			String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.itemdetail.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			String param = "{\"skuid\":\"" + skuid + "\"}";
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
	@Override
	public String getGoodsUpOrDownStatuses(String[] skuids) {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getGoodsUpOrDownStatuses");*/
			/*String[] strs={"","womai.itemstatus.get","",""};
			String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.itemstatus.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			// String param="{\"skuid\":\"524955,522909\"}";
			// 拼接字符串
			String param = "{\"skuid\":\"";
			for (int n = 0; n < skuids.length; ++n) {
				if (n == skuids.length - 1) {
					param += skuids[n];
				} else {
					param += (skuids[n] + ",");
				}
			}
			param += "\"}";
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
	@Override
	public String getGoodsImages(String[] skuids) {
		try {//womai.itemimage.get
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getGoodsImages");*/
			/*String[] strs={"","womai.itemimage.get","",""};
			String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.itemimage.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			// 拼接字符串
			String param = "{\"skuid\":\"";
			for (int n = 0; n < skuids.length; ++n) {
				if (n == skuids.length - 1) {
					param += skuids[n];
				} else {
					param += (skuids[n] + ",");
				}
			}
			param += "\"}";
			String sign = UtilsOfMd5AndPostZL.getMd5Str(method1 + appkey1 + appsecret1 + param);
			Map<String, String> params = new HashMap<String, String>();// 请求参数
			params.put("method", method1);
			params.put("appkey", appkey1);
			params.put("sign", sign);
			params.put("param", param);
			String result = UtilsOfMd5AndPostZL.getPostResult(strUrl1, params);
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//////////////////////////////////////////////////////////////////////////////
	@Override
	public String getGoodsComments(String[] skuids) {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getGoodsComments");*/
			/*String[] strs ={"","womai.itemevaluate.get","",""};*/
			/*String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.itemevaluate.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			// 拼接字符串
			String param = "{\"skuid\":\"";
			for (int n = 0; n < skuids.length; ++n) {
				if (n == skuids.length - 1) {
					param += skuids[n];
				} else {
					param += (skuids[n] + ",");
				}
			}
			param += "\"}";
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
	@Override
	public String getInventoryInfoWithProvinceIdAndSkuids(String areaId, String[] skuids) {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getInventoryInfoWithProvinceIdAndSkuids");*/
			/*String[] strs ={"","womai.inventory.get","",""};*/
			/*String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.inventory.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			// {\"area\":\"\",\"warehouseid\":\"100\",\"skuids\":\"5178122,3418933,5367933,510986\"}
			String param = "{\"area\":\"";
			param += areaId + "\",\"warehouseid\":\"\",\"skuids\":\"";

			for (int n = 0; n < skuids.length; ++n) {
				if (n == skuids.length - 1) {
					param += skuids[n];
				} else {
					param += (skuids[n] + ",");
				}
			}
			param += "\"}";
			// System.out.println(param);
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
	@Override
	public String getInventoryInfoWithWarehouseIdAndSkuids(String WarehouseId, String[] skuids) {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getInventoryInfoWithWarehouseIdAndSkuids");*/
			/*String[] strs ={"","womai.inventory.get","",""};*/
			String strUrl1 = strUrl;
			String method1 = "womai.inventory.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			// {\"area\":\"\",\"warehouseid\":\"100\",\"skuids\":\"5178122,3418933,5367933,510986\"}
			String param = "{\"area\":\"\",\"warehouseid\":\"";
			param += WarehouseId + "\",\"skuids\":\"";
			for (int n = 0; n < skuids.length; ++n) {
				if (n == skuids.length - 1) {
					param += skuids[n];
				} else {
					param += (skuids[n] + ",");
				}
			}
			param += "\"}";
			// System.out.println(param);//{"area":"","warehouseid":"10","skuids":"5178122,3418933"}
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
	// 在测试页面也没查到
	@Override
	public String getGoodsPricesWithSkuids(String[] skuids) {
		try {
			/*String[] strs = UtilsOfReadProperties.getValue("strUrl", "method", "appkey", "appsecret",
					"hanhan.properties.Goods.getGoodsPricesWithSkuids");*/
			/*String[] strs ={"","womai.price.get","",""};*/
			/*String strUrl1 = "";
			String method1 = strs[1];
			String appkey1 = "";
			String appsecret1 = "";*/
			String strUrl1 = strUrl;
			String method1 = "womai.price.get";
			String appkey1 = appkey;
			String appsecret1 = appsecret;
			/*if (strs[0] == null || strs[0].length() == 0 || strs[0] == "") {
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
			}*/
			// 拼接字符串
			String param = "{\"skuids\":\"";
			for (int n = 0; n < skuids.length; ++n) {
				if (n == skuids.length - 1) {
					param += skuids[n];
				} else {
					param += (skuids[n] + ",");
				}
			}
			param += "\"}";
			// System.out.println(param);
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

	//////////////////////////// 得到区域和地区对应关系//////////////////////////////////////////////////
	/*
	 * public static void main(String[ ] args){ System.out.println(new
	 * GoodsInfo( ).getAllAreaAndWarehouseInfo()); }
	 */
	///zhongLiangInterfaceAll/src/hanhan/properties/areaAndWarehouse/areaAndWarehouse.properties
	public String getAllAreaAndWarehouseInfo() {//通过页面的信息我放入properties文件中
		try {
			String str = File.separator;// 得到系统通用分隔符
			// 得到classpath的办法
			String path = this.getClass().getResource("/").getPath();
			path += "hanhan" + str + "properties" + str + "areaAndWarehouse" + str + "areaAndWarehouse.properties";
			return FileUtils.readFileToString(new File(path), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//////////////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////////////
}
