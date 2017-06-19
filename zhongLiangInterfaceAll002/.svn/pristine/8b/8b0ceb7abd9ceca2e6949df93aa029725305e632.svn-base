package hanhan.Impl;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import hanhan.entity.goodsEntity.GoodsPoolList;
import hanhan.entity.goodsEntity.goodsComments.CommentsObjList;
import hanhan.entity.goodsEntity.goodsDetail.GoodsDetailList;
import hanhan.entity.goodsEntity.goodsID.GoodsIDList;
import hanhan.entity.goodsEntity.goodsKuCun.KuCunList;
import hanhan.entity.goodsEntity.goodsPrice.GoodsPriceList;
import hanhan.entity.goodsEntity.goodsUp1AndDown0status.GoodsUp1AndDown0StatusList;
import hanhan.entity.goodsEntity.imageDetail.ImageDetailObj;
import hanhan.entity.goodsEntity.imageDetail.ImageDetailObjList;
public class GoodsInfoToEntity extends GoodsInfo{
	public GoodsInfoToEntity() {}
	/**
	 * 把{"itempagenum":[{"page_num":1,"name":"商品池1"}]}封装成实体
	 * */
	public GoodsPoolList getAllGoodsPoolIdToEntity(){
		GoodsPoolList goodsPoolList=null;
		try {
			goodsPoolList = JSON.parseObject(getAllGoodsPoolId( ),GoodsPoolList.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(goodsPoolList.getItempagenum());//[GoodsPool [page_num=1, name=商品池1]]
		return goodsPoolList;
	}
//////////////////////////////////////////////////////////////////////////////
	public GoodsIDList getAllGoodsIdsWithPageNumToEntity(String pageNum){
		GoodsIDList goodsIDList=null;
		try {
			goodsIDList = JSON.parseObject(getAllGoodsIdsWithPageNum(pageNum),GoodsIDList.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(goodsIDList.getItemlist());
		return goodsIDList;
	}
//////////////////////////////////////////////////////////////////////////////
	public GoodsDetailList get1GoodsDetailWithSkuidToEntity(String skuid){
		try {
			GoodsDetailList goodsDetailList = JSON.parseObject(get1GoodsDetailWithSkuid(skuid),GoodsDetailList.class);
			return goodsDetailList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*public static void main(String[ ] args){//"516785, 524955"
		System.out.println(new GoodsInfoToEntity( ).get1GoodsDetailWithSkuidToEntity("516764"));
	}*/
//////////////////////////////////////////////////////////////////////////////
	public GoodsUp1AndDown0StatusList goodsUp1AndDown0StatusListToEntity(String[] skuids){
		try {
			GoodsUp1AndDown0StatusList goodsUp1AndDown0StatusList = JSON.parseObject(getGoodsUpOrDownStatuses(skuids),GoodsUp1AndDown0StatusList.class);
			return goodsUp1AndDown0StatusList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
//////////////////////////////////////////////////////////////////////////////
	/*public static void main(String[ ] args){
		System.out.println(new GoodsInfoToEntity( ).getGoodsImagesToEntity(new String[ ]{"516785","524955"},"itemimage"));
	}*/
	public ImageDetailObjList getGoodsImagesToEntity(String[] skuids,String itemimageName){
		//itemimageName默认是:"itemimage"
		try {
			List<ImageDetailObj>list=new ArrayList<ImageDetailObj>( );
			String str = getGoodsImages(skuids);
			JSONObject jbj1 = JSON.parseObject(str);
			JSONArray ja1 = jbj1.getJSONArray(itemimageName);
			for(int n=0;n<ja1.size();++n){
				JSONObject jbj2 = (JSONObject) ja1.get(n);
				ImageDetailObj imageDetailObj = JSON.parseObject(jbj2.toString(),ImageDetailObj.class);
				list.add(imageDetailObj);
			}
			ImageDetailObjList imageDetailObjList = new ImageDetailObjList( );
			imageDetailObjList.setItemimage(list);
			return imageDetailObjList;
		} catch (Exception e) {}
		return null;
	}
//////////////////////////////////////////////////////////////////////////////
	public CommentsObjList getGoodsCommentsToEntity(String[] skuids){
		/*注：averageScore：商品评分 (5颗星，4颗星)，goodRate：好评度，
		generalRate：中评度, skuId: 商品编号,
		poorRate: 差评度*/
		try {
			CommentsObjList CommentsObjList = JSON.parseObject(getGoodsComments(skuids),CommentsObjList.class);
			return CommentsObjList;
		} catch (Exception e) {}
		return null;
		
	}
//////////////////////////////////////////////////////////////////////////////
	public KuCunList getInventoryInfoWithProvinceIdAndSkuidsToEntity(String areaId, String[] skuids){
		try {
			return JSON.parseObject(getInventoryInfoWithProvinceIdAndSkuids(areaId,skuids), KuCunList.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//public static void main(String[ ] args){
//	String areaId="1";
//	String[] skuids=new String[ ]{"516764"};
//	KuCunList kuCunList = new GoodsInfoToEntity( ).getInventoryInfoWithProvinceIdAndSkuidsToEntity(areaId,skuids);
//	System.out.println(kuCunList);
//}
//////////////////////////////////////////////////////////////////////////////
	public KuCunList getInventoryInfoWithWarehouseIdAndSkuidsToEntity(String WarehouseId, String[] skuids){
		try {
			return JSON.parseObject(getInventoryInfoWithWarehouseIdAndSkuids(WarehouseId,skuids), KuCunList.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//////////////////////////////////////////////////////////////////////////////
	public GoodsPriceList getGoodsPricesWithSkuidsToEntity (String[] skuids) {
		try {
			return JSON.parseObject(getGoodsPricesWithSkuids(skuids),GoodsPriceList.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
//////////////////////////////////////////////////////////////////////////////
	
	
//////////////////////////////////////////////////////////////////////////////	
}
//////////////////////////////////////////////////////////////////////////////
