package hanhan.utils.com.hanhan.dataSource;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
import javax.sql.*;
public class DataSource1 implements DataSource {
	String fgf = File.separator;
	static Class<?> clazz = null;
	private Connection con = null;
	private static ResourceBundle rb = null;
	private static String user = "sa", pwd = "root",
			url = "jdbc:sqlserver://127.0.0.1:1435;DatabaseName=yun22",
			driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	// lianJieChi
	private static LinkedList<Connection> poolLinkedList = (LinkedList<Connection>) Collections
			.synchronizedList(new LinkedList<Connection>());
	private static DataSource1 dataSource1 = new DataSource1();

	private DataSource1() {
		//chuShiHuaLianJieChi
		for(int n=0;n<5;++n){
			try {
				poolLinkedList.addLast(makeConnection());
			} catch (SQLException e) {e.printStackTrace();}
		}
	}

	static {
		rb = ResourceBundle
				.getBundle("hanhan.zhongLiangTongBuKuKuangJia.a003mybatisAndSpringTest001.tongBuDingDanWuLiuXinXi.JDBC");
		user = rb.getString("username");
		pwd = rb.getString("password");
		url = rb.getString("url");
		driver = rb.getString("driverClassName");
		// jiaZaiQuDong
		try {
			clazz = Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

	/**
	 * huoQuShuJuYuanDanLi
	 * 
	 * @return shuJuYuanDanLi
	 */
	public DataSource1 instance() {
		if (dataSource1 == null){
			dataSource1 = new DataSource1();
		}
		return dataSource1;
	}

	@Override
	public Connection getConnection(){
		try {
			if(poolLinkedList.size()==0){
				for(int n=0;n<5;++n){
					try {
						poolLinkedList.addLast(makeConnection());
					} catch (SQLException e) {e.printStackTrace();}
				}
			}
			synchronized (poolLinkedList) {
					return poolLinkedList.removeFirst();
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

	private Connection makeConnection() throws SQLException {
		// ruGuoQuDongJiaZaiChengGong, jiu JiXu
		if (clazz != null) {
			try {
				con = DriverManager.getConnection(url, user, pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			try {
				clazz= Class.forName(driver);
				if(clazz!=null){con = DriverManager.getConnection(url, user, pwd);}
			} catch (ClassNotFoundException e) {e.printStackTrace();}
		}
		return con;
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {

		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {

	}

	@Override
	public int getLoginTimeout() throws SQLException {

		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {

		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {

		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {

		return false;
	}
}
