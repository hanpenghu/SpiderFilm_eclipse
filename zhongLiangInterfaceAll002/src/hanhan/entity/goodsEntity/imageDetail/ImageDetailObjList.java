package hanhan.entity.goodsEntity.imageDetail;
import java.util.ArrayList;
import java.util.List;
public class ImageDetailObjList {
	private List<ImageDetailObj>itemimage=new ArrayList<ImageDetailObj>( );
	public ImageDetailObjList() {
		// TODO Auto-generated constructor stub
	}
	public ImageDetailObjList(List<ImageDetailObj> itemimage) {
		super();
		this.itemimage = itemimage;
	}
	public List<ImageDetailObj> getItemimage() {
		return itemimage;
	}
	public void setItemimage(List<ImageDetailObj> itemimage) {
		this.itemimage = itemimage;
	}
	@Override
	public String toString() {
		return "ImageDetailObjList [itemimage=" + itemimage + "]";
	}
	
}
