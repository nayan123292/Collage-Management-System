<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 body{
              background-image: url("phot1.jpg");
             background-size: cover;
             background-attachment:fixed;

         }
 .page{
            margin: 200px;
            box-shadow: 0px 3px 6px rgba(0,0,0,0.1);
            background-color: white;
            width: fit-content;
            border: 2px solid wheat;
            
            }
            h2{
            text-align:center;
            }
            #faculty{
            align:left;
            }
            
            #h1{
            
            text-align:center;
            
            }
</style>
</head>
<body>
<%
String url = "jdbc:mysql://localhost:3306/test";
String uname = "root";
String pass ="";
String query = "select * from faculty";


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,uname,pass);
Statement st= con.createStatement();
ResultSet rs= st.executeQuery(query);%>
  <h1 id="h1">Administration</h1>
  <div class="page" id="faculty" data-page="3">
  <h2 id="h2">Faculty data</h2>
<table align="center" border="1">
<tr>
<th>f_id</th>
<th>f_first_name</th>
<th>f_middlename</th>
<th>f_lastname</th>
<th>f_age</th>
<th>f_gender</th>
<th>f_branch</th>
<th>f_id</th>
<th>f_password</th>
<th>attendance_in_percentage</th>
<th>f_mobile_no</th>
</tr>

<%while(rs.next()){%>
	
	<tr>
<td><%=rs.getInt("f_id") %></td>
<td><%=rs.getString("f_first_name") %></td>
<td><%=rs.getString("f_middlename") %></td>
<td><%=rs.getString("f_lastname") %></td>
<td><%=rs.getInt("f_age") %></td>
<td><%=rs.getString("f_gender") %></td>
<td><%=rs.getString("f_branch") %></td>
<td><%=rs.getString("id") %></td>
<td><%=rs.getString("f_password") %></td>
<td><%=rs.getString("attendance_in_percentage") %></td>
<td><%=rs.getString("f_mobile_no") %></td>
</tr>

	
<%}%>
</table>
</div>

</body>
</html>