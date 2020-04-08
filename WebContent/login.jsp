<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//Prevent Back Button After logout(Http 1.1)
response.setHeader("pragma","no-cache");//(Http 1.0)
response.setHeader("Expires","0");//proxies
%>
<form action="login" method="post">
Enter Username:<input type="text" name="uname"></br>
Enter Password:<input type="password" name="pwd"></br>
<input type="submit" value="Login">
</form>
</body>
</html>