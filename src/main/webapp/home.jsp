<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> HOME PAGE  </title>
</head>
<body>
<h1> UNIVERSAL MEDICAL DATABASE</h1>

<h3> HOSPITAL LOGIN</h3>
  
 <form action="loghp">
 <b>Enter hospital name</b>
 <input type= "text" ><br>
 <b>Enter password</b>
 <input type= "text" name="password"><br>
 <input type= "submit"><br>
 </form>
 
 <h3> Register hospital </h3>
<form action="reghp">
<input type= "submit" ><br>
 </form>
 
<h3> Register Patient </h3>
<form action="go">
<input type= "submit"><br>
 </form>
 
 <h3> Retrive Patient Medical Records</h3>
  
 <form action="showpt">
 <b>Enter Name</b>
 <input type= "text" ><br>
 <b>Enter Medical number</b>
 <input type= "text" name="medicalno"><br>
 <input type= "submit"><br>
 </form>
 
 
</body>
</html>