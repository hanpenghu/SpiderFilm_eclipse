package hanhan.I;

public interface GoodsInterface {
	//de dao suo you shang pin chi de pian hao
	public String getAllGoodsPoolId( );
	//输入页面参数,得到该页所有商品id
	public String getAllGoodsIdsWithPageNum(String pageNum);
	//输入某商品编号得到该商品的详细信息
	public String get1GoodsDetailWithSkuid(String skuid);
	//输入一组商品的id,得到该组商品的上下架状态
	public String getGoodsUpOrDownStatuses(String[] skuids);
	//输入一组商品id,得到该组商品的图片信息,主要是图片路径之类
	public String getGoodsImages(String[ ]skuids);
	//输入一组商品的id,得到改组商品的评论信息
	public String getGoodsComments(String[ ]skuids);
	//以下两个方法:是同属于一个API方法的分割

	//输入一个区域(省份)id和一组商品ID,得出该区域内这组商品的各个库存数量
	public String getInventoryInfoWithProvinceIdAndSkuids(String areaId,String[ ]skuids);
	//输入一个仓库ID和一组商品ID,得出该仓库内该组商品的各个库存
	public String getInventoryInfoWithWarehouseIdAndSkuids(String WarehouseId,String[ ]skuids);
	
	//输入一组商品的id,得出该组商品的各个价格
	public String getGoodsPricesWithSkuids(String[ ]Skuids);
	
}
