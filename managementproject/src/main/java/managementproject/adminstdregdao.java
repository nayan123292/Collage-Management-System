package managementproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminstdregdao {
	String url = "jdbc:mysql://localhost:3306/test";
	String username1 = "root";
	String password1 ="";
	String sql = "insert into students(roll_no,first_name,middle_name,last_name,age,gender,class,branch,id,password,mobile_no,address,attendance_in_percentage)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public boolean register(int rollno,String first_name,String middle_name,String last_name,int age,String gender,String class1,String branch,String id,String password,String mobile_no,String address,String attendance) {
		
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username1,password1);
			PreparedStatement st= con.prepareStatement(sql);
			st.setInt(1, rollno);
			st.setString(2,first_name);
			st.setString(3,middle_name);
			st.setString(4, last_name);
			st.setInt(5, age);
			st.setString(6, gender);
			st.setString(7, class1);
			st.setString(8, branch);
			st.setString(9, id);
			st.setString(10, password);
			st.setString(11, mobile_no);
			st.setString(12, address);
			st.setString(13, attendance);
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


			
		
	


	


