package hanhan.entity.goodsEntity.goodsKuCun.kuCunRuCan;
import java.util.ArrayList;
import java.util.List;
public class KuCunRuCanList {
	List<KuCunRuCan>areaAndWarehouse=new ArrayList( );

	public List<KuCunRuCan> getAreaAndWarehouse() {
		return areaAndWarehouse;
	}

	public void setAreaAndWarehouse(List<KuCunRuCan> areaAndWarehouse) {
		this.areaAndWarehouse = areaAndWarehouse;
	}

	@Override
	public String toString() {
		return "KuCunRuCanList [areaAndWarehouse=" + areaAndWarehouse + "]";
	}
	
}
