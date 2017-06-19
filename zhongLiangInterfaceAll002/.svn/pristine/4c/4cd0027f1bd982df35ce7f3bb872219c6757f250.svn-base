package hanhan.utils.com.hanhan.testReadExcel;
import java.io.*;
import java.util.*;
import com.alibaba.fastjson.*;
import jxl.*;
import jxl.read.biff.BiffException;
 class Hishop_Categories{
	Integer CategoryId=-1;//	Int 	分类编号 (有)
	String Name="NothingToGet";//	nvarchar(100) 	分类名称(界面自己搞)
	Integer DisplaySequence=-1;//	Int 	显示顺序(界面自己搞)
	String Meta_Title="NothingToGet";//	Nvarchar(1000) NULL	分类页面标题(页面自己搞)
	String Meta_Description="NothingToGet";//	nvarchar(1000) NULL	分类页面描述(自己搞)
	String Meta_Keywords="NothingToGet";//	nvarchar(1000) NULL	分类页面搜索关键字(自己搞)
	Integer ParentCategoryId=-1;//	Int NULL	上级分类编号(自己搞)
	Integer Depth=-1;//	Int 	分类是几级(自己搞)
	String Path="NothingToGet";//	nvarchar(4000) 	分类路径(自己搞)
	String RewriteName="NothingToGet";//nvarchar(50) NULL	URL重写命名(自己搞)
	String SKUPrefix="NothingToGet";//	Nvarchar(10) NULL	货号前缀(自己搞)
	Integer AssociatedProductType=-1;	//Int NULL	商品类型(自己搞)
	String Notes1="NothingToGet";//	Ntext NULL	分类广告一
	String Notes2="NothingToGet";//	Ntext NULL	分类广告二
	String Notes3="NothingToGet";//	Ntext;// NULL	分类广告三
	String Notes4;//Ntext NULL	分类广告四
	String Notes5="NothingToGet";//Ntext NULL	分类广告五
	String Theme="NothingToGet";//	nvarchar(50) NULL	分类模板名
	boolean HasChildren=false;//	Bit 	是否存下级分类
	String Icon="NothingToGet";//	Nvarhcar(1000) NULL	图标地址
	String BigImageUrl="NothingToGet";	//nvarchar(1000)	大图
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getDisplaySequence() {
		return DisplaySequence;
	}
	public void setDisplaySequence(Integer displaySequence) {
		DisplaySequence = displaySequence;
	}
	public String getMeta_Title() {
		return Meta_Title;
	}
	public void setMeta_Title(String meta_Title) {
		Meta_Title = meta_Title;
	}
	public String getMeta_Description() {
		return Meta_Description;
	}
	public void setMeta_Description(String meta_Description) {
		Meta_Description = meta_Description;
	}
	public String getMeta_Keywords() {
		return Meta_Keywords;
	}
	public void setMeta_Keywords(String meta_Keywords) {
		Meta_Keywords = meta_Keywords;
	}
	public Integer getParentCategoryId() {
		return ParentCategoryId;
	}
	public void setParentCategoryId(Integer parentCategoryId) {
		ParentCategoryId = parentCategoryId;
	}
	public Integer getDepth() {
		return Depth;
	}
	public void setDepth(Integer depth) {
		Depth = depth;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public String getRewriteName() {
		return RewriteName;
	}
	public void setRewriteName(String rewriteName) {
		RewriteName = rewriteName;
	}
	public String getSKUPrefix() {
		return SKUPrefix;
	}
	public void setSKUPrefix(String sKUPrefix) {
		SKUPrefix = sKUPrefix;
	}
	public Integer getAssociatedProductType() {
		return AssociatedProductType;
	}
	public void setAssociatedProductType(Integer associatedProductType) {
		AssociatedProductType = associatedProductType;
	}
	public String getNotes1() {
		return Notes1;
	}
	public void setNotes1(String notes1) {
		Notes1 = notes1;
	}
	public String getNotes2() {
		return Notes2;
	}
	public void setNotes2(String notes2) {
		Notes2 = notes2;
	}
	public String getNotes3() {
		return Notes3;
	}
	public void setNotes3(String notes3) {
		Notes3 = notes3;
	}
	public String getNotes4() {
		return Notes4;
	}
	public void setNotes4(String notes4) {
		Notes4 = notes4;
	}
	public String getNotes5() {
		return Notes5;
	}
	public void setNotes5(String notes5) {
		Notes5 = notes5;
	}
	public String getTheme() {
		return Theme;
	}
	public void setTheme(String theme) {
		Theme = theme;
	}
	public boolean isHasChildren() {
		return HasChildren;
	}
	public void setHasChildren(boolean hasChildren) {
		HasChildren = hasChildren;
	}
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	public String getBigImageUrl() {
		return BigImageUrl;
	}
	public void setBigImageUrl(String bigImageUrl) {
		BigImageUrl = bigImageUrl;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Catelogy [CategoryId=").append(CategoryId).append(", Name=").append(Name)
				.append(", DisplaySequence=").append(DisplaySequence).append(", Meta_Title=").append(Meta_Title)
				.append(", Meta_Description=").append(Meta_Description).append(", Meta_Keywords=").append(Meta_Keywords)
				.append(", ParentCategoryId=").append(ParentCategoryId).append(", Depth=").append(Depth)
				.append(", Path=").append(Path).append(", RewriteName=").append(RewriteName).append(", SKUPrefix=")
				.append(SKUPrefix).append(", AssociatedProductType=").append(AssociatedProductType).append(", Notes1=")
				.append(Notes1).append(", Notes2=").append(Notes2).append(", Notes3=").append(Notes3)
				.append(", Notes4=").append(Notes4).append(", Notes5=").append(Notes5).append(", Theme=").append(Theme)
				.append(", HasChildren=").append(HasChildren).append(", Icon=").append(Icon).append(", BigImageUrl=")
				.append(BigImageUrl).append("]");
		return builder.toString();
	}
	
}
 /**
  * 此类有三个方法来读取一个excel,
  * list那个方法用来把一行存入一个list,然后再把这个行list放入一个大的List,然后循环完所有的行进入大List//
  * 不带头信息生成JSONString的方法,主要是把每一行作为一个array(里面是每一个单元格信息),然后每个Array取一个名字(Excel行号)循环放入一个大的JSONObject//
  * 依赖
  * <!-- 下面是读取EXCEL的API -->
		<!-- https://mvnrepository.com/artifact/net.sourceforge.jexcelapi/jxl -->
		<dependency>
			<groupId>net.sourceforge.jexcelapi</groupId>
			<artifactId>jxl</artifactId>
			<version>2.6.12</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/com.alibaba/fastjson -->
		<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>fastjson</artifactId>
			<version>1.2.21</version>
		</dependency>
  * */
public class ExcelReadToEntityIntoListOrJSONString {
	/**
	 * fgf是跨平台分隔符的意思
	 * */
	public static final String fgf = File.separator;//跨平台路径分隔符
	public static void main(String[] args) throws Exception{
		//new ExcelReadToEntityIntoList().f();
		new ExcelReadToEntityIntoListOrJSONString().g();
		System.out.println(getRowsForRecordOfExcelNoHeadToJsonString("G:" + fgf + "zhongLiangFenLei.xls", 0,1,0));
		System.out.println(getRowsForRecordOfExcelHaveHeadToJsonString("G:" + fgf + "zhongLiangFenLei.xls", 0,0,0));
	}
	/**
	 *如果第一行是头信息,那么startRowsIndex从第二(索引为1)行开始,//总之此方法索引要从头信息下面那一行开始//
	 * 里面的list存的是一个行,外面的List存的是所有行
	 * 思路:一行Excel表格作为一个list,然后把list放入另一个List(里面存了一行一行的记录)
	 * list默认存的都是String,到时候用的时候自己转换
	 * //T是个将来要封装每行记录的对象！！
	 * excelPath指的是excel所在的路径！！
	 * sheetIndex指的是一个Excel中的第几个sheet工作薄(从0开始数)！！
	 * startRowsIndex指的是一个sheet表中,读行的时候从第几行开始读,注意索引从0开始
	 * */
	public static  List<List<String>> getRowsForRecordOfExcelToListIntoList(String excelPath,Integer sheetIndex,Integer startRowsIndex,Integer startColumnsIndex){
		try {
			Workbook readwb = null;InputStream instream=null;
			List<List<String>>List=new ArrayList<List<String>>( );
			try {instream = new FileInputStream(excelPath);} catch (FileNotFoundException e) {e.printStackTrace();}
			if(instream!=null){
				try {readwb = Workbook.getWorkbook(instream);} catch (Exception e) {e.printStackTrace();}
				if(readwb!=null){
					// Sheet的下标是从0开始
					// 获取第sheetIndex+1张Sheet表
					Sheet sheet = readwb.getSheet(sheetIndex);
					if(sheet!=null){
						// 获取Sheet表中所包含的总行数
						int totalRows = sheet.getRows();
						// 获取Sheet表中所包含的总列数//其实对应于实体的总共的字段数目
						int totalColumns = sheet.getColumns();
						if(totalRows!=0&&totalColumns!=0){
							//startRowsIndex是开始行的索引,因为第一行(索引0)有可能是个表头信息
							for (int i=startRowsIndex;i<totalRows;i++){//行循环
								List<String>list=new ArrayList<String>( );//每行作为一个list,每一行的东西放入一个新的list
								//startColumnsIndex指的是开始的那一列,一般默认为第0列
								for (int j = startColumnsIndex; j < totalColumns; j++){//列循环(循环字段)
									//得到第j列第i行的那个单元格
									Cell cell = sheet.getCell(j, i);
									//得到该单元格的内容
									String contents = cell.getContents();
									list.add(contents);
								}
								List.add(list);
							}
						}
					}
				}
			}
			if(instream!=null){try {instream.close( );} catch (IOException e) {e.printStackTrace();}}
			return List;
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
	/**
	 * 注意,此方法的startRowsIndex从头信息的索引开始//因为头信息作为一个单元格的名字出现
	 * */
	public static String getRowsForRecordOfExcelNoHeadToJsonString(String excelPath,Integer sheetIndex,Integer startRowsIndex,Integer startColumnsIndex){
		try {
			//初始化一个jsonObject//然后添加一行一行的jsonArray
			JSONObject jsonObject=new JSONObject();
			Workbook readwb = null;InputStream instream=null;
			try {instream = new FileInputStream(excelPath);} catch (FileNotFoundException e) {e.printStackTrace();}
			if(instream!=null){
				try {readwb = Workbook.getWorkbook(instream);} catch (Exception e) {e.printStackTrace();}
				if(readwb!=null){
					// Sheet的下标是从0开始
					// 获取第sheetIndex+1张Sheet表
					Sheet sheet = readwb.getSheet(sheetIndex);
					if(sheet!=null){
						// 获取Sheet表中所包含的总行数
						int totalRows = sheet.getRows();
						// 获取Sheet表中所包含的总列数//其实对应于实体的总共的字段数目
						int totalColumns = sheet.getColumns();
						if(totalRows!=0&&totalColumns!=0){
							//startRowsIndex是开始行的索引,因为第一行(索引0)有可能是个表头信息
							for (int i=startRowsIndex;i<totalRows;i++){//行循环
								JSONArray jsonArray1=new JSONArray( );
								//startColumnsIndex指的是开始的那一列,一般默认为第0列
								for (int j=startColumnsIndex;j<totalColumns;j++){//列循环(循环字段)
									//得到第j列第i行的那个单元格
									Cell cell = sheet.getCell(j, i);
									//得到该单元格的内容
									String contents = cell.getContents();
									jsonArray1.add(contents);
								}
								jsonObject.fluentPut(String.valueOf(i+1),jsonArray1);
							}
						}
					}
				}
			}
			if(instream!=null){try {instream.close( );} catch (IOException e) {e.printStackTrace();}}
			return jsonObject.toJSONString();
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
	
	/**
	 * 注意这次startRowsIndex从头信息开始,因为我要用头信息//Excel行列索引是从0开始的
	 * */
	public static String getRowsForRecordOfExcelHaveHeadToJsonString(String excelPath,Integer sheetIndex,Integer startRowsIndex,Integer startColumnsIndex){
		try {
			//初始化一个jsonObject//然后添加一行一行的jsonArray
			JSONObject jsonObject=new JSONObject();
			JSONArray jsonArray=new JSONArray( );
			Workbook readwb = null;InputStream instream=null;
			try {instream = new FileInputStream(excelPath);} catch (FileNotFoundException e) {e.printStackTrace();}
			if(instream!=null){
				try {readwb = Workbook.getWorkbook(instream);} catch (Exception e) {e.printStackTrace();}
				if(readwb!=null){
					// Sheet的下标是从0开始
					// 获取第sheetIndex+1张Sheet表
					Sheet sheet = readwb.getSheet(sheetIndex);
					if(sheet!=null){
						// 获取Sheet表中所包含的总行数
						int totalRows = sheet.getRows();
						// 获取Sheet表中所包含的总列数//其实对应于实体的总共的字段数目
						int totalColumns = sheet.getColumns();
						if(totalRows!=0&&totalColumns!=0){
							List<String>headList=new ArrayList<String>( );//存放头信息
							for(int j=startColumnsIndex;j<totalColumns;j++){//循环添加所有头信息
								Cell cell = sheet.getCell(j,startRowsIndex);
								headList.add(cell.getContents());
							}
							//startRowsIndex是开始行的索引,因为第一行(索引0)有可能是个表头信息
							for (int i=startRowsIndex+1;i<totalRows;i++){//行循环
								JSONObject jsonObjectX=new JSONObject( );
								//startColumnsIndex指的是开始的那一列,一般默认为第0列
								for (int j=startColumnsIndex;j<totalColumns;j++){//列循环(循环字段)
									//得到第j列第i行的那个单元格
									Cell cell = sheet.getCell(j, i);
									//得到该单元格的内容
									String contents = cell.getContents();
									jsonObjectX.fluentPut(headList.get(j),contents);
								}
								jsonArray.add(jsonObjectX);
							}
							System.out.println("[Test[[[jsonArraySize="+jsonArray.size()+"!!]]]tseT]");
							jsonObject.fluentPut("allTabOfExcel", jsonArray);
						}
					}
				}
			}
			if(instream!=null){try {instream.close( );} catch (IOException e) {e.printStackTrace();}}
			return jsonObject.toJSONString();
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
	/**
	 * 实验我写的读取Excel的工具(读取成List)
	 */
	private void g( ){
		String excelPath="G:" + fgf + "zhongLiangFenLei.xls";
		Integer sheetIndex=0;
		Integer startRowsIndex=1;//行
		Integer startColumnsIndex=0;//列
		List<List<String>> excelList = getRowsForRecordOfExcelToListIntoList(excelPath,sheetIndex,startRowsIndex,startColumnsIndex);
		for(List<String> list:excelList){
			System.out.println(list);
		}
	}
	//下面是当时的实验,上面是封装的方法
	private void f() throws Exception{
		Workbook readwb = null;
		InputStream instream = new FileInputStream("G:" + fgf + "zhongLiangFenLei.xls");
		readwb = Workbook.getWorkbook(instream);
		// Sheet的下标是从0开始
		// 获取第一张Sheet表
		Sheet sheet0 = readwb.getSheet(0);
		// 获取Sheet表中所包含的总列数
		int totalColumns = sheet0.getColumns();
		System.out.println("总共有" + totalColumns + "列！");
		// 获取Sheet表中所包含的总行数
		int totalRows = sheet0.getRows();
		System.out.println("总共有" + totalRows + "行！");
		List<Hishop_Categories>hishop_CategoriesList=new ArrayList<Hishop_Categories>( );
		// 获取指定单元格的对象引用
		for (int i = 1; i < totalRows; i++){//行循环//从1开始是因为第0行是行头
				//for (int j = 0; j < totalColumns; j++){//列循环
				//Cell(细胞)其实指的是一个单元格
				//Cell cell = sheet0.getCell(j, i);
				//System.out.print(cell.getContents() + " ");//打印单元格的信息
					Cell cell0 = sheet0.getCell(0, i);//得到当前单元格(类目名称)
					Cell cell1 = sheet0.getCell(1, i);//得到类目id
					Cell cell2 = sheet0.getCell(2, i);//类目父级编码
					Cell cell3 = sheet0.getCell(3, i);//类目级别
					Cell cell4 = sheet0.getCell(4, i);//DisplaySequence
					Cell cell5 = sheet0.getCell(5, i);//Path
					//获得数据库一条记录的封装对象
					Hishop_Categories hishop_Categories=new Hishop_Categories( );
					hishop_Categories.setName(cell0.getContents());//这是类目名称
					//设置类目Id,要先判断是否为null,才能转换成int
					String contents = cell1.getContents();
					if(contents!=null){int contents1=Integer.parseInt(contents.trim());hishop_Categories.setCategoryId(contents1);}
					//设置类目父级编码
					contents=cell2.getContents();
					if(contents!=null){int contents2=Integer.parseInt(contents.trim());hishop_Categories.setParentCategoryId(contents2);}
					//设置类目级别Depth
					contents=cell3.getContents();
					if(contents!=null){int contents3=Integer.parseInt(contents.trim());hishop_Categories.setDepth(contents3);}
					//设置显示顺序DisplaySequence
					contents=cell4.getContents();
					if(contents!=null){int contents4=Integer.parseInt(contents.trim());hishop_Categories.setDisplaySequence(contents4);}
					//设置分类路径(自己搞)Path
					hishop_Categories.setPath(cell5.getContents());
					hishop_CategoriesList.add(hishop_Categories);
				//}
			System.out.println("-------------------------");
		}
		instream.close( );
		System.out.println(hishop_CategoriesList.get(0));
	}

}
