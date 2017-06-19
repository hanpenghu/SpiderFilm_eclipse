package hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.tongBuDingDanWuLiuXinXi;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import hanhan.AbstractedOfAll.AbstractedAll;
public class TongBuWuLiuZhuangTaiYongXianCheng extends AbstractedAll implements Runnable  {
	String fgf=File.separator;
	private static Connection con=null;
	private static ResourceBundle rb=null;
	private static String 
	user="sa"
	,pwd="root"
	,url="jdbc:sqlserver://127.0.0.1:1435;DatabaseName=yun22"
	,driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//shiYongJingTaiDaiMaKaiQiYiGeLianJie,BuZaiGuanBi
	static{
		rb=ResourceBundle.getBundle("hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.tongBuDingDanWuLiuXinXi.JDBC");
		user=rb.getString("username");
		pwd=rb.getString("password");
		url=rb.getString("url");
		driver=rb.getString("driverClassName");
		Class<?> clazz=null;
		//jiaZaiQuDong
		try{clazz=Class.forName(driver);}catch(ClassNotFoundException e){e.printStackTrace();}
		//ruGuoQuDongJiaZaiChengGong, jiu JiXu
		if(clazz!=null){
			try {
				con=DriverManager.getConnection(url,user,pwd);
				
			}catch(SQLException e){e.printStackTrace();}
		}
	}
	private static final Integer OrderStatus2=2;
	private static final String method1="womai.logistics.get";
	
	public static void main(String[ ] args){
		System.out.println(new TongBuWuLiuZhuangTaiYongXianCheng( ).chaXunSuoYouYiFuKuanDingDanZongShuLiang(2));
	}
	
	@Override//select top(1) OrderId from Hishop_Orders where OrderStatus=4 order by UpdateDate asc
	public void run() {
		int yiFuKuanZongShuLiang=chaXunSuoYouYiFuKuanDingDanZongShuLiang(OrderStatus2);
		if(yiFuKuanZongShuLiang>0){
			
		}
	}
	public Integer chaXunSuoYouYiFuKuanDingDanZongShuLiang(Integer OrderStatus2){
		try{
			PreparedStatement pst=null;
			String sql="select count(OrderId) from Hishop_Orders where OrderStatus=?";
			if(con!=null){
				pst=con.prepareStatement(sql);
				if(pst!=null){
					pst.setInt(1,OrderStatus2);
					ResultSet rs = pst.executeQuery();
					rs.next();
					String str = rs.getString(1);
					if(str!=null){
						Integer strI=Integer.parseInt(str);
						return strI;
					}
				}
			}
		}catch(Exception e){e.printStackTrace();}
		return 0;
	}
}