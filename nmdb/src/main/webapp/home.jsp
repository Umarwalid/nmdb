<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> nmdb  </title>
</head>
<body>
<h3> register patient </h3>
 <form action="addpatient">
 <b>enter first name</b>
 <input type= "text" name="Firstname"><br>
 <b>enter Last name</b>
 <input type= "text" name="Lastname"><br>
 <b>enter Other name</b>
 <input type= "text" name="Othername"><br>
 <b>enter Gender</b>
 <input type= "text" name="Gender"><br>
 <b>enter date of birth</b>
 <b> format "1stjune2000"</b>
 <input type= "text" name="DOB"><br>
 <b>enter Nationality</b>
 <input type= "text" name="Nationality"><br>
 <input type= "submit"><br>
 </form>
 
 <h3> retrieve patient</h3>
  
 <form action="getpatient">
 <b>enter medical number</b>
 <input type= "text" name="medicalno"><br>
 <input type= "submit"><br>
 </form>
 
</body>
</html>