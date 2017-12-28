<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN::HOME</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <h3>Welcome to Admin HomePage</h3>
   
	
	
	<%
       /*Features:
    	 -add/update/delete/list reviewers
    	 -add/update/delete/list PMOs
    	 -view all reports under "Reports tab"
    	*/	
	%>
	
	  <ul class="nav nav-tabs">
	  <li class="active"><a data-toggle="tab" href="#revCreation">Reviewer</a></li>
	  <li><a data-toggle="tab" href="#pm">PMO</a></li>
	  <li><a data-toggle="tab" href="#reports">Reports</a></li>
  </ul>

	<div class="tab-content">
	  <div id="revCreation" class="tab-pane fade in active">
	    <h3>REVIEWER CREATION</h3>
	    <p>ADD/ UPDATE/ DELETE/ LIST</p>
	    <ul class="nav nav-pills nav-stacked" role="tablist">
	    
	    <li class="active"><a href="AddUser.html">ADD</a></li>
	    <li><a href="UpdateUser.jsp">UPDATE</a></li>
	    <li><a href="RemoveUser.jsp">DELETE</a></li>
	    <li><a href="#">LIST</a></li>        
	  </ul>
	  </div>
	  <div id="pm" class="tab-pane fade">
	    <h3>PM CREATION</h3>
	    <p>ADD/ UPDATE/ DELETE/ LIST
	    <ul class="nav nav-pills nav-stacked" role="tablist">
	   
	    <li class="active"><a href="AddUser.html">ADD</a></li>
	    <li><a href="UpdateUser.jsp">UPDATE</a></li>
	    <li><a href="RemoveUser.jsp">DELETE</a></li>
	    <li><a href="#">LIST</a></li>        
	  </ul>
	    </p>
	  </div>
	  <div id="reports" class="tab-pane fade">
	    <h3>REPORTS</h3>
	    <p> View All Reports</p>
	  </div>
	</div>
	
	
	<br><br><br><br>
	
	 <form action="Navigator" method="post">
     
	<input type="submit" name="nav" value="Logout"/>
	</form>
	
</body>
</html>