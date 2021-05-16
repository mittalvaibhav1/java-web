<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add.jsp</title>
</head>
<body bgcolor="gainsboro">
	<% 
		try {
			int lol = 10 / 0;
		}
		catch(Exception ex) {
			out.println("Errorrr");
		}
	%>
</body>
</html>