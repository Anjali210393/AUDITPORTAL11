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

import dao.UserDao;

@WebServlet("/Deletion")
public class Deletion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    RequestDispatcher rd=null;
    
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 	{
		//doGet(request, response);
        
		response.setContentType("text/html");
		String logId=request.getParameter("DelLogId");
		int st=0;
		PrintWriter out=response.getWriter();
		try {
			st = UserDao.delUser(logId);
			System.out.println("st=="+st);
			if(st>0)
			{
				//successfully deleted
				out.print("<font color=blue><p>User Successfully Removed!</p></font");  
		        RequestDispatcher rd=request.getRequestDispatcher("/RemoveUser.jsp");  
		        rd.include(request, response);  
			}
			else
			{  //not deleted 
				out.print("<font color=blue><p>Sorry!!We Encountered a Problem.. </p></font");  
		        RequestDispatcher rd=request.getRequestDispatcher("/RemoveUser.jsp");  
		        rd.include(request, response);  
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		/*if(st>0)
		{
			//successfully deleted
			out.print("<font color=blue><p>User Successfully Removed!</p></font");  
	        RequestDispatcher rd=request.getRequestDispatcher("/RemoveUser.jsp");  
	        rd.include(request, response);  
		}
		else
		{  //not deleted 
			out.print("<font color=blue><p>Sorry!!We Encountered a Problem.. </p></font");  
	        RequestDispatcher rd=request.getRequestDispatcher("/RemoveUser.jsp");  
	        rd.include(request, response);  
		}*/
	}
			
}


