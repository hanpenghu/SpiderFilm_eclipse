package hanhan.entity.goodsEntity.goodsPrice;

import java.math.BigDecimal;

public class GoodsPriceDetail2ofDecimal {
	private String skuid;
    private BigDecimal price;
	public GoodsPriceDetail2ofDecimal() {
		// TODO Auto-generated constructor stub
	}
	public String getSkuid() {
		return skuid;
	}
	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "GoodsPriceDetail2ofDecimal [skuid=" + skuid + ", price=" + price + "]";
	}
	
}
