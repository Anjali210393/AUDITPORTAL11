package dbconnector;

import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

import beans.User;

public class DBConnector {

	static Connection cnn=null;
	PreparedStatement pstat;
	ResultSet result;
	String pass;
	Statement stat;
	String ltype;
	public static Connection connector(){ 
		try {
System.out.println("trying to connect");
			Class.forName ("com.mysql.jdbc.Driver"); 
			cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=myroot");
			if(cnn != null) System.out.println("Connected..");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnn;
	}


	public static void disConnector(){
		try {
			cnn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean validate(User ln){
		DBConnector.connector();
		System.out.println("in validation");
		boolean val=false;
		try {
			pstat=cnn.prepareStatement("select * from tbl_user where uloginid=? and Upass=?");
			//pstat.setString(1, "SX00507474");
			//pstat.setString(2,"RAM");
			pstat.setString(1,ln.getUloginid());
			pstat.setString(2,ln.getPassword());	
			//final String s = ln.getPassword();
			//final byte[] authBytes = s.getBytes(StandardCharsets.UTF_8);
			//final String encoded = Base64.getEncoder().encodeToString(authBytes);
		    //pstat.setString(2,encoded);	
			result=pstat.executeQuery();
			if(result.next()){
				int id=Integer.parseInt(result.getString("uid"));
				String email=result.getString("uemailid");
				String loc=result.getString("Ulocation");
				String createdOn=result.getString("Ucreated");
				String utype=result.getString("Utype");
				
				ln.setUid(id);
				ln.setUemailid(email);
			    ln.setUlocation(loc);
			    ln.setUcreated(createdOn);
			    ln.setUtype(utype);
				System.out.println(id);
				System.out.println(email);
				System.out.println(loc);
				System.out.println(createdOn);
				System.out.println(utype);
				System.out.println(ln.getUtype());
				//ln.setCust_name(result.getString("cust_name"));
				//ln.setCust_type(result.getString("cust_type"));
                //ln.setUtype(result.getString("Utype"));
				val=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;


	}
}
