package hanhan.entity.goodsEntity.goodsUp1AndDown0status;

public class GoodsUp1AndDown0Status {
	private String goodsid;
    private String status;
	public GoodsUp1AndDown0Status() {
		// TODO Auto-generated constructor stub
	}
	
	public GoodsUp1AndDown0Status(String goodsid, String status) {
		super();
		this.goodsid = goodsid;
		this.status = status;
	}

	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "goodsUp1AndDown0Status [goodsid=" + goodsid + ", status=" + status + "]";
	}
	
}
