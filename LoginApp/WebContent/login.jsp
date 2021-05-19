<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App | Login</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP v1.1
		response.setHeader("Pragma", "no-cache"); // HTTP v1.0
		response.setHeader("Expires", "0"); // Proxies
		
		if(session.getAttribute("username") != null) {
			response.sendRedirect("welcome.jsp");
		}
	%>
	<form action="login" method="POST">
		<label for="uname"> Enter Username: </label> <input type="text" name="uname" /> <br /> <br />
		<label for="pass"> Enter Password: </label> <input type="password" name="pass" /> <br /> <br />
		<input type="submit" value="Login" />
	</form>
</body>
</html>