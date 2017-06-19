package hanhan.entity.goodsEntity;

public class GoodsPool {
	private int page_num;
	private String name;
	public GoodsPool() {}
	
	public GoodsPool(int page_num, String name) {
		super();
		this.page_num = page_num;
		this.name = name;
	}
	
	public int getPage_num() {
		return page_num;
	}
	public void setPage_num(int page_num) {
		this.page_num = page_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GoodsPool [page_num=" + page_num + ", name=" + name + "]";
	}
	
	

}
