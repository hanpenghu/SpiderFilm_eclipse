package hanhan.utils.com.hanhan.toDBbuShiYongPatch;
import hanhan.utils.com.hanhan.testReadExcel.ExcelReadToEntityIntoListOrJSONString;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
public class CategoryExcelToDb {
	String fgf = File.separator;
	private static Connection con = null;
	private static ResourceBundle rb = null;
	private static String user = "sa", pwd = "root",
			url = "jdbc:sqlserver://127.0.0.1:1435;DatabaseName=yun22",
			driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver",
			excelPath = "G:" + File.separator + "zhongLiangFenLei.xls";
	static int sheetIndex = 0// 第0个工作薄开始;//第0列开始
			,
			startRowsIndex = 1// 第一行开始(第0行头信息不要)
			, startColumnsIndex = 0;
	// 使用静态代码开启一个连接,不再关闭
	static {
		rb = ResourceBundle
				.getBundle("hanhan.zhongLiangTongBuKuKuangJia.xml.b004C3P0.manJDBC");
		user = rb.getString("c3p0.username");
		pwd = rb.getString("c3p0.password");
		url = rb.getString("c3p0.url");
		driver = rb.getString("c3p0.driverClassName");
		sheetIndex = Integer.parseInt(rb.getString("sheetIndex"));
		startRowsIndex = Integer.parseInt(rb.getString("startRowsIndex"));
		startColumnsIndex = Integer.parseInt(rb.getString("startColumnsIndex"));
		Class<?> clazz = null;
		// 加载驱动
		try {
			clazz = Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 如果驱动加载成功,就继续
		if (clazz != null) {
			try {
				con = DriverManager.getConnection(url, user, pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new CategoryExcelToDb().categoryExcelToDb();
	}

	public void categoryExcelToDb() {
		excelPath = this.getClass().getResource("/").getPath() + "hanhan" + fgf
				+ "zhongLiangTongBuKuKuangJia" + fgf + "xml"+ fgf +"zhongLiangFenLei.xls";
		PreparedStatement pst = null;
		PreparedStatement pst1 = null;
		String sql = "insert into Hishop_Categories(Name,CategoryId,ParentCategoryId,Depth,DisplaySequence,Path)values(?,?,?,?,?,?)";
		String sqlIsExsit = "select count(CategoryId) from Hishop_Categories where CategoryId=?";
		try {
			pst1 = con.prepareStatement(sqlIsExsit);
			if (pst1 != null) {
				List<List<String>> list = ExcelReadToEntityIntoListOrJSONString
						.getRowsForRecordOfExcelToListIntoList(excelPath,
								sheetIndex, startRowsIndex, startColumnsIndex);
				if (list != null && list.size() != 0) {
					for (int n = 0; n < list.size(); ++n) {
						Savepoint savepoint =null;
						try {
							con.setAutoCommit(false);
							savepoint = con.setSavepoint("1");
							String str1 = list.get(n).get(1);
							if (str1 != null) {
								pst1.setInt(1, Integer.parseInt(str1));
								ResultSet rs = pst1.executeQuery();
								rs.next();
								int count1 = rs.getInt(1);
								if (count1 == 0) {
									pst = con.prepareStatement(sql);
									if (pst != null) {
									
											//get(n) dai biao　di 0 hang
											pst.setString(1, list.get(n).get(0));
							
										String str = list.get(n).get(1);
										String leiMuId=str;//hou bu,  wei le   path shi yong
										int i = 0;
										if (str != null) {
											i = Integer.parseInt(str);
											
												pst.setInt(2, i);
											
										}
										// 得到第n行第2列(列索引从0开始)
										str = list.get(n).get(2);
										String leiMuFuJiId=str;//  hou bu ,  wei le   path shi yong
										if (str != null) {
											i = Integer.parseInt(str);
											
												pst.setInt(3, i);
											
										}
										str = list.get(n).get(3);
										if (str != null) {
											i = Integer.parseInt(str);
										
												pst.setInt(4, i);
											
										}
										str = list.get(n).get(4);
										if (str != null) {
											i = Integer.parseInt(str);
											
												pst.setInt(5, i);
											
										}
										
											String Path=leiMuId;
											if(!leiMuFuJiId.equals("0")){
												Path=leiMuFuJiId+"|"+leiMuId;
											}
											
											pst.setString(6,Path);
										
										pst.execute();
										con.commit();
									}
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
							con.rollback(savepoint);
						}
					}
				}
			}
			Savepoint savepoint2=null;
			try {
				savepoint2 = con.setSavepoint("2");
				Statement statement = con.createStatement();
				ResultSet rs = statement.executeQuery("select * from Hishop_Categories where Depth=3");
				while(rs.next( )){
					int CategoryId = rs.getInt("CategoryId");
					int ParentCategoryId = rs.getInt("ParentCategoryId");
					String Path = rs.getString("Path");System.out.println(Path+"-------");
					Statement stat=con.createStatement();
					ResultSet res = stat.executeQuery("select * from Hishop_Categories where CategoryId="+ParentCategoryId+"");
					res.next( );
					String strPath = res.getString("Path");System.out.println(strPath+"-------");
					Path=strPath+"|"+CategoryId;System.out.println(Path+"-------");
					Statement sta=con.createStatement();
					sta.executeUpdate("update Hishop_Categories set Path='"+Path+"' where CategoryId="+CategoryId+"");
				}
				con.commit();
			} catch (Exception e) {e.printStackTrace();con.rollback(savepoint2);}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
