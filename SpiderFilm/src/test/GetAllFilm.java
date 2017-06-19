package test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.utilsOfHanHan.HttpHanHan;
import com.utilsOfHanHan.MD5Utils;

public class GetAllFilm {
	private String filetypeJson="json";
	private String filetypeXml="xml";
	private String sendMethod1="POST";
	private String sendMethod2="GET";
	private String urlCe="http://test.spider.com.cn:9391/v2/{商户key}/{method}.html";
	private String urlZheng="http://filmapi.spider.com.cn/v2/{商户key}/{method}.html";
	private String sign=null;
	private String key="ceshi";
	private String secret="0051657786";
	@SuppressWarnings("rawtypes")
	private Map params=new HashMap( );
	public String f() throws Exception{
		String filmId="";
		this.sign=MD5Utils.generatePassword(filmId+this.key+this.secret);
		//设置返回参数类型
		this.params.put("filetype",filetypeJson);
		//设置key
		this.params.put("key",key);
		//设置签名,签名包含了secret私匙
		this.params.put("sign",sign);
		this.params.put("filmId", filmId);
		String url="http://filmapi.spider.com.cn/v2/"+key+"/filmList.html";
		return HttpHanHan.net(url,params,sendMethod1);
	}
	public static void main(String[ ] args) throws Exception{
		String str=new GetAllFilm( ).f();
		JSONObject jo = JSON.parseObject(str);
		JSONArray ja = jo.getJSONArray("data");
		System.out.println(ja.size());
	}
}
