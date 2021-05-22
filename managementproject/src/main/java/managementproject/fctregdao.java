package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class fctregdao {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "insert into faculty(f_id,f_first_name,f_middlename,f_lastname,f_age,f_gender,f_branch,id,f_password,attendance_in_percentage,f_mobile_no)values(?,?,?,?,?,?,?,?,?,?,?)";
	public boolean register1(int f_id,String f_first_name,String f_middlename,String f_lastname,int f_age,String f_gender,String f_branch,String id,String f_password,String attendance_in_percentage,String f_mobile_no) {
		
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username1,password1);
			PreparedStatement st= con.prepareStatement(sql);
			st.setInt(1, f_id);
			st.setString(2,f_first_name);
			st.setString(3,f_middlename);
			st.setString(4, f_lastname);
			st.setInt(5, f_age);
			st.setString(6, f_gender);
			st.setString(7, f_branch);
			st.setString(8, id);
			st.setString(9, f_password);
			st.setString(10, attendance_in_percentage);
			st.setString(11, f_mobile_no);
			
	        int count= st.executeUpdate();
			
			if(count==1) {
				
			
				return true;
			}
			
				
		
			
			}catch (Exception e) {
				e.printStackTrace();
			
				}
		return false;
			

			}
	
	}


