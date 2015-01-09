<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    	<title>Login</title>
    
 		<meta http-equiv="pragma" content="no-cache">
 		<meta http-equiv="cache-control" content="no-cache">
 		<meta http-equiv="expires" content="0">    
 		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
 		<meta http-equiv="description" content="This is my page">
	</head>
  	<body>
   		<s:form action="/login" method="post">
    	<s:label value="系统登陆"></s:label>
    	<s:textfield name="username" label="账号" />
    	<s:password name="password" label="密码" />
    	<s:submit value="登录" />
   		</s:form>
	</body>
</html>