package hanhan.entity.goodsEntity.goodsKuCun;

public class KuCunDetail {
	private String skuid; 
    private String inventory; 
	public KuCunDetail() {}
	public KuCunDetail(String skuid, String inventory) {
		super();
		this.skuid = skuid;
		this.inventory = inventory;
	}
	public String getSkuid() {
		return skuid;
	}
	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}
	public String getInventory() {
		return inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	@Override
	public String toString() {
		return "KuCunDetail [skuid=" + skuid + ", inventory=" + inventory + "]";
	}
	
}
