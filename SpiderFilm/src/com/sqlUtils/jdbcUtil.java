package com.sqlUtils;														
import java.io.*;														
import java.sql.*;														
import java.util.Properties;														
/*														
 * 这里我将用原型文件配置一个通用的jdbc工具,														
 * 主要是得到Connection连接和关闭Connection和关闭ResultSet和关闭Statement的工具！														
 * 注意Statement是PreparedStatement和CallableStatement的超父类！所以我们用一个Statement就可以了！！														
 * */														
public class jdbcUtil {//注意下面的连接方法和关闭方法我写的都是静态方法,所以以后用的时候就不用再new对象了哦！！														
	private static Connection conn =null;													
	private static String driver="";													
	private static String url="";													
	private static String user="";													
	private static String password="";													
	private static InputStream in=null;													
	public static Connection getConnection( ){													
		try{
			if(conn!=null&&(!conn.isClosed())){
				return conn;
			}else{
				Properties prop=new Properties( );											
				/*											
				 * 下面是用了类路径,类路径中的第一个/就是classpath所在的路径,											
				 * 用这个路径可以使得带properties的jdbcUtil工具在java和web工程中都能使用											
				 * */											
				in=jdbcUtil.class.getResourceAsStream("/dataSource.properties");											
				prop.load(in);											
				driver=prop.getProperty("c3p0.driverClassName");											
				url=prop.getProperty("c3p0.url");											
				user=prop.getProperty("c3p0.username");											
				password=prop.getProperty("c3p0.password");											
				Class.forName(driver);											
				conn=DriverManager.getConnection(url, user, password);											
				if(conn!=null){return conn;}else{return new jdbcUtil( ).getConnection();}//注意这个return如果执行,下面的代码就会全部不执行！！！											
				//注意如果能执行到这一步,说明返回的就肯定是null了						
			}					
		}catch(Exception e){												
		System.out.println("jdbc未能和数据库连接成功！请检查您的url,用户名,密码以及数据库驱动driver！！");												
		e.printStackTrace();throw new RuntimeException(e);}												
		finally{try{in.close();}catch(IOException e){e.printStackTrace();}}												
	}													
	public static void close(Connection conn,Statement state,ResultSet rs){													
		try{												
			if(conn!=null)conn.close( );											
			if(state!=null)state.close( );//注意Statement是PreparedStatement和CallableStatement的父类,所以后2个也能传参给该方法！！！											
			if(rs!=null)rs.close( );											
		}												
		catch(Exception e){
			e.printStackTrace();//throw new RuntimeException(e);
		}												
	}													
}														


