package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import managementproject.classes.stmain;

public class studentdao {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "select * from students where id=? and password=?";
	
public stmain check(String id,String password) 
{
	stmain sm=new stmain();
	
	try { 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username1,password1);
	PreparedStatement st= con.prepareStatement(sql);
	st.setString(1, id);
	st.setString(2, password);
    ResultSet rs= st.executeQuery();
	if(rs.next()) 
	{
		
		sm.setFirstname(rs.getString("first_name"));
		sm.setLastname(rs.getString("last_name"));
		sm.setRollno(rs.getInt("roll_no"));
	
	}
	
	}catch (Exception e) {
		e.printStackTrace();
	}
	return sm;
	}
}
