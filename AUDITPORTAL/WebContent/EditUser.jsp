<%@page import="dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.User"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN PAGE ::User Updation</title>
<link rel = "stylesheet"   type = "text/css"   href = "css/style.css" />
</head>
<body>
  <div class=login align=center>
   <% String logId=request.getParameter("EdLogId");
      session.setAttribute("EdLogId",logId);
   %>
   <form action="Updation" method="post">
      <% User u=UserDao.getUserDetails(logId);
         System.out.println(u.getUemailid()+"  "+u.getUlocation()+"  "+u.getUactive());
       
         session.setAttribute("UserDet",u);
         User ud=(User)session.getAttribute("UserDet");
         System.out.println("After setting session attribute...."+ud.getUactive());
      %>
       User Login Id: <%=u.getUloginid() %><br><br> 
       User Email Id: <input type="email" name="uemail" value="<%=u.getUemailid() %>" ><br><br>
       User Location: <input type="text" name="uLoc" value="<%=u.getUlocation()%>"><br><br>
       User Type: <select> <option>RE</option><option>PM</option><option>AE</option> </select><!--  <input type="text" name="uType" value="RE" placeholder="Enter User Type" required>--><br><br>
      
       <!--   Enter Password: <input type="password" name="pass" placeholder="Enter Password" required> --><br><br>
      
       Reviewer: <input type="text" name="uReviewer" value="<%=u.getUreviewer() %>"><br><br>  
       User Type: <input type="text" name="uType" value="<%=u.getUtype()%>"><br><br>    
       Active: <input type="text" name="uActive" value="<%=u.getUactive() %>"><br><br> 
      <input type="submit" value="Update"> 
   </form>
  </div>
</body>
</html>