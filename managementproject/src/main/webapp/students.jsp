<%@page import="managementproject.classes.stmain"%>
<%@page import="managementproject.classes.facultynl"%>
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
stmain ss=(stmain)session.getAttribute("sname");
int id=ss.getRollno();
String name=ss.getFirstname();
String last=ss.getLastname();
String url = "jdbc:mysql://localhost:3306/test";
String uname = "root";
String pass ="";
String query = "select * from students where roll_no="+id+"";


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,uname,pass);
Statement st= con.createStatement();
ResultSet rs= st.executeQuery(query);%>
  <h1 id="h1">Student</h1>
  <div class="page" id="faculty" data-page="3">
  <h2 id="h2"><%out.print(name);%> &nbsp; <%out.print(last); %></h2>
<table align="center" border="1">
<tr>
<th>roll_no</th>
<th>first_name</th>
<th>middle_name</th>
<th>last_name</th>
<th>age</th>
<th>gender</th>
<th>class</th>
<th>branch</th>
<th>id</th>
<th>password</th>
<th>mobile_no</th>
<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>attendance_in_percentage</th>
<th>ca1_marks_iot</th>
<th>ca1_marks_iac</th>
<th>ca2_marks_iot</th>
<th>ca2_marks_iac</th>
</tr>

<%while(rs.next()){%>
 <tr>
<td><%=rs.getInt("roll_no") %></td>
<td><%=rs.getString("first_name") %></td>
<td><%=rs.getString("middle_name") %></td>
<td><%=rs.getString("last_name") %></td>
<td><%=rs.getInt("age") %></td>
<td><%=rs.getString("gender") %></td>
<td><%=rs.getString("class") %></td>
<td><%=rs.getString("branch") %></td>
<td><%=rs.getString("id") %></td>
<td><%=rs.getString("password") %></td>
<td><%=rs.getString("mobile_no") %></td>
<td><%=rs.getString("address") %></td>
<td><%=rs.getString("attendance_in_percentage") %></td>
<td><%=rs.getString("ca1_marks_iot") %></td>
<td><%=rs.getString("ca1_marks_iac") %></td>
<td><%=rs.getString("ca2_marks_iot") %></td>
<td><%=rs.getString("ca2_marks_iac") %></td>
</tr>

	
<%} %>
</table>
</div>

</body>
</html>