package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class studentattendacedao {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "update students set attendance_in_percentage=? where roll_no=?";
	public boolean att(int rollno,String attendance) {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username1,password1);
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1,attendance);
			st.setInt(2,rollno);
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
