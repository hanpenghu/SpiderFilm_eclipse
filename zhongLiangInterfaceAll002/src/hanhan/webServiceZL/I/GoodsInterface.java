package hanhan.webServiceZL.I;

import javax.jws.WebService;

@WebService
public interface GoodsInterface {
	//de dao suo you shang pin chi de pian hao
	public String getAllGoodsPoolId(String jsonStr);
	//输入页面参数,得到该页所有商品id
	public String getAllGoodsIdsWithPageNum(String jsonStr);
	//输入某商品编号得到该商品的详细信息
	public String get1GoodsDetailWithSkuid(String jsonStr);
	//输入一组商品的id,得到该组商品的上下架状态
	public String getGoodsUpOrDownStatuses(String jsonStr);
	//输入一组商品id,得到该组商品的图片信息,主要是图片路径之类
	public String getGoodsImages(String jsonStr);
	//输入一组商品的id,得到改组商品的评论信息
	public String getGoodsComments(String jsonStr);
	//输入一个区域(省份)id或者仓库 id和一组商品ID,得出该区域内这组商品的各个库存数量
	public String getInventoryInfo(String jsonStr);
	//输入一组商品的id,得出该组商品的各个价格
	public String getGoodsPricesWithSkuids(String jsonStr);
////////////////////////order订单//////////////////////////////////////////////////////
	public String orderAdd(String jsonStr);//增加订单
	public String orderConfirm(String jsonStr);//确认订单
	public String orderCancel(String jsonStr);//取消订单
	public String orderQuery(String jsonStr);//查询订单
	public String orderAftersale(String jsonStr);//售后申请
	public String orderAftersaleCancle(String jsonStr);//售后申请取消
	public String orderAftersaleStatus(String jsonStr);//售后单状态查询
	public String orderMessageGet(String jsonStr);//查询商品上下架、价格、订单状态、售后单状态状态变消息
	public String orderMessageDel(String jsonStr);//状态变化消息删除接口
//////////////////////////一下是地区信息////////////////////////////////////////////////////
	public String getAreaMessage(String jsonStr);
////////////////////////////以下是物流信息//////////////////////////////////////////////////
	public String getLogistics(String jsonStr);//物流信息
	public String getPackageMessage(String jsonStr);//包裹信息
////////////////////////////一下是获取区域的对照表的方法//////////////////////////////////////////////////
	public String getAllAreaAndWarehouseInfo();
//////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////