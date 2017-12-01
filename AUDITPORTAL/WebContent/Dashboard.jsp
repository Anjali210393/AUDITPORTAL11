<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER DASHBOARD</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
      <h2>USER DASHBOARD</h2>
      <form method="post" action="Navigator">
      <% 
      /*User u=(User)request.getAttribute("user");
      RequestDispatcher rd;
      
        
        if (u.getUtype().equalsIgnoreCase("AD")) {
			rd=request.getRequestDispatcher("/AdminHome.jsp");
			rd.forward(request,response);
			request.getSession();
		} 
		else if(u.getUtype().equalsIgnoreCase("PM")){
			rd=request.getRequestDispatcher("/PMOHome.jsp");
			rd.forward(request,response);
			request.getSession();
		}
		else if(u.getUtype().equalsIgnoreCase("RE")){
			rd=request.getRequestDispatcher("/ReviewHome.jsp");
			rd.forward(request,response);
			request.getSession();
		}
		else if(u.getUtype().equalsIgnoreCase("AE")){
			rd=request.getRequestDispatcher("/AuditorHome.jsp");
			rd.forward(request,response);
			request.getSession();
		}
       */
      %>
      <%  //System.out.println(session.getAttribute("User"));
          System.out.println("Dispatched to dashboard: In dashboard"); %>
      <button type="submit" name="nav" value="dashboard">AUDIT PORTAL</button>
      </form>
  
</body>
</html>