package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import managementproject.classes.stmain;

public class stdcontroller extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("t1");
		String password=req.getParameter("t2");
		
		studentdao dao=new studentdao();
		stmain sm=dao.check(id,password);
		HttpSession session=req.getSession();
		session.setAttribute("sname",sm);
		
		
			
			RequestDispatcher rd=req.getRequestDispatcher("students.jsp");
			rd.forward(req, res);
		
	
		}
		
	}



