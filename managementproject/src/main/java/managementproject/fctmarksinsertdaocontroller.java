package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class fctmarksinsertdaocontroller extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int rollno=Integer.parseInt(req.getParameter("caroll"));
		int ca1iot=Integer.parseInt(req.getParameter("ca1iot"));
		int ca1iac=Integer.parseInt(req.getParameter("ca1iac"));
		int ca2iot=Integer.parseInt(req.getParameter("ca2iot"));
		int ca2iac=Integer.parseInt(req.getParameter("ca2iac"));
		
		
		fctmsinsertdao fc=new fctmsinsertdao();
		
		fc.mregister(rollno,ca1iot,ca1iac,ca2iot,ca2iac);
		
		System.out.println("updated");
		
		RequestDispatcher rd=req.getRequestDispatcher("fismarks.jsp");
		rd.forward(req, res);
			}

	
	

}
