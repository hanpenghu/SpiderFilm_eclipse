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
	<input type="button" value="实验" id="button004" style="width:720px;height:25px;position:absolute;top:240;left:100"/>
	<script type="text/javascript">
		$("#button004").click(function(){
			//后面的参数是为了微软IE不适应才做的
			var url='${pageContext.request.contextPath}/test/tt.action?time='+new Date( ).getTime();
			//senddata可以用也可以不用//用的话格式必须是JSON
			var senddata={"str":"韩韩"};
			$.post(url,senddata,function(backdata){
				window.document.write(backdata);
			});
		});
	</script>
	
</body>
</html>

















