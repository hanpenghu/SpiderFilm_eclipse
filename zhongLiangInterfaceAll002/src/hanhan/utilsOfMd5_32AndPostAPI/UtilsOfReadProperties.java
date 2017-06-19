package hanhan.utilsOfMd5_32AndPostAPI;
import java.util.ResourceBundle;
public class UtilsOfReadProperties {
	
	public UtilsOfReadProperties() {}
	
	public static String getValueCommon(String key,String propertiesFileQualityNameHadNoPrefix){
		ResourceBundle bundle=null;String string="";
		try {
			bundle = ResourceBundle.getBundle(propertiesFileQualityNameHadNoPrefix);
			string = bundle.getString(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return string;
	}
	
	public static String[ ] getValue(String strUrl,String method,String appkey,String appsecret,String propertiesFileQualityNameHadNoPrefix){
		ResourceBundle bundle=null;
		String strUrl1="";
		String method1="";
		String appkey1="";
		String appsecret1="";
		try {
			bundle = ResourceBundle.getBundle(propertiesFileQualityNameHadNoPrefix);
			strUrl1 = bundle.getString(strUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			method1 = bundle.getString(method);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			appkey1 = bundle.getString(appkey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			appsecret1 = bundle.getString(appsecret);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return new String[]{strUrl1,method1,appkey1,appsecret1};
	}
	
}
