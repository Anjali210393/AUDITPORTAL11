<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
a:link {
    color: green;
    background-color: transparent;
    text-decoration: none;
}
a:visited {
    color: pink;
    background-color: transparent;
    text-decoration: none;
}
a:hover {
    color: red;
    background-color: transparent;
    text-decoration: underline;
}
a:active {
    color: yellow;
    background-color: transparent;
    text-decoration: underline; 
}
button {
	width: 300px;
	padding: 20px;
	cursor: pointer;
	font-weight: bold;
	font-size: 150%;
	background: #3366cc;
	color: #fff;
	border: 1px solid #3366cc;
	border-radius: 10px;
	-moz-box-shadow:: 6px 6px 5px #999;
	-webkit-box-shadow:: 6px 6px 5px #999;
	box-shadow:: 6px 6px 5px #999;
}
button:hover {
     color: #ffff00;
	 background: #000;
	 border: 1px solid #fff;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AUDIT PORTAL :: SUCCESSFULLY REGISTERED </title>
</head>
<body>
    <h3 style="font color:red">User Successfully Registered</h3>

    <p>Would you like to add more users? <a href="AddUser.html">Yes</a><br><br><br>
      
    <a href="AdminHome.jsp"><button>Back to Admin Home</button></a>
    </p>
</body>
</html>