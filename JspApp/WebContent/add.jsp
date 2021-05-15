<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add.jsp</title>
</head>
<body bgcolor="gainsboro">
	<% 
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;
		out.println("JSP IMPLICIT OBJECTS <br/>");
	%>
	<%= "Output is " + k %>
</body>
</html>