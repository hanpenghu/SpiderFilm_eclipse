package hanhan.entity.goodsEntity.goodsID;

public class GoodsID {
	private String itemid;
	public GoodsID() {}
	public GoodsID(String itemid) {
		super();
		this.itemid = itemid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	@Override
	public String toString() {
		return "GoodsID [itemid=" + itemid + "]";
	}
	
	
}
