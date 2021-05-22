package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class fctregdaocontroller extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
	
		int f_id=Integer.parseInt(req.getParameter("fno"));
		String f_first_name=req.getParameter("ffirst");
		String f_middlename=req.getParameter("fmiddle");
		String f_lastname=req.getParameter("flast");
		int f_age=Integer.parseInt(req.getParameter("fage"));
		String f_gender=req.getParameter("fgender");
		String f_branch=req.getParameter("fbranch");
		String id=req.getParameter("fid");
		String f_password=req.getParameter("fpassword");
		String attendance_in_percentage=req.getParameter("fattendance");
		String f_mobile_no=req.getParameter("fmobile");
	
	
	   fctregdao fc=new fctregdao();
	
	fc.register1(f_id,f_first_name,f_middlename,f_lastname,f_age,f_gender,f_branch,id,f_password,attendance_in_percentage,f_mobile_no);
	System.out.println("updated");
	RequestDispatcher rd=req.getRequestDispatcher("registernewfaculty.jsp");
	rd.forward(req, res);
	}
}
