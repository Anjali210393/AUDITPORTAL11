package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import beans.User;
import dao.DBConnector;

public class UserDao
{
	static Connection con=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static HttpSession session;
     //User loggedU=(User) session.getAttribute("User");
	static User u=new User();
	public static int addUser(String loginId,String email,String loc,String createdBy,String reviewer,String uType,String uActive,String uPass) throws SQLException 
	{
		 int st=0;
		 con=DBConnector.getConnector();
    	 ps=con.prepareStatement( "insert into tbl_user(uloginid,uemailid,ulocation,ucreated,ucreatedby,ureviewer,utype,uactive,Upass) values(?,?,?,NOW(),?,?,?,?,?)");  
    	 System.out.println("After prepare statement");
    	 ps.setString(1,loginId);  
    	 ps.setString(2,email);
    	 ps.setString(3,loc);
    	 //ps.setString(4,"NOW()");
    	 //String createdBy=(String)loggedU.getUloginid();
    	 ps.setString(4,createdBy);
    	 //String reviewer=(String)loggedU.getUloginid();
    	 ps.setString(5,reviewer);
    	 ps.setString(6,uType);
    	 ps.setString(7,uActive);
    	 ps.setString(8,uPass);
 		 st=ps.executeUpdate();
 		 System.out.println("St=="+st);
 		 
 		 
 		//u.setUid(id);
 		
 		User u=new User();
 		u.setUloginid(loginId);
		u.setUemailid(email);
	    u.setUlocation(loc);
	    
	    //for retrieving the value of creation date recorded dynamically in database
	    String created=null;
	    ps=con.prepareStatement("select ucreated from tbl_user where uloginid=?");
	    ps.setString(1, loginId);
	    rs=ps.executeQuery();
	    while(rs.next()) 
	      created=rs.getString("ucreated");
	    
	    if(created!=null)
	      u.setUcreated(created);
	    
	    u.setUcreatedby(createdBy);
	    u.setUreviewer(reviewer);
	    u.setUtype(uType);
	    u.setUactive(uActive);
	    u.setPassword(uPass);
	    //session.setAttribute("CreatedUser", u);
		return st;
	} 
	
	/*public static int editUser(String loginId,String email,String loc,String uType,String uActive,String uPass) throws SQLException 
	{
	   int st=0;
	   
	   return st;
	}*/
	
	public static User getUserDetails(String loginId)
	{
		//int st=0;
	    User u1=new User();
		try {
			ps=con.prepareStatement("select * from tbl_user where uloginid=?");
			ps.setString(1,loginId);
			rs=ps.executeQuery();
			while(rs.next())
			{
				int id=Integer.parseInt(rs.getString("uid"));
				String email=rs.getString("uemailid");
				String loc=rs.getString("Ulocation");
				String createdOn=rs.getString("Ucreated");
				String utype=rs.getString("Utype");
				String reviewer=rs.getString("ureviewer");
				String active=rs.getString("uactive"); 
				
				u1.setUid(id);
				u1.setUemailid(email);
			    u1.setUlocation(loc);
			    u1.setUcreated(createdOn);
			    u1.setUtype(utype);
			    u1.setUreviewer(reviewer);
			    u1.setUactive(active);
				System.out.println(id);
				System.out.println(email);
				System.out.println(loc);
				System.out.println(createdOn);
				System.out.println(utype);
		        //System.out.println(u1.getUtype());
			    //session.setAttribute("EdUser",u);
				
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u1;

	}
	public static boolean validate(User ln)
	{
		con=DBConnector.getConnector();
		System.out.println("in validation");
		boolean val=false;
		
		
		try {
			System.out.println("inside try");
			ps=con.prepareStatement("select * from tbl_user where uloginid=? and Upass=?");
			
			
			ps.setString(1,ln.getUloginid());
			ps.setString(2,ln.getPassword());	
			
			rs=ps.executeQuery();
			//val=rs.next();
			//System.out.println(val);
			while(rs.next())
			{
				//System.out.println(rs.getString("uloginid"));
				//System.out.println(rs.getString("Upass"));
			    val=true;
			

				
				int id=Integer.parseInt(rs.getString("uid"));
				String email=rs.getString("uemailid");
				String loc=rs.getString("Ulocation");
				String createdOn=rs.getString("Ucreated");
				String utype=rs.getString("Utype");
				
				ln.setUid(id);
				ln.setUemailid(email);
			    ln.setUlocation(loc);
			   //ln.setUcreated(createdOn);
			    ln.setUtype(utype);
				System.out.println(id);
				System.out.println(email);
				System.out.println(loc);
				System.out.println(createdOn);
				System.out.println(utype);
		        System.out.println(ln.getUtype());
				
		    }
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return val;
	
	}
	public static int delUser(String loginId) throws SQLException 
	{
		int st=0;
		ps=con.prepareStatement("delete from tbl_user where uloginid = ?");
		ps.setString(1,loginId);
	    st = ps.executeUpdate();
	    return st;
	}
	
}


