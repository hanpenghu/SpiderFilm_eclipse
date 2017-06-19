package hanhan.entity.goodsEntity.goodsUp1AndDown0status;

import java.util.ArrayList;
import java.util.List;

public class GoodsUp1AndDown0StatusList {
	private List<GoodsUp1AndDown0Status>itemstatus=new ArrayList<GoodsUp1AndDown0Status>( );
	public GoodsUp1AndDown0StatusList() {
		
	}
	public GoodsUp1AndDown0StatusList(List<GoodsUp1AndDown0Status> itemstatus) {
		super();
		this.itemstatus = itemstatus;
	}
	public List<GoodsUp1AndDown0Status> getItemstatus() {
		return itemstatus;
	}
	public void setItemstatus(List<GoodsUp1AndDown0Status> itemstatus) {
		this.itemstatus = itemstatus;
	}
	@Override
	public String toString() {
		return "GoodsUp1AndDown0StatusList [itemstatus=" + itemstatus + "]";
	}
	
	
}
