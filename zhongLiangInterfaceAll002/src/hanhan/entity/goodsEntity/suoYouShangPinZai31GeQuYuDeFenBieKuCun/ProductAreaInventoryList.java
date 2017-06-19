package hanhan.entity.goodsEntity.suoYouShangPinZai31GeQuYuDeFenBieKuCun;
import java.util.*;
public class ProductAreaInventoryList {
	public ProductAreaInventoryList() {}
	List <ProductAreaInventory>productAreaInventoryList=new ArrayList<ProductAreaInventory>( );
	public List<ProductAreaInventory> getProductAreaInventoryList() {
		return productAreaInventoryList;
	}
	public void setProductAreaInventoryList(List<ProductAreaInventory> productAreaInventoryList) {
		this.productAreaInventoryList = productAreaInventoryList;
	}
	@Override
	public String toString() {
		return "ProductAreaInventoryList [productAreaInventoryList=" + productAreaInventoryList + "]";
	}
	
}
