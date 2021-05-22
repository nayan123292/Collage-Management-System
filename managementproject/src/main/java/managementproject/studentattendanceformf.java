package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class studentattendanceformf extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int rollno= Integer.parseInt(req.getParameter("sattid"));
		String attendance=req.getParameter("satt");
		
		studentattendacedao st=new studentattendacedao();
		st.att(rollno,attendance);
		
		RequestDispatcher rd= req.getRequestDispatcher("studentattendace.jsp");
		rd.forward(req, res);
	}

}
