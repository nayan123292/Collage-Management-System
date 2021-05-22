package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import managementproject.classes.admint;


public class controller1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("t1");
		String password=request.getParameter("t2");
		logindao dao=new logindao();
		admint ad=dao.check(username,password);
		
		HttpSession session=request.getSession();
		session.setAttribute("admin", ad);
			
			RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
			rd.forward(request,response);
	
		
		
		
	
		}
		
	}


