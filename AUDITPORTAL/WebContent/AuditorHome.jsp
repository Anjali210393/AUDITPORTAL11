<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<title>AUDITOR::HOME</title>
</head>
<body>
<h3>Welcome to Auditor HomePage</h3>

   <% /*Features:
    	- physical audit : add new system/ update/ delete
    	- view all reports: completed/monthly
   */%>

	
	<ul class="nav nav-tabs">
	  <li class="active"><a data-toggle="tab" href="#phyAudit">Physical Audit</a></li>
	  <li><a data-toggle="tab" href="#viewReports">View Reports</a></li>
    </ul>

	<div class="tab-content">
	  <div id="phyAudit" class="tab-pane fade in active">
	    <h3>Physical Audit</h3>
	    <p>ADD new system/ Update/ Delete</p>
	    <ul class="nav nav-pills nav-stacked" role="tablist">
	    
	    <li class="active"><a href="">ADD SYSTEM</a></li>
	    <li><a href="UpdateUser.jsp">UPDATE</a></li>
	    <li><a href="#">DELETE</a></li>       
	  </ul>
	  </div>
	  
	  <div id="viewReports" class="tab-pane fade">
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