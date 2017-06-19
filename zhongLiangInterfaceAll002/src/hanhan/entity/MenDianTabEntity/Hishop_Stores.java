package hanhan.entity.MenDianTabEntity;
//门店表
public class Hishop_Stores {
	public Hishop_Stores() {}
//////////////////////////////////////////////////////////////////////////////
	int StoreId	;//int	门店id
	int ManagerId	;//int	管理员id
	String StoreName	;//nvarchar(100)	门店名称
	int TopRegionId	;//int	上次区域标识
	int RegionId	;//int	区域标识
	String Address	;//nvarchar(100)	地址
	String ContactMan	;//nvarchar(50)	联系人
	String Tel	;//nvarchar(50)	手机
	int State	;//int	是否暂停门店
	boolean CloseStatus;//	bit	是否关闭门店
	String WxAddress	;//nvarchar(100)	微信门店地址
	double Longitude	;//float	经度
	double Latitude	;//float	纬度
	String WXBusinessName	;//nvarchar(100)	微信门店名
	String WXBranchName	;//nvarchar(100)	微信分店名
	String WXCategoryName	;//nvarchar(100)	类目
	String StoreImages	;//nvarchar(4000)	门店图片
	String WXTelephone	;//nvarchar(50)	微信电话
	int WXAvgPrice	;//int	人均价格(元)
	String WXOpenTime	;//nvarchar(50)	营业时间
	String WXRecommend	;//nvarchar(300)	推荐
	String WXSpecial	;//nvarchar(300)	特色服务
	String WXIntroduction	;//nvarchar(300)	简介
	String WXSId;//nvarchar(16)	门店签名 商户自己内部ID,审核UniqId
	long WXPoiId	;//bigint	微信的门店ID，微信内门店唯一标示ID
	int WXState	;//int	微信审核状态
	String WXOpenId	;//nvarchar(128)	微信OpenId
	int ServeRadius	;//int	服务半径
	String FullRegionPath	;//Varchar(200)	地址全路径
//////////////////////////////////////////////////////////////////////////////
	public int getStoreId() {
		return StoreId;
	}
	public void setStoreId(int storeId) {
		StoreId = storeId;
	}
	public int getManagerId() {
		return ManagerId;
	}
	public void setManagerId(int managerId) {
		ManagerId = managerId;
	}
	public String getStoreName() {
		return StoreName;
	}
	public void setStoreName(String storeName) {
		StoreName = storeName;
	}
	public int getTopRegionId() {
		return TopRegionId;
	}
	public void setTopRegionId(int topRegionId) {
		TopRegionId = topRegionId;
	}
	public int getRegionId() {
		return RegionId;
	}
	public void setRegionId(int regionId) {
		RegionId = regionId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactMan() {
		return ContactMan;
	}
	public void setContactMan(String contactMan) {
		ContactMan = contactMan;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public boolean isCloseStatus() {
		return CloseStatus;
	}
	public void setCloseStatus(boolean closeStatus) {
		CloseStatus = closeStatus;
	}
	public String getWxAddress() {
		return WxAddress;
	}
	public void setWxAddress(String wxAddress) {
		WxAddress = wxAddress;
	}
	public double getLongitude() {
		return Longitude;
	}
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}
	public double getLatitude() {
		return Latitude;
	}
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}
	public String getWXBusinessName() {
		return WXBusinessName;
	}
	public void setWXBusinessName(String wXBusinessName) {
		WXBusinessName = wXBusinessName;
	}
	public String getWXBranchName() {
		return WXBranchName;
	}
	public void setWXBranchName(String wXBranchName) {
		WXBranchName = wXBranchName;
	}
	public String getWXCategoryName() {
		return WXCategoryName;
	}
	public void setWXCategoryName(String wXCategoryName) {
		WXCategoryName = wXCategoryName;
	}
	public String getStoreImages() {
		return StoreImages;
	}
	public void setStoreImages(String storeImages) {
		StoreImages = storeImages;
	}
	public String getWXTelephone() {
		return WXTelephone;
	}
	public void setWXTelephone(String wXTelephone) {
		WXTelephone = wXTelephone;
	}
	public int getWXAvgPrice() {
		return WXAvgPrice;
	}
	public void setWXAvgPrice(int wXAvgPrice) {
		WXAvgPrice = wXAvgPrice;
	}
	public String getWXOpenTime() {
		return WXOpenTime;
	}
	public void setWXOpenTime(String wXOpenTime) {
		WXOpenTime = wXOpenTime;
	}
	public String getWXRecommend() {
		return WXRecommend;
	}
	public void setWXRecommend(String wXRecommend) {
		WXRecommend = wXRecommend;
	}
	public String getWXSpecial() {
		return WXSpecial;
	}
	public void setWXSpecial(String wXSpecial) {
		WXSpecial = wXSpecial;
	}
	public String getWXIntroduction() {
		return WXIntroduction;
	}
	public void setWXIntroduction(String wXIntroduction) {
		WXIntroduction = wXIntroduction;
	}
	public String getWXSId() {
		return WXSId;
	}
	public void setWXSId(String wXSId) {
		WXSId = wXSId;
	}
	public long getWXPoiId() {
		return WXPoiId;
	}
	public void setWXPoiId(long wXPoiId) {
		WXPoiId = wXPoiId;
	}
	public int getWXState() {
		return WXState;
	}
	public void setWXState(int wXState) {
		WXState = wXState;
	}
	public String getWXOpenId() {
		return WXOpenId;
	}
	public void setWXOpenId(String wXOpenId) {
		WXOpenId = wXOpenId;
	}
	public int getServeRadius() {
		return ServeRadius;
	}
	public void setServeRadius(int serveRadius) {
		ServeRadius = serveRadius;
	}
	public String getFullRegionPath() {
		return FullRegionPath;
	}
	public void setFullRegionPath(String fullRegionPath) {
		FullRegionPath = fullRegionPath;
	}
//////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Hishop_Stores [StoreId=" + StoreId + ", ManagerId=" + ManagerId + ", StoreName=" + StoreName
				+ ", TopRegionId=" + TopRegionId + ", RegionId=" + RegionId + ", Address=" + Address + ", ContactMan="
				+ ContactMan + ", Tel=" + Tel + ", State=" + State + ", CloseStatus=" + CloseStatus + ", WxAddress="
				+ WxAddress + ", Longitude=" + Longitude + ", Latitude=" + Latitude + ", WXBusinessName="
				+ WXBusinessName + ", WXBranchName=" + WXBranchName + ", WXCategoryName=" + WXCategoryName
				+ ", StoreImages=" + StoreImages + ", WXTelephone=" + WXTelephone + ", WXAvgPrice=" + WXAvgPrice
				+ ", WXOpenTime=" + WXOpenTime + ", WXRecommend=" + WXRecommend + ", WXSpecial=" + WXSpecial
				+ ", WXIntroduction=" + WXIntroduction + ", WXSId=" + WXSId + ", WXPoiId=" + WXPoiId + ", WXState="
				+ WXState + ", WXOpenId=" + WXOpenId + ", ServeRadius=" + ServeRadius + ", FullRegionPath="
				+ FullRegionPath + "]";
	}
	
//////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////