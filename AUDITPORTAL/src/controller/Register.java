package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import utilities.Utilities;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;   
    
    public Register() {
    	
   }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    int st=0;
	    RequestDispatcher rd=null;
	    
	    String loginId=request.getParameter("uLogId");
	    String email=request.getParameter("uemail");
	    String loc=request.getParameter("uLoc");
	    //String created;
	   // User u=(User)session.getAttribute("LoggedUser");
	    
	    String createdBy="AA00436589";//u.getUloginid();
	    String reviewer="AA00436589";//u.getUloginid();
	    String uType=request.getParameter("uType");
	    String uActive=request.getParameter("uActive");
	    String uPass=Utilities.genPassword();
	    
	    try {
			st=dao.UserDao.addUser(loginId, email, loc,createdBy,reviewer, uType, uActive, uPass);
			if(st>0)
		    {
		    	    rd=request.getRequestDispatcher("RegisterSuccess.jsp");  
				    rd.forward(request,response);  
		    }
		    else
		    {
				    out.print("Sorry !! There seems to be some problem adding this entry.");  
				    rd=request.getRequestDispatcher("AddUser.html");  
				    rd.include(request,response);  
				
		    }
		    
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    
	}

	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}*/

}
