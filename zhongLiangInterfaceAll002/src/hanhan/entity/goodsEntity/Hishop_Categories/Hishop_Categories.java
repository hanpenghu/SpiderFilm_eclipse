package hanhan.entity.goodsEntity.Hishop_Categories;

public class Hishop_Categories {
	int CategoryId=1;//Int 	分类编号 (有)
	String Name=""	;//nvarchar(100) 	分类名称(界面自己搞)
	int DisplaySequence=1	;//Int 	显示顺序(界面自己搞)
	String Meta_Title=null	;//Nvarchar(1000) NULL	分类页面标题(页面自己搞)
	String Meta_Description=null;//	nvarchar(1000) NULL	分类页面描述(自己搞)
	String Meta_Keywords=null;//	nvarchar(1000) NULL	分类页面搜索关键字(自己搞)
	int ParentCategoryId=1;//	Int NULL	上级分类编号(自己搞)
	int Depth=1	;//Int 	分类是几级(自己搞)
	String Path	="";//nvarchar(4000) 	分类路径(自己搞)
	String RewriteName=null;//	nvarchar(50) NULL	URL重写命名(自己搞)
	String SKUPrefix=null	;//Nvarchar(10) NULL	货号前缀(自己搞)
	int AssociatedProductType=1;//	Int NULL	商品类型(自己搞)
	String Notes1=null	;//Ntext NULL	分类广告一
	String Notes2=null	;//Ntext NULL	分类广告二
	String Notes3=null	;//Ntext NULL	分类广告三
	String Notes4=null	;//Ntext NULL	分类广告四
	String Notes5	=null;//Ntext NULL	分类广告五
	String Theme=null	;//nvarchar(50) NULL	分类模板名
    boolean HasChildren=false;//	Bit 	是否存下级分类
	String Icon=null	;//Nvarhcar(1000) NULL	图标地址
	String BigImageUrl="";//	nvarchar(1000)	大图
	public Hishop_Categories() {}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDisplaySequence() {
		return DisplaySequence;
	}
	public void setDisplaySequence(int displaySequence) {
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
	public int getParentCategoryId() {
		return ParentCategoryId;
	}
	public void setParentCategoryId(int parentCategoryId) {
		ParentCategoryId = parentCategoryId;
	}
	public int getDepth() {
		return Depth;
	}
	public void setDepth(int depth) {
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
	public int getAssociatedProductType() {
		return AssociatedProductType;
	}
	public void setAssociatedProductType(int associatedProductType) {
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
		return "Hishop_Categories [CategoryId=" + CategoryId + ", Name=" + Name + ", DisplaySequence=" + DisplaySequence
				+ ", Meta_Title=" + Meta_Title + ", Meta_Description=" + Meta_Description + ", Meta_Keywords="
				+ Meta_Keywords + ", ParentCategoryId=" + ParentCategoryId + ", Depth=" + Depth + ", Path=" + Path
				+ ", RewriteName=" + RewriteName + ", SKUPrefix=" + SKUPrefix + ", AssociatedProductType="
				+ AssociatedProductType + ", Notes1=" + Notes1 + ", Notes2=" + Notes2 + ", Notes3=" + Notes3
				+ ", Notes4=" + Notes4 + ", Notes5=" + Notes5 + ", Theme=" + Theme + ", HasChildren=" + HasChildren
				+ ", Icon=" + Icon + ", BigImageUrl=" + BigImageUrl + "]";
	}
	
}
