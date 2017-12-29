package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import beans.User;

import dao.DBConnector;

public class BusinessService {

	public static List<User> getNameList() {

        List<User> listOfName = new LinkedList<User>();
		ResultSet rs=null;
		Connection con=null;
		PreparedStatement ps=null;
        //ArrayList al=new ArrayList<String>();
        
		try {
				Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
		}
		try {
			con=DBConnector.getConnector();
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/auditdb?user=root&password=myroot");
			System.out.println("Inside try og Bu...");
		    ps=con.prepareStatement( "select * from tbl_user where utype=?");  
	    	 //((ResultSet) ps).getString(1);  
	    	 ps.setString(1,"PM");  
	    			       
	    	 rs=ps.executeQuery();  
	    	 while(rs.next())
	    	 {
	    		System.out.println(" id: "+rs.getString("uid")+"     login id:"+rs.getString("uloginid")+" email: "+rs.getString("uemailid")+" location:"+rs.getString("ulocation")+" Reviewer:"+rs.getString("ureviewer")+" Type:"+rs.getString("utype")+" Active:"+rs.getString("uactive")); 
	    		listOfName.add(new User(rs.getString("uid"),rs.getString("uloginid"),rs.getString("uemailid"),rs.getString("ulocation"),rs.getString("ureviewer"),rs.getString("utype"),rs.getString("uactive"))); 
	    	 }
	    	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
  
		
        return listOfName;
}
}
