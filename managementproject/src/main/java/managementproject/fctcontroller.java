package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import managementproject.classes.facultynl;

public class fctcontroller extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("t1");
		String password=req.getParameter("t2");
		
		facultydao dao=new facultydao();
		
		
	    facultynl nl=dao.check(id,password);
	    
	        HttpSession session=req.getSession();
	        session.setAttribute("names",nl);
			
			RequestDispatcher rd=req.getRequestDispatcher("faculty.jsp");
		
			rd.forward(req, res);
			
			RequestDispatcher rd1=req.getRequestDispatcher("viewfacultfromf.jsp");
			rd.forward(req, res);
		
	
		}
	}




	


