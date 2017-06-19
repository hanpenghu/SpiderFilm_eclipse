package hanhan.utilsOfMd5_32AndPostAPI.pageBean;

import java.util.ArrayList;
import java.util.List;

import hanhan.entity.shangPinGuiGeXiangXiBiao.Hishop_SKUs;


//////////////////////////////////////////////////////////////////////////////
public class PageBeanOfHishop_SKUs {
//////////////////////////////////////////////////////////////////////////////
	public PageBeanOfHishop_SKUs() {}
//////////////////////////////////////////////////////////////////////////////
	//当前页
	private int currentPage;
	//总页数//通过get方法计算得到,前提是已经设置了总记录数和每页显示数目
	private int totalPage;
	//每页显示数//默认每页显示5000条
	private int perPageRecord=5000;
	//总记录数//通过发送sql得到
	private int totalRecord;
	//当前页之前的所有记录数//通过get方法得到//必须每页记录数和当前页已经设置完毕
	private int beforeCurrentPageTotalRecord;
	/**
	 * 存放得到的记录数,实际上我们只要在mybatis中得到productID存进来就好了,其他的信息不要
	 * */
	private List<Hishop_SKUs>hishop_SKUsList=new ArrayList<Hishop_SKUs>( );
//////////////////////////////////////////////////////////////////////////////
	public List<Hishop_SKUs> getHishop_SKUsList() {
		return hishop_SKUsList;
	}
	
	public void setHishop_SKUsList(List<Hishop_SKUs> hishop_SKUsList) {
		this.hishop_SKUsList = hishop_SKUsList;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
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

	public int getBeforeCurrentPageTotalRecord() {
		beforeCurrentPageTotalRecord=(perPageRecord*(currentPage-1));
		return beforeCurrentPageTotalRecord;
	}

	public void setBeforeCurrentPageTotalRecord(int beforeCurrentPageTotalRecord) {
		this.beforeCurrentPageTotalRecord = beforeCurrentPageTotalRecord;
	}
//////////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return "PageBeanOfHishop_Products [currentPage=" + currentPage + ", totalPage=" + totalPage + ", perPageRecord="
				+ perPageRecord + ", totalRecord=" + totalRecord + ", beforeCurrentPageTotalRecord="
				+ beforeCurrentPageTotalRecord + ", hishop_SKUsList=" + hishop_SKUsList + "]";
	}

//////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////