package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import dao.EditDao;

@WebServlet("/Updation")
public class Updation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Updation() {
        super();
    }
    int st;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath()); 
		HttpSession session=request.getSession();
		System.out.println("in do post....");
		System.out.println(request.getParameter("uActive"));
		
		User det=(User) session.getAttribute("UserDet");
		System.out.println("we have user object: "+det);
		String logId=(String) session.getAttribute("EdLogId");
		
		if(det.getUactive()!=request.getParameter("uActive"))
		{
			System.out.println("Inside do post... for updation.java    "+det.getUloginid()+""+det.getUactive()+"---"+request.getParameter("uActive"));
			st=EditDao.editActive(logId,request.getParameter("uActive"));
			System.out.println("Status is"+ st);
		
		}
		else if(det.getUemailid() !=request.getParameter("uemail"))
		{
			st=EditDao.editEmail(logId,request.getParameter("uemail"));
		}
		else if(det.getUlocation() !=request.getParameter("uLoc"))
		{
			st=EditDao.editLocation(logId,request.getParameter("uLoc"));
		}
		else if(det.getUtype() !=request.getParameter("uType"))
		{
			st=EditDao.editUType(logId,request.getParameter("uType"));
		}
		else if(det.getUreviewer() !=request.getParameter("uReviewer"))
		{
			st=EditDao.editReviewer(logId,request.getParameter("uReviewer"));
		}
			
		
	}

	
}
