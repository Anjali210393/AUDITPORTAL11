import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import dbconnector.DBConnector;
import jdk.internal.dynalink.beans.StaticClass;


public class Navigator extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
	ServletContext ctx;
	ServletConfig cgf;

	PrintWriter pw;
	DBConnector db=new DBConnector();
	HttpSession ss;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
				System.out.println("in servlet do post");
		
			
				pw=response.getWriter();
				response.setContentType("text/html");
				String param=request.getParameter("nav");
				 User ln=new User();
				
				
				if(param.equalsIgnoreCase("Log-in"))
				{
		
					
		
		
					String uloginid=request.getParameter("uloginid");
					String password=request.getParameter("password");
		
					ln.setUloginid(uloginid);
					ln.setPassword(password);
		
		
		
					if(db.validate(ln))
					{
						request.getSession().setAttribute("User", uloginid);
						
		                System.out.println("Validated"); 
		                rd=request.getRequestDispatcher("/Dashboard.jsp");
		                rd.forward(request, response);
		                ss=request.getSession();
		              		
					}
					else
					{		rd=request.getRequestDispatcher("/errorpage.jsp");
					        rd.forward(request,response);
					}
		
				
				super.doPost(request, response);
			}
			
			
		    if(param.equalsIgnoreCase("dashboard"))
			{
		    	//User ln=new User();
		    	System.out.println("In navigator to find usertype");
				System.out.println("Utype: "+ln.getUtype());
				System.out.println(ln.getUid());
				
				//request.getAttribute("user");
			
					if (ln.getUtype().equalsIgnoreCase("AD")) {
						rd=request.getRequestDispatcher("/AdminHome.jsp");
						rd.forward(request,response);
						ss = request.getSession();
					} 
					else if(ln.getUtype().equalsIgnoreCase("PM")){
						rd=request.getRequestDispatcher("/PMOHome.jsp");
						rd.forward(request,response);
						ss = request.getSession();
					}
					else if(ln.getUtype().equalsIgnoreCase("RE")){
						rd=request.getRequestDispatcher("/ReviewHome.jsp");
						rd.forward(request,response);
						ss = request.getSession();
					}
					else if(ln.getUtype().equalsIgnoreCase("AE")){
						rd=request.getRequestDispatcher("/AuditorHome.jsp");
						rd.forward(request,response);
						ss = request.getSession();
					}
					else
					{		rd=request.getRequestDispatcher("/errorpage.jsp");
					        rd.forward(request,response);
					}
		
					
				}
		    if(param.equalsIgnoreCase("Logout"))
			{
		    	    HttpSession session=request.getSession();  
		    	    session.removeAttribute("User");
		            session.invalidate();
		            System.out.println("logout successful");
		            rd=request.getRequestDispatcher("/index.jsp");
					rd.forward(request,response);
					
				}

}
}
