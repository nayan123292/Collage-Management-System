package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class viewfacultycontroller extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd=req.getRequestDispatcher("viewfaculty.jsp");
		rd.forward(req, res);
	}

}
