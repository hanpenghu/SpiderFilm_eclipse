package hanhan.utilsOfMd5_32AndPostAPI;

import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

import hanhan.utilsOfMd5_32AndPostAPI.source.MD5Utils;
import hanhan.utilsOfMd5_32AndPostAPI.source.testmain;

/**
 * author:韩韩 usage:封装md5加密工具和Post中粮接口返回数据的工具
 */
public class UtilsOfMd5AndPostZL {

	public UtilsOfMd5AndPostZL() {
	}

	public static String getMd5Str(String str) {

		return MD5Utils.generatePassword(str);
	}

	public static String getPostResult(String strUrl, Map<String, String> params) {

		HttpClient client = new HttpClient();
		try {
			HttpConnectionManagerParams managerParams = client
					.getHttpConnectionManager().getParams();
			// 设置连接超时时间(单位毫秒)
			managerParams.setConnectionTimeout(1*60*60*1000);
			// 设置读数据超时时间(单位毫秒)
			managerParams.setSoTimeout(10*60*1000);
			// client.setConnectionTimeout(3000);
			// client.getParams().setIntParameter("http.socket.timeout",3000);
			PostMethod postMethod = new PostMethod(strUrl);
			postMethod.addRequestHeader("Content-Type",
					"application/x-www-form-urlencoded;charset=UTF-8");
			// 3.设置请求参数
			postMethod.setParameter("method", params.get("method"));
			postMethod.setParameter("appkey", params.get("appkey"));
			postMethod.setParameter("sign", params.get("sign"));
			postMethod.setParameter("param", params.get("param"));
			// client.getParams().setIntParameter("http.socket.timeout",3);
			// 4.执行请求 ,结果码
			int code = client.executeMethod(postMethod);
//			System.out.println(code);
			// client.getParams().setIntParameter("http.socket.timeout",3);
			// 5. 获取结果
			String result = postMethod.getResponseBodyAsString();
			return result;
			// //
			// return testmain.net(strUrl, params,"POST");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
