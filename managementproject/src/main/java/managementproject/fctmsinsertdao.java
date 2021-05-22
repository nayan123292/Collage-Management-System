package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class fctmsinsertdao {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "update students set CA1_marks_iot=?,CA1_marks_iac=?,CA2_marks_iot=?,CA2_marks_iac=? where roll_no=?";
	
	
	
public boolean mregister(int rollno,int ca1iot,int ca1iac,int ca2iot,int ca2iac) {
	try { 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username1,password1);
		PreparedStatement st= con.prepareStatement(sql);
		st.setInt(1,ca1iot);
		st.setInt(2,ca1iac);
		st.setInt(3,ca2iot);
		st.setInt(4,ca2iac);
		st.setInt(5,rollno);
	    int count= st.executeUpdate();
		if(count==1) 
		{
			return true;
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	
	
}

}
