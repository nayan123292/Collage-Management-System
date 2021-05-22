package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class studentdao2 {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "select * from students where id=? and password=?";
	
public boolean check(String id,String password) 
{
	try { 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username1,password1);
	PreparedStatement st= con.prepareStatement(sql);
	st.setString(1, id);
	st.setString(2, password);
    ResultSet rs= st.executeQuery();
	if(rs.next()) 
	{
		return true;
	}
	
	}catch (Exception e) {
		e.printStackTrace();
	}
	return false;
	}
}
