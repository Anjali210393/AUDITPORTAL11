<%@page import="dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN :: User Update</title>
</head>
<body>
 <h2> Update User Details </h2><br><br>
  <form action="EditUser.jsp" method="post">
    Login ID:<input type="text" name="EdLogId"><br>
   
    <input type="submit" value="Edit">
    
  </form>
  <%
    //String log=request.getParameter("EdLogId");
    //if(UserDao.getUserDetails(log)==0)
  %>
  <!--<h3>User doesnt exist!!</h3>-->
</body>
</html>