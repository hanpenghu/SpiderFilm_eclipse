package hanhan.entity.goodsEntity.goodsPrice;

import java.util.ArrayList;
import java.util.List;

public class GoodsPriceList {
	private List<GoodsPriceDetail> price = new ArrayList<GoodsPriceDetail>();

	public GoodsPriceList() {
		// TODO Auto-generated constructor stub
	}

	public GoodsPriceList(List<GoodsPriceDetail> price) {
		super();
		this.price = price;
	}

	public List<GoodsPriceDetail> getPrice() {
		return price;
	}

	public void setPrice(List<GoodsPriceDetail> price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GoodsPriceList [price=" + price + "]";
	}

}
