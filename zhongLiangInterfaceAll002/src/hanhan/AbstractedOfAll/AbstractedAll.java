package hanhan.AbstractedOfAll;
import hanhan.utilsOfMd5_32AndPostAPI.UtilsOfReadProperties;
public abstract class AbstractedAll {
	public  String strUrl = "";//zhiNeng zai ci lei fu zhi
	public  String method = "";//zhi neng zai ci lei fu zhi
	public  String appkey = "";//zhi neng zai ci lei fu zhi
	public  String appsecret ="";//zhi neng zai ci lei fu zhi
	public AbstractedAll() {
		//attention: those Abstracet class give us some params for global variable
		//then  i never set the param to final
		//dan shi ren he  ren bu de zai "chu le ci lei" yi wai de di fang gei zhe xie bian liang fuZhi
		// fou ze chu xian luo ji cuo wu
		String[ ]strs={"","","",""};
		try {
			strs=UtilsOfReadProperties.getValue("strUrl","method","appkey","appsecret","hanhan.zhongLiangTongBuKuKuangJia.xml.b004C3P0.manJDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.strUrl=strs[0];this.method=strs[1];this.appkey=strs[2];this.appsecret=strs[3];
	}

}
