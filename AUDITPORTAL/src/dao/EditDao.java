package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

public class EditDao 
{
	static Connection con=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static HttpSession session;
    
	static int st;
	public static int editActive(String logId,String uActive) 
	{
		System.out.println("Inside try of editActive..");
		System.out.println(logId+"    "+uActive);
		try {
			con.prepareStatement("update tbl_user set uactive = ? where ulogid = ?");
			ps.setString(1,uActive);
			ps.setString(2,logId );
			System.out.println(logId+"    "+uActive);
			st=ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
	public static int editEmail(String logId,String uEmail) 
	{
		try {
			con.prepareStatement("update tbl_user set uactive = ? where ulogid = ?");
			ps.setString(1,logId);
			ps.setString(2, uEmail);
			st=ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
	public static int editLocation(String logId,String uLoc) 
	{
		try {
			con.prepareStatement("update tbl_user set uactive = ? where ulogid = ?");
			ps.setString(1,logId);
			ps.setString(2, uLoc);
			st=ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
	public static int editUType(String logId,String uType) 
	{
		try {
			con.prepareStatement("update tbl_user set uactive = ? where ulogid = ?");
			ps.setString(1,logId);
			ps.setString(2, uType);
			st=ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
	public static int editReviewer(String logId,String uReviewer) 
	{
		try {
			con.prepareStatement("update tbl_user set uactive = ? where ulogid = ?");
			ps.setString(1,logId);
			ps.setString(2, uReviewer);
			st=ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
}
