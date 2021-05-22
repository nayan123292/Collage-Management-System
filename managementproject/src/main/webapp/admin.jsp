<%@page import="managementproject.classes.admint"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head><script type="text/javascript" src="admin.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    
         body{
              background-image: url("phot1.jpg");
              background-size: cover;

         }   
        
        header{
            background-color: #fff;
            box-shadow: 0px 3px 6px rgba(0,0,0,0.1);
        }
        header nav{
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding-right: 142px;
            padding-left: 142px;

        }
        header nav h1{
            font-size: 28px;
            font-weight: 600;
        }
        header nav .tabs .tab{
            display: block;
        }
        header nav .tabs{
            list-style-type: none;
            display: flex;
            justify-content: flex-end;
            
        }
        header nav .tabs .tab a[data-switcher]{
            display: block;
            padding: 15px 30px;
            text-decoration: none;
            color: #fff;
            background-color: royalblue;
            cursor: pointer;
        }
        header nav .tabs .tab.is-active a[data-switcher]{
            background-color: #f7a800;
            font-weight: 700;
        }
        header nav .tabs .tab:hover a[data-switcher]{
            background-color: #f7a800;
        }
        main{
            padding-left: 142px;
            padding-right: 142px;
        }
        .pages{
            margin: 100px;
            box-shadow: 0px 3px 6px rgba(0,0,0,0.1);
            background-color: white;
        }
        .pages .page{
            display: none;
        }
        .pages .page.is-active{
            display: block;
        }
        #student{
            text-align: center;
            border: 2px solid wheat;
            outline: 1px black;
            padding-top:1%;

            
        }
        .h{
            border: 2px solid;
            border-radius: 4px;
            background-color: rgb(240, 235, 228);
            text-decoration: rgb(58, 57, 56);
            box-shadow: 0px 3px 6px rgba(0,0,0,0.1);
        }

        .h:hover{
            
            background-color: #555451;
        }
            
        #faculty{
            text-align: center;
            border: 2px solid wheat;
            outline: 1px black;
            padding-top:1%;
        
        }
        #admin{
            text-align: center;
            border: 2px solid wheat;
            outline: 1px black;
            padding-top:1%;
        
        }
    
    
    </style>
</head>
<body>
<%
 admint ad=(admint)session.getAttribute("admin");
String a=ad.getName();
String b=ad.getSurname();
	 
	if(a==null){
		response.sendRedirect("login.jsp");
	}

%>


<header>
        <nav>
            <h1><%out.print(a); %>&nbsp; <%out.print(b); %></h1>
            <ul class="tabs">
                <li class="tab is-active">
                    <a data-switcher data-tab="1">home</a>
                </li>
                <li class="tab">
                    <a data-switcher data-tab="2">Students</a>
                </li>
                <li class="tab">
                    <a data-switcher data-tab="3">Faculty</a>
                </li>
               
            </ul>
            
        </nav>
    </header>
    <main>
        <section class="pages">
            <div class="page is-active" id="admin" data-page="1">
                <h1>Welcome <%out.print(a); %></h1>
            </div>
            <div class="page" id="student" data-page="2">
                
                <h1>Students</h1>
                
               <h3> Register a new student &nbsp;:&nbsp;&nbsp;<form action="stdreg"><input class="h" type="submit" value="Register"></h3></form><br>
               <h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; View students data &nbsp;:&nbsp;&nbsp;<form action="stdview"><input class="h" type="submit" value="Viewdata"></h3></form><br>
               
            
            </div>
            <div class="page" id="faculty" data-page="3">
                <h1>Faculty</h1>
                <h3> &nbsp;Register a new faculty &nbsp;:&nbsp;&nbsp;<form action="fctreg"><input class="h" type="submit"  value="Register"></h3></form><br>
                <h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View faculty data &nbsp;:<br>&nbsp;&nbsp;<form action="fctview"><input class="h" type="submit" value="Viewdata"></h3></form><br>
                <h3>insert faculty attendance:<br>&nbsp;&nbsp;<form action="fctattend"><input class="h" type="submit" value="insert"></h3></form><br>
            </div>
            
        </section>
    </main>
</body>

       
            
</html>