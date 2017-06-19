package hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.goods;

import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

@Component("getSupplierId")
public class GetSupplierId {
	private int SupplierId;
	public int getSupplierId(){
		if(this.SupplierId==-1){//如果构造方法中有异常，就再计算一次
			ResourceBundle bundle = ResourceBundle.getBundle("hanhan/zhongLiangTongBuKuKuangJia/xml/b004C3P0/manJDBC");
			String str = bundle.getString("SupplierId");
			if(str!=null){
				this.SupplierId = Integer.parseInt(str);
			}
		}
		return this.SupplierId;
	} 
	public GetSupplierId() {
		System.out.println("=========开始计算SupplierId=================");
		try {
			ResourceBundle bundle = ResourceBundle.getBundle("hanhan/zhongLiangTongBuKuKuangJia/xml/b004C3P0/manJDBC");
			String str = bundle.getString("SupplierId");
			if(str!=null){
				this.SupplierId = Integer.parseInt(str);
			}
		} catch (Exception e) {
			this.SupplierId=-1;
			e.printStackTrace();
		}
		
	}
}
