package com.you_fuli.spiderFilm.controller.test;

import java.io.UnsupportedEncodingException;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "/test")
@Controller
public class Test0 {
	
	
	

	@RequestMapping(value="/tt",method=RequestMethod.POST,produces =  {"text/html;charset=UTF-8"})
	public @ResponseBody String test(@Param("str")String str) throws UnsupportedEncodingException{
		//iso-8859-1是Tomcat的默认编码
//		System.out.println("test方法得到的参数是: "+new String(str.getBytes("iso-8859-1"),"UTF-8"));
		System.out.println("test方法得到的参数是: "+str);
		return "SUCCESS";
	}
	
	
	
	
	//加上@ResponseBody和@RequestBody之后,jackson包会把实体自动解析为JSON
	@RequestMapping(value = "/t",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
	public @ResponseBody Man shiYanJson(@RequestBody Man man){
		System.out.println("传过来到接口的东西："+man);
		man.setAge(23);
		man.setName("大大");
		return man;
	}
}
