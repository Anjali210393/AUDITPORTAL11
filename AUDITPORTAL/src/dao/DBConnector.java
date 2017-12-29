package dao;

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
	public static Connection getConnector(){ 
		try {
            System.out.println("trying to connect");
			Class.forName ("com.mysql.jdbc.Driver"); 
			cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/auditdb?user=root&password=myroot");
			if(cnn != null) System.out.println("Connected..");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		} catch (SQLException e) {
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
     
	
	}
