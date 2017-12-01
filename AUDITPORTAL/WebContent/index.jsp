<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AUDIT PORTAL LOGIN</title>
</head>
<body>
Welcome to AUDIT PORTAL
<form action="Navigator" method="post">
	Username: <input type="text" name="uloginid"   required="required" /><br/>
	Password: <input type="password" name="password"  required="required" />
	<br/>
	
	<br/>
	<input type="submit" name="nav" value="Log-in"/>
	</form>
	<br>
	<!--<form action="Navigator" method="post">

	  <input type="submit" name="nav" value="Sign-up"/>
	</form>-->
</body>
</html>