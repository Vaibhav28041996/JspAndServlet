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

if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}
%>
<h1>Welcome ${username} </h1>
<a href ="video.jsp"> click here for videos</a>
<form action="logout">
<input type="submit" value="logout">
</form>
</body>
</html>