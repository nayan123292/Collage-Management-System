package managementproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class fctattenddaocontroller extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		fctattenddao fc=new fctattenddao();
		int id=Integer.parseInt(req.getParameter("attid"));
		String attendance=req.getParameter("att");
		fc.update(id,attendance);
		System.out.println("updated");
		
		RequestDispatcher rd=req.getRequestDispatcher("fctattendance.jsp");
		rd.forward(req, res);
	}

}
