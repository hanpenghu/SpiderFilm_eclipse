package hanhan.utilsOfMd5_32AndPostAPI.pageBean;
import java.util.ArrayList;
import java.util.List;
//////////////////////////////////////////////////////////////////////////////
/**
 * 使用此类,必须注意以下几点:
 * 1,传入当前页
 * 2,传入每页显示数(不传入的话,默认是5000)
 * 3,查询数据库总记录数后通过set方法传进来,
 * 4,上面设置玩上面的东西后,该工具类里面的所有计算都可以直接通过get方法调用了
 * */
public class PageBeanGeneralOfSqlServer<T>{
//////////////////////////////////////////////////////////////////////////////
	public PageBeanGeneralOfSqlServer(){}
//////////////////////////////////////////////////////////////////////////////
	//当前页
		private int currentPage;//set进来
		//总页数//通过get方法计算得到,前提是已经设置了总记录数和每页显示数目//get之后计算得到
		private int totalPage;
		//每页显示数//默认每页显示5000条//set进来也可以,默认是5000
		private int perPageRecord=5000;
		//总记录数//通过发送sql得到//set进来
		private int totalRecord;
		//当前页之前的所有记录数//通过get方法得到//必须每页记录数和当前页已经设置完毕
		private int beforeCurrentPageTotalRecord;//这个基本用于sqlserver
		/**
		 * 存放得到的记录数,实际上我们只要在mybatis中得到productID存进来就好了,其他的信息不要
		 * */
		private List<T>listOfT=new ArrayList<T>( );
//////////////////////////////////////////////////////////////////////////////
		public List<T> getListOfT() {
			return listOfT;
		}
		
		public void setListOfT(List<T> listOfT) {
			this.listOfT = listOfT;
		}
		
		//总页数=总记录数/每页显示数
				public int getTotalPage() {
					if(totalRecord%perPageRecord==0){totalPage=totalRecord/perPageRecord;}
					else{totalPage=totalRecord/perPageRecord+1;}
					return totalPage;
				}

				public void setTotalPage(int totalPage) {
					this.totalPage = totalPage;
				}
		
					public int getBeforeCurrentPageTotalRecord() {
						beforeCurrentPageTotalRecord=(perPageRecord*(currentPage-1));
						return beforeCurrentPageTotalRecord;
					}

				public void setBeforeCurrentPageTotalRecord(int beforeCurrentPageTotalRecord) {
					this.beforeCurrentPageTotalRecord = beforeCurrentPageTotalRecord;
				}
				
				
		public int getCurrentPage() {
			return currentPage;
		}

		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}

		public int getPerPageRecord() {
			return perPageRecord;
		}

		public void setPerPageRecord(int perPageRecord) {
			this.perPageRecord = perPageRecord;
		}

		public int getTotalRecord() {
			return totalRecord;
		}

		public void setTotalRecord(int totalRecord) {
			this.totalRecord = totalRecord;
		}
//////////////////////////////////////////////////////////////////////////////
		@Override
		public String toString() {
			return "PageBeanOfHishop_Products [currentPage=" + currentPage + ", totalPage=" + totalPage + ", perPageRecord="
					+ perPageRecord + ", totalRecord=" + totalRecord + ", beforeCurrentPageTotalRecord="
					+ beforeCurrentPageTotalRecord + ", hishop_SKUsList=" + listOfT + "]";
		}
//////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////