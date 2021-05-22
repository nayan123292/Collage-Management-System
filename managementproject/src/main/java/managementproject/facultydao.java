package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import managementproject.classes.facultynl;

public class facultydao {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "select * from faculty where id=? and f_password=?";
	public facultynl check(String id,String password) 
	{
		facultynl nl=new facultynl();
		try { 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username1,password1);
		PreparedStatement st= con.prepareStatement(sql);
		st.setString(1, id);
		st.setString(2, password);
	    ResultSet rs= st.executeQuery();
		if(rs.next()) 
		{
			nl.setFirstname(rs.getString("f_first_name"));
			nl.setLastname(rs.getString("f_lastname"));
			nl.setId(rs.getInt("f_id"));
			
			
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return nl;
		
		}
	}


