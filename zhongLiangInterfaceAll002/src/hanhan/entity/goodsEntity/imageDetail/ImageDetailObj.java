package hanhan.entity.goodsEntity.imageDetail;

import java.util.ArrayList;
import java.util.List;

public class ImageDetailObj {
	private String goodsid;
	private List<ImageObj>image=new ArrayList<ImageObj>( );
	public ImageDetailObj() {
		// TODO Auto-generated constructor stub
	}
	public ImageDetailObj(String goodsid, List<ImageObj> image) {
		super();
		this.goodsid = goodsid;
		this.image = image;
	}
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public List<ImageObj> getImage() {
		return image;
	}
	public void setImage(List<ImageObj> image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "ImageDetailObj [goodsid=" + goodsid + ", image=" + image + "]";
	}
	
}
