package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrationstudentatadmincontroller extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int rollno=Integer.parseInt(req.getParameter("roll"));
		String first_name=req.getParameter("first");
		String middle_name=req.getParameter("middle");
		String last_name=req.getParameter("last");
		int age=Integer.parseInt(req.getParameter("age"));
		String gender=req.getParameter("gender");
		String class1=req.getParameter("class");
		String branch=req.getParameter("branch");
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		String mobile_no=req.getParameter("mobile");
		String address=req.getParameter("address");
		String attendance=req.getParameter("attendance");
		
		adminstdregdao ad= new adminstdregdao();
		
		ad.register(rollno,first_name,middle_name,last_name,age,gender,class1,branch,id,password,mobile_no,address,attendance);
		
				System.out.println("updated");
				
				RequestDispatcher rd=req.getRequestDispatcher("studentregister.jsp");
				rd.forward(req, res);
				
				
		

}
}
	
