<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="index.js"></script>
<style>
body {
             background-image: url("phot1.jpg");
             background-size: cover;
             background-attachment:fixed;
        }

        .pages {
            margin: 100px;
            box-shadow: 0px 3px 6px rgba(0, 0, 0, 0.1);
            background-color: white;
        }

        #student {
            text-align: center;
            border: 2px solid wheat;
            outline: 1px black;
            padding-top: 2%;
            text-align: left;
        }
        #head{
            text-align: center;
            font-size: 30px;
        }
        #reg{
            text-align: center;
        }
        .h{
        font-size: 25px;
        border-radius: 3px;
        background-color: rgb(204, 192, 157); 
        
        }
        .h:hover{
            font-size: 30px;
            background:black;
            color: white;
        }
        #hd{
            text-align: center;
            font-size: 50px;
            
            
        }
        </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 id="hd">Administration</h1>
    <main>
        <section class="pages">
            <form action="attendf"><div class="page is-active" id="student" data-page="1">
                
                <h1 id="head">faculty attendance</h1><br>
                <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter faculty id.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="attid"></h2><br><br>
                <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter faculty attendance.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="att"></h2><br><br>
                <h2 id="reg"><input class="h"  type="submit" onclick="test()" value="register"></h2>
                </div>
                </form>
                </section>
                </main>
                
</body>
</html>