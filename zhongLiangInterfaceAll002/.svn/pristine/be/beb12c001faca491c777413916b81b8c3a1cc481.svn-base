package hanhan.utils.com.hanhan.toDB;
import hanhan.utils.com.hanhan.testReadExcel.ExcelReadToEntityIntoListOrJSONString;
import java.io.File;
import java.sql.*;
import java.util.List;
import java.util.ResourceBundle;
public class CategoryExcelToDb {
	String fgf=File.separator;
	private static Connection con=null;
	private static ResourceBundle rb=null;
	private static String 
	user="sa"
	,pwd="root"
	,url="jdbc:sqlserver://127.0.0.1:1435;DatabaseName=yun22"
	,driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
	,excelPath="G:"+File.separator+"zhongLiangFenLei.xls";
	static int sheetIndex=0//第0个工作薄开始;//第0列开始
	,startRowsIndex=1//第一行开始(第0行头信息不要)
	,startColumnsIndex=0;
	//使用静态代码开启一个连接,不再关闭
	static{
		rb=ResourceBundle.getBundle("hanhan.utils.com.hanhan.testReadExcel.JDBC");
		user=rb.getString("username");
		pwd=rb.getString("password");
		url=rb.getString("url");
		driver=rb.getString("driverClassName");
		sheetIndex=Integer.parseInt(rb.getString("sheetIndex"));
		startRowsIndex=Integer.parseInt(rb.getString("startRowsIndex"));
		startColumnsIndex=Integer.parseInt(rb.getString("startColumnsIndex"));
		Class<?> clazz=null;
		//加载驱动
		try{clazz=Class.forName(driver);}catch(ClassNotFoundException e){e.printStackTrace();}
		//如果驱动加载成功,就继续
		if(clazz!=null){
			try {con=DriverManager.getConnection(url,user,pwd);}catch(SQLException e){e.printStackTrace();}
		}
	}
	public static void main(String[] args) {
		new CategoryExcelToDb( ).categoryExcelToDb();
	}
	
	public void categoryExcelToDb( ){
		excelPath=this.getClass().getResource("/").getPath()+"hanhan"+fgf+"utils"+fgf+"com"+fgf+"hanhan"+fgf+"testReadExcel"+fgf+"zhongLiangFenLei.xls";
		PreparedStatement pst=null;
		String sql="insert into Hishop_Categories(Name,CategoryId,ParentCategoryId,Depth,DisplaySequence,Path)values(?,?,?,?,?,?)";
		try{pst=con.prepareStatement(sql);}catch(SQLException e){e.printStackTrace();}
		if(pst!=null){
			List<List<String>> list = ExcelReadToEntityIntoListOrJSONString.getRowsForRecordOfExcelToListIntoList(excelPath, sheetIndex, startRowsIndex, startColumnsIndex);
			if(list!=null&&list.size()!=0){
				for(int n=0;n<list.size();++n){
					try {pst.setString(1,list.get(n).get(0));} catch (SQLException e) {e.printStackTrace();}
					String str = list.get(n).get(1);int i=0;
					if(str!=null){
						i=Integer.parseInt(str);
						try {pst.setInt(2,i);} catch (SQLException e) {e.printStackTrace();}
					}
					//得到第n行第2列(列索引从0开始)
					str = list.get(n).get(2);
					if(str!=null){
						i=Integer.parseInt(str);
						try {pst.setInt(3,i);} catch (SQLException e) {e.printStackTrace();}
					}
					str = list.get(n).get(3);
					if(str!=null){
						i=Integer.parseInt(str);
						try {pst.setInt(4,i);} catch (SQLException e) {e.printStackTrace();}
					}
					str = list.get(n).get(4);
					if(str!=null){
						i=Integer.parseInt(str);
						try {pst.setInt(5,i);} catch (SQLException e) {e.printStackTrace();}
					}
					try {pst.setString(6,list.get(n).get(5));} catch (SQLException e) {e.printStackTrace();}
					try {
						pst.addBatch();
						//每20条一次批处理
						if(n%20==0){pst.executeBatch();pst.clearBatch();}
					} catch (SQLException e) {e.printStackTrace();}
				}
				try {pst.executeBatch();pst.clearBatch();con.commit();} catch (SQLException e) {e.printStackTrace();}
			}
			try {pst.close();} catch (SQLException e) {e.printStackTrace();}
		}
		try {con.close();} catch (SQLException e) {e.printStackTrace();}
	}
}
