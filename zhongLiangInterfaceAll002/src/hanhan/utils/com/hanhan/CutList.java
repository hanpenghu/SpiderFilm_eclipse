package hanhan.utils.com.hanhan;
import hanhan.entity.goodsEntity.goodsID.GoodsID;

import java.util.ArrayList;  
import java.util.List;  
  
public class CutList <T>{  
    public static void main(String[] args) {  
        List<String> tarArr = new ArrayList<String>();  
        tarArr.add("a");  
        tarArr.add("b");  
        tarArr.add("c");  
        tarArr.add("d");  
        tarArr.add("e");  
        tarArr.add("f");  
        tarArr.add("g");  
        tarArr.add("h");  
          
        List<List<String>> result = new CutList<String>( ).cutList(tarArr, 5);  
          
        for(List<String> subArr:result) {  
          System.out.println(subArr);
        }  
          
    }  
    /**
	 * 把一个list转换成size个等份的list
	 * 分成若干等份的list
	 * */ 
    public  List<List<T>>  cutList(List<T> targe,int dengFenShuLiang) {  
        List<List<T>> listArr = new ArrayList<List<T>>();  
        //获取被拆分的数组个数  
        int arrSize = targe.size()%dengFenShuLiang==0?targe.size()/dengFenShuLiang:targe.size()/dengFenShuLiang+1;  
        for(int i=0;i<arrSize;i++) {  
            List<T>  sub = new ArrayList<T>();  
            //把指定索引数据放入到list中  
            for(int j=i*dengFenShuLiang;j<=dengFenShuLiang*(i+1)-1;j++) {  
                if(j<=targe.size()-1) {  
                    sub.add(targe.get(j));  
                }  
            }  
            listArr.add(sub);  
        }  
        return listArr;  
    } 

	/**
	 * 把一个list分成若干个包含meiGeXiaoListBaoHanShuLiang个“数据”的list
	 * 分成包含一定数量的list
	 * */
	public List<List<T>> cutList1(List<T> targe, int meiGeXiaoListBaoHanShuLiang) {
		List list = new ArrayList();
			try {
				Integer size = targe.size() / meiGeXiaoListBaoHanShuLiang;
				int remainder=targe.size() % meiGeXiaoListBaoHanShuLiang;
				if (remainder!= 0) {
					size = size + 1;
					
					for (int n = 0; n < size; ++n) {
						List list11 = new ArrayList();
						if(n<size-1){
							for (int i = 0 + meiGeXiaoListBaoHanShuLiang * n; i < meiGeXiaoListBaoHanShuLiang + meiGeXiaoListBaoHanShuLiang* n; ++i) {
								list11.add(targe.get(i));
							}
						}
						//下面是n=size-1的情况
						if(n==size-1){
							for(int k=0+meiGeXiaoListBaoHanShuLiang*(size-1);k<remainder+meiGeXiaoListBaoHanShuLiang*(size-1);++k){
								list11.add(targe.get(k));
							}
						}
						list.add(list11);
					}
				}else{
					for (int n = 0; n < size; ++n) {
						List list11 = new ArrayList();
						
							for (int i = 0 + meiGeXiaoListBaoHanShuLiang * n; i < meiGeXiaoListBaoHanShuLiang + meiGeXiaoListBaoHanShuLiang* n; ++i) {
								list11.add(targe.get(i));
							}
						
						list.add(list11);
					}
				}
			} catch (Exception e) {	e.printStackTrace();}
			
			return list;
		
	}
}  
