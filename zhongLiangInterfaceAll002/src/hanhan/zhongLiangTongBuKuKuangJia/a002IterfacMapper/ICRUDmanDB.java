package hanhan.zhongLiangTongBuKuKuangJia.a002IterfacMapper;
import java.util.*;

import org.apache.ibatis.annotations.Param;


import hanhan.entity.MenDianTabEntity.Hishop_StoreStock;
import hanhan.entity.MenDianTabEntity.Hishop_Stores;
import hanhan.entity.goodsEntity.GoodsPool;
import hanhan.entity.goodsEntity.Hishop_Categories.Hishop_Categories;
import hanhan.entity.goodsEntity.Hishop_Products.Hishop_Products;
import hanhan.entity.goodsEntity.goodsComments.CommentsObj;
import hanhan.entity.goodsEntity.goodsDetail.GoodsDetail;
import hanhan.entity.goodsEntity.goodsID.GoodsID;
import hanhan.entity.goodsEntity.goodsKuCun.kuCunRuCan.KuCunRuCan;
import hanhan.entity.goodsEntity.goodsPrice.GoodsPriceDetail;
import hanhan.entity.goodsEntity.goodsUp1AndDown0status.GoodsUp1AndDown0Status;
import hanhan.entity.goodsEntity.imageEtity.shang_pin_tu_pian;
import hanhan.entity.goodsEntity.suoYouShangPinZai31GeQuYuDeFenBieKuCun.ProductAreaInventory;
import hanhan.entity.shangPinGuiGeXiangXiBiao.Hishop_SKUs;
import hanhan.utilsOfMd5_32AndPostAPI.pageBean.PageBeanOfHishop_SKUs;
                                                                             
/**********************2016-09-10 15:32:15*********************/             
//CRUD=create_read_update_delete
public interface ICRUDmanDB {//这个是原来测试用的  
/**********************2016-09-10 15:32:22*********************/
	
	//删除整个Hishop_Categories 表
	public void deleteCategoryTb( );
	
	//判断Category表是否存在数据
	
	public Integer isCategoryTbHaveData( );
	
	public Integer isProductsCategoryAssociateHaveData( );
	
	
	
	public void insertShangPinChiHeYeMa(List<GoodsPool> goodPoolList);
	//截断商品池和页码表
	public int deleteAllShangPinYeMaBiao();
	//从库里面选出所有商品页码
	public List<GoodsPool> selectAllShangPinYeMa( );
	//把所有商品id插入临时库
	public int insertLinShiShangPinIdKu(List<GoodsID> itemlist);
	//删除所有商品id
	public int deleteSuoYouShangPinId();
	//查询所有商品id
	public List<GoodsID> queryAllGoodsID();
	/**
	 * 一次取出50个商品的id,将来发给中粮查询商品上下架状态
	 * */
	public List<GoodsID>query50GoodsID(@Param("currP")Integer currP);
	/**
	 * 一次取出若干个GoodsID的通用方法
	 * */
	public List<GoodsID>querySomeGoodsID(@Param("currP")Integer currP,@Param("perPageNum")Integer perPageNum);
	/**
	 * 统计所有商品的id总数//用来分页
	 * */
	public Integer queryAllGoosIDCount();
//////////////////////////////////////////////////////////////////////////////
	//商品详情插入临时表
	public int insertListBiaoShangPinXiangQing(List<GoodsDetail> itemdetail);
	//从商品详情表通过goodsName得到商品在中粮的Id,goodsId
	public String getGoodsIdByGoodsNameInGoodsDetailLinShiTab(@Param("ProductName")String goodsName);
	//删除所有商品详情
	public int deleteAllgoodsDetail();
	//做分页
		//统计所有商品详情总和
		public Integer getCountOfAllGoodsDetail();
	//从商品详情临时库拿到若干详情记录(每条记录完备拿)
		public List<GoodsDetail>getSomeGoodsDetail(@Param("currP")int currPage,@Param("perPageNum")int perPageNum);
/////////////////////////////商品上下架/////////////////////////////////////////////////

	//商品进入商品上下架临时表
	public int insertShangPinShangXiaJia(List<GoodsUp1AndDown0Status>itemstatus);
	//删除所有商品上下架信息
	public int deletAllShangXiaJia( );
///////////////////////商品图片信息///////////////////////////////////////////////////////
	public int insertShangPinTuPianXinXi(List<shang_pin_tu_pian>shang_pin_tu_pianList);
	public int deleteAllTuPian( );
//////////////////////////商品好评度////////////////////////////////////////////////////
	public int insertShangPinHaoPingDu(List<CommentsObj> itemevaluate);
	public int deleteShangPinHaoPingDu( );
////////////////////////商品价格//////////////////////////////////////////////////////
	public int insertShangPinJiaGe(List<GoodsPriceDetail> price);
	public int deleteShangPinJiaGe( );
	public int setSaleStatus0(@Param("goodsId")String goodsId);
//////////////////////////商品库存信息////////////////////////////////////////////////////
	//把中粮区域对照表导入数据库自建临时区域对照表//这个其实不用了,因为我propperties里面已经存在了
	public int insertToQuYuCangKuDuiZhaoBiao(List<KuCunRuCan>areaAndWarehouse);
	//把中粮区域仓库id以及库存以及仓库名字,以及对应的该商品的id导入到区域仓库商品id对应表中
	public int insertToInventory_area_Tab(ProductAreaInventory productAreaInventory);
////插入商品到海商/////////////////////操作Hishop_Products/////////////////////////////////////////////////////
	//删除某条记录
	public int deleteOneOfHishop_Products(Hishop_Products Hishop_Products);
	public int deleteHaiShangProduct();
	public int insertToHaiShangProduct(Hishop_Products Hishop_Products);
	//得到商品的全部productId和ProductName
	public List<Hishop_Products> getAllProductIdAndProductName( );
	//得到若干productId和ProductName
	public List<Hishop_Products> getSomeProductIdAndProductName(@Param("currP")int currPage,@Param("perPageNum")int perPageNum);
	//统计Hishop_Products商品总数
	public Integer getAllCountOfHishop_Products( );
	
	//判断商品是否已经存在
	public int ifExsitProducts(Hishop_Products Hishop_Products);
	//geng xin shang pin shang xia jia xin xi  ,
	public Integer updateSaleStauts(Hishop_Products Hishop_Products);
	//更新商品上下架,description 和   图片路径
	public Integer updateHishop_Products(Hishop_Products hishop_Products);
////插入海商商品分类信息//////////////////////////////////////////////////////////////////////////
	public int insertToHishop_Categories(Hishop_Categories Hishop_CategoriesList);
	//从临时库拿到所有商品详细信息
	public List<GoodsDetail>getAllLinShiKuGoodsDetail( );
	//从临时库拿到若干商品信息//分页
	public List<GoodsDetail>getSomeLinShiKuGoodsDetail( );
	
	//通过goodsid拿到商品详情//从临时库拿到详情
	public GoodsDetail getDetailById(GoodsID GoodsID);
	//从海商库拿到商品详情//通过goodsName拿//返回字符串算了,就不用映射实体
	public String getProductIdInHiShopUseGoodsId(@Param("goodsId")String goodsId);
	
//////////////////////////////////////////////////////////////////////////////
	//得到图片信息
	public shang_pin_tu_pian getImage(GoodsID GoodsID);
	//得到商品价格(从临时库通过id得到)
	public GoodsPriceDetail getPrice( GoodsID GoodsID);
	//为了排除有多个goodsid重复的可能性,得到一组商品价格
	public List<GoodsPriceDetail> getPriceS(GoodsID GoodsID);
////////////////////////往skus规格表中插入数据//////////////////////////////////////////////////////
	public int updateHishop_SKUs(Hishop_SKUs hishop_SKUs);
	public int insertHishop_SKUs1(List<Hishop_SKUs>hishop_SKUsList);
	//插入一条数据
	public int insertHishop_SKUs2(Hishop_SKUs hishop_SKUs);
	//判断该条规格数据是否已经存在于数据库//总数大于0就是存在
	public int isHishop_SKUsExsit(Hishop_SKUs hishop_SKUs);
	//通过productid从商品规格详细表中拿到Skuid
	public Hishop_SKUs getSkuidByProductIdInHishop_SKUs(@Param("ProductId")int ProductId);
	/**
	 * 查询Hishop_skus规格表的总记录条数
	 * */
	public int getAllRecordCountOfHishop_SKUs( );

	/**
	 * 分页查询每一页的商品规格表的信息,实际上我们只需要一个ProductID就好了
	 * 参数beforeCurrentPageTotalRecord是当前页之前的总记录数
	 * */
	public List<Hishop_SKUs> getCurrentPageRecord(@Param("perPageRecord")int perPageRecord,@Param("beforeCurrentPageTotalRecord") int beforeCurrentPageTotalRecord); 
//	public List<Hishop_SKUs> getCurrentPageRecord(PageBeanOfHishop_SKUs pgeBeanOfHishop_SKUs);
	/**
	 * 向商品规格详细表中插入库存,这个库存来自相同productID的门店库存的叠加
	 * */
	public int updateHishop_SKUsStock(@Param("productId")int productId,@Param("stock")int stock);
///////////////////////////操作门店///////////////////////////////////////////////////
	//将三个门店信息一次性取出
	public List<Hishop_Stores> getAllHishop_Stores( );
	//往门店里插入数据
	public int insertHishop_StoreStock(Hishop_StoreStock hishop_StoreStock);
//////////////////////////////////////////////////////////////////////////////
	//判断Hishop_StoreStock中是否已经存在该条数据,注意,只通过StoreId和ProductId来判断(虽然我穿的实体,但是比较的却是这2个字段为标准)
	//通过返回的个数来判断,返回0的话就是没有一个,需要插入一条,返回1的话就是有一条了,需要update
	public int ifExsitHishop_StoreStock(Hishop_StoreStock hishop_StoreStock);
	//update该条数据,通过StoreId和ProductId
	public int updateHishop_StoreStock(Hishop_StoreStock hishop_StoreStock);
	/**
	 * //通过传入的productID在Hishop_StoreStock门店库存中叠加具有相同productID的库存
	 * */
	public Integer addAllStockWhereHaveSameProductID(@Param("productID")int productID);
///////以下是关于物流订单状态由2(已付款)更新为3(已发货)使用的方法///////////////////////////////////////////////////////////////////////
	public Integer chaXunDingDanBiaoZongShuLiang( );
	public Integer chaXunSuoYouYiFuKuanDingDanZongShuLiang(@Param("OrderStatus2")Integer OrderStatus2);
	public List<Map<String,String>> zhaoChuDangQianYeDeOrderIdMapList(@Param("meiYeXianShiShu")int meiYeXianShiShu,@Param("dangQianYe")int dangQianYe,@Param("OrderStatus2")int OrderStatus2);
	public Integer gengXinDingDanZhuangTaiCongYiFuKuanDaoYiFaHuo(@Param("OrderId")String OrderId);
	public Map<String,String> xuanZeZuiZaoYiTiaoBingQieZhuangTaiMaShi2DeDingDanJiLu( );

	public Integer doSelectCategoryHasChild();
	
	
//////////////////////////////////////////////////////////////////////////////                     
}                                                                            
/*******************************************/             