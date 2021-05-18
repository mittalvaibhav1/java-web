<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App | Videos</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP v1.1
		if(session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<p>Videos...</p>
	<form action="logout">
		<input type="submit" value="Logout" />
	</form>
</body>
</html>