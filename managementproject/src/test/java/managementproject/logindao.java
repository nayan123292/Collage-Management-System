package managementproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import managementproject.classes.admint;

public class logindao {
	
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "select * from admin where username=? and password=?";
	
	public admint check(String username,String password) 
	{
		admint ad=new admint();
		try { 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username1,password1);
		PreparedStatement st= con.prepareStatement(sql);
		st.setString(1, username);
		st.setString(2, password);
        ResultSet rs= st.executeQuery();
		if(rs.next()) 
		{
			ad.setName(rs.getString("name"));
			ad.setSurname(rs.getString("surname"));
			
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		

		}
		return ad;
	}
}

