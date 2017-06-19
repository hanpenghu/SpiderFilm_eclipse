package hanhan.entity.goodsEntity.goodsKuCun.kuCunRuCan;

public class KuCunRuCan {
	String areaID;
	 String warehouseID;//": 0,
     String areaName;//": "北京"
	public String getAreaID() {
		return areaID;
	}
	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}
	public String getWarehouseID() {
		return warehouseID;
	}
	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "KuCunRuCan [areaID=" + areaID + ", warehouseID=" + warehouseID + ", areaName=" + areaName + "]";
	}
     
}
