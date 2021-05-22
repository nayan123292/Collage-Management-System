package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fctattenddao {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "update faculty set attendance_in_percentage=? where f_id=?";
	
	public boolean update(int f_id,String attendance) {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username1,password1);
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1,attendance);
			st.setInt(2,f_id);
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
