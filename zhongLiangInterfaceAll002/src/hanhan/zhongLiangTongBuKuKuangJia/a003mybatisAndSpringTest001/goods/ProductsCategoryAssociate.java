package hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.goods;

import hanhan.utils.com.hanhan.jdbcUtil;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductsCategoryAssociate {
	// 全局参数									
	private Connection con = jdbcUtil.getConnection();									
	private PreparedStatement pstmt=null;
	private Statement stat=null;
	private ResultSet rs=null;
	Logger log = LogManager.getLogger(ProductsCategoryAssociate.class.getName());
	
	public static void main(String[] args) {
//		new ProductsCategoryAssociate( ).f();
		System.out.println(new ProductsCategoryAssociate( ).getMainCategoryPath("42205"));
//		System.out.println(new ProductsCategoryAssociate( ).getMainCategoryPath("52101"));

	}
	
	public String getMainCategoryPath(String CategoryId){
		try {
			
				String sql2="select Path from Hishop_Categories where CategoryId = ?";
				if(con==null){con=jdbcUtil.getConnection();}
				PreparedStatement stat2=con.prepareStatement(sql2);
				stat2.setString(1,CategoryId);
				ResultSet rs2= stat2.executeQuery();
				if(rs2.next()){//只有一个
					String path = rs2.getString("Path");
				
					path=(path+"|");
					stat2.close();
					rs2.close();
					return path;
				}
		} catch (SQLException e) {log.error("-------------"+e.getMessage()+"-----------",e);}
		return null;
	}
	
	public void f(){
		String sql ="select ProductId from Hishop_Products";
		List <Integer>list=new ArrayList<Integer>( ); 
		// 获取连接							
		try {
			//读取所有的商品表中的ProductId字段到list中进行循环
			stat=con.createStatement();
			rs= stat.executeQuery(sql);
			while(rs.next()){
				int ProductId = rs.getInt("ProductId");
				list.add(ProductId);
			}
			//循环list
			for(int ProductId:list){
				//选择出该ProductId对应的CategoryId 
				String sql1="select CategoryId from Hishop_Products where ProductId="+ProductId+"";
				if(con==null){con=jdbcUtil.getConnection();}
				Statement stat1=con.createStatement();
				ResultSet rs1= stat1.executeQuery(sql1);
				if(rs1.next()){//只有一个
					int CategoryId = rs1.getInt("CategoryId");
					System.out.println(CategoryId);
					//从分类表中找到该CategoryId的path
					String sql2="select Path from Hishop_Categories where CategoryId="+CategoryId+"";
					if(con==null){con=jdbcUtil.getConnection();}
					Statement stat2=con.createStatement();
					ResultSet rs2= stat2.executeQuery(sql2);
					if(rs2.next()){//只有一个
						String path = rs2.getString("Path");
						path=(path+"|");
						System.out.println(path);
						//把path放入id为ProductId的表中
//						String sql3="update Hishop_Products set MainCategoryPath="+(path)+" where ProductId="+(ProductId)+"";
						String sql3="update Hishop_Products set MainCategoryPath=? where ProductId=?";
						if(con==null){con=jdbcUtil.getConnection();}
						PreparedStatement stat3=con.prepareStatement(sql3);
						stat3.setString(1,path);
						stat3.setInt(2,ProductId);
						stat3.executeUpdate();
						con.commit();
						stat1.close();
						stat2.close();
						stat3.close();
						rs1.close();
						rs2.close();
					}
				}	
			}
			System.out.println("-----------------结束-------------------");
//			log.debug("----------------结束------------------");
		} catch (Exception e) {e.printStackTrace();/*log.error("-------------"+e.getMessage()+"-----------",e)*/;}finally{jdbcUtil.close(con, stat, rs);}	
	}
	
	

}
