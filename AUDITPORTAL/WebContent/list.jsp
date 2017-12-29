<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>USER DATA LIST</title>

<link href="css/demo_table_jui.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet" />
<link href="css/demo_page.css" rel="stylesheet" />

<script src="js/jquery.js"></script>
<script src="js/jquery.dataTables.js"></script>
<script>
// Ajax call to Servlet to display data via DataTables
$(document).ready(function() {
        $(".jqueryDataTable").dataTable({
                "sPaginationType" : "full_numbers",
                "bProcessing" : false,
                "bServerSide" : false,
                "sAjaxSource" : "displayData",
                "bJQueryUI" : true,
                "aoColumns" : [
            { "mData": "uid" },
            { "mData": "uloginid" },
            { "mData": "uemailid" },
            { "mData": "Ulocation" },
            
            { "mData": "Ureviewer" },
            { "mData": "Utype" },
            { "mData": "Uactive" },
            
        ]
    } ); 
} );
</script>
</head>

<body id="dt_example">
<div id="container">
<h1>List of Users</h1>
<div id="demo_jui">
        <table class="display jqueryDataTable">
<thead>
<tr>
       <th>User id</th>
       <th>login id</th>
       <th>Email</th>
       <th>Location</th>
       <th>Reviewer</th>
       <th>Type</th>
       <th>Active</th>
</tr>
</thead>
<tbody>
</tbody>
</table>
</div>
</div>
</body>
</html>