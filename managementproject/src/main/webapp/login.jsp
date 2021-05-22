<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="index.js"></script>
</head>
<style>
 .bg{
            background-color: initial;
            border:0.1px solid;
        }
        
    body{
      background-image: url("phot1.jpg");
          background-size: cover;
    
    
    }


 
     h1 {
            
            text-align: center;
            font-size:300%;
        }

        .class {
            text-align: center;
            border: 4px solid rgb(59, 59, 71);
            margin: 10% 30% 10% 30%;
            padding-bottom: 20px;
            outline: solid 1px black;
            color:rgb(19, 9, 20);
            
        }

        .a {
            padding-right: 25px;
            padding-top: 10px;
        }

        .b {
            padding-top: 4px;
        }

        .s {
            margin-top: 15px;
            border: 1px solid;
            border-radius: 8px;
            background-color: black;
            text-decoration: rgb(58, 57, 56);
            box-shadow: 0px 3px 6px rgba(0,0,0,0.1);
            color: white;
            font-size:20px;
           
        }
        .s:hover{
        background-color: orange;
        font-size:22px;
        }
        h2{
        font-size:200%;
        }
        
        
    </style>

<body>
<h1>Collage Management System</h1>

    <form class="class"  type="text" id="act">
        <h2>Login</h2>
        <div class="b"><b>Enter your Username :</b> <input type="text" name="t1" class="bg"><br></div>
        <div class="b"><b>Enter your Password &nbsp;:</b> <input type="text" name="t2" class="bg"><br></div>
        <div class="a"><b>Select your type :&nbsp;</b><select class="bg"name="faculty" id="faculty" onchange='return populate()'>
                <option value="">--select--</option>
                <option value="Administrator">Administrator</option>
                <option value="faculty">Faculty</option>
                <option value="Students">Student</option>
            </select>
        </div>
        <input type="submit" class="s">
    </form>
    
   
   

</body>
<!--  <script>
    function populate(faculty1){
var d=document.getElementById("faculty");
var dt=(d.options[d.selectedIndex].text);
var a=document.getElementById("act");
   ab= a.action=dt;
   console.log(document.getElementById("act"));
    }


</script>-->
</html>