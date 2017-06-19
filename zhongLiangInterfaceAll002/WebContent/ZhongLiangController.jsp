<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head> 
    <title>My JSP '07_linkbutton02.jsp' starting page</title>
  	<!-- 引入必要的jQuery组件 -->
  	<script type="text/javascript" src="js_EasyUIAndJqueryAndJavaScript/jquery.min.js"></script>
  	<!-- 下面是专门把页面显示英文转变成中文的javaScript文件 -->
  	<script type="text/javascript" src="js_EasyUIAndJqueryAndJavaScript/ViewChineseToUse/easyui-lang-zh_CN.js"></script>
  </head>
<body>
	<input type="button" value="点击更新中粮数据库并触发每隔一段时间更新一次,只点击一次,直到Tomcat死了再重启点击" id="button001" style="width:720px;height:25px;position:absolute;top:130;left:100"/>
	<!-- <input type="button" value="点击传JSON实验" id="button002" style="width:350px;height:25px;position:absolute;top:190;left:100"/> -->
	<input type="button" value="点击更新中粮数据库中的Hishop_Categories分类表,建议只更新一次,直到中粮通知需要更新再更新" id="button003" style="width:720px;height:25px;position:absolute;top:190;left:100"/>
	<input type="button" value="物流状态开始一个小时同步一次,主要把各个订单的已付款同步成已经发货,注意只点击一次就好" id="button004" style="width:720px;height:25px;position:absolute;top:240;left:100"/>
	<script type="text/javascript">
		$("#button004").click(function(){
			//后面的参数是为了微软IE不适应才做的
			var url='${pageContext.request.contextPath}/zl/startSyncZlLogistics.action?time='+new Date( ).getTime();
			//senddata可以用也可以不用//用的话格式必须是JSON
			var senddata={"str":"物流同步开始"};
			$.post(url,senddata,function(backdata){
				window.document.write(backdata);
			});
		});
	</script>
	<script type="text/javascript">
		$("#button001").click(function(){
			//后面的参数是为了微软IE不适应才做的
			var url='${pageContext.request.contextPath}/zl/startZLsync.action?time='+new Date( ).getTime();
			//senddata可以用也可以不用//用的话格式必须是JSON
			var senddata={"str":"你好"};
			$.post(url,senddata,function(backdata){
				window.document.write(backdata);
			});
		});
	</script>
	<script type="text/javascript">
		$("#button002").click(function(){
			//后面的参数是为了微软IE不适应才做的
			var url='${pageContext.request.contextPath}/zl/xxx.action?time='+new Date( ).getTime();
			//senddata可以用也可以不用//用的话格式必须是JSON
			//必须传JSON,并且str必须是springMVC中的实体man的属性名字(一个字母都不能差)
			var senddata={str:"你好"};
			$.post(url,senddata,function(data){
				alert("哈哈");
				window.document.write(data.str);
			});
		});   	 
	</script>
	<script type="text/javascript">
		$("#button003").click(function(){
			//后面的参数是为了微软IE不适应才做的
			var url='${pageContext.request.contextPath}/zl/startSyncZLHishop_Categories.action?time='+new Date( ).getTime();
			//senddata可以用也可以不用//用的话格式必须是JSON
			var senddata={"str":"你好"};
			$.post(url,senddata,function(backdata){
				window.document.write(backdata);
			});
		});
	</script>
</body>
</html>

















