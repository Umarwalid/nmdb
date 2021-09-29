<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h1>WELCOME</h1>
 ${hospital}
 
 <h3> search for patient info </h3>
 <form action="showpt">
 <b>Enter Medical number</b>
 <input type= "text" name="medicalno"><br>
 <input type= "submit"><br>
 </form>
  
 <h3> Check patient medical record </h3>
 <form action="getrec">
 <b>Enter medical number</b>
 <input type= "text" name="medicalno"><br>
 <input type= "submit"><br>
 </form>
  
 <h3>Add patient medical record</h3>
<form action="ptinfo">
 <b>Please enter the patient medical number</b>
 <input type= "text" name="medicalno"><br>
<input type= "submit" ><br>
 </form>
 
</body>
</html>