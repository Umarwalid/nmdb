<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INFORMATION</title>
</head>
<body>
<h1>PATIENT INFORMATION</h1>
${patient}

<h3> Add hospital record  </h3>
 <form action="addrec">
 <b>Enter medical number</b>
 <input type= "text" name="Medicalno"><br>
 <b>Enter Hospital name</b>
 <input type= "text" name="Hospital"><br>
  <b>Enter date</b>
 <input type= "text" name="Day"><br>
  <b>Enter purpose of visit</b>
 <input type= "text" name="Purpose"><br>
 <b>Enter symptoms</b>
 <input type= "text" name="Symptoms"><br>
 <b>Enter dignosis</b>
 <input type= "text" name="Dignosis"><br>
 <b>Enter treatmet given</b>
 <input type= "text" name="Treatment"><br>
 <b>Enter remark</b>
 <input type= "text" name="Remark"><br>
 <input type= "submit"><br>
 </form>
 <h3> Retrieve patient medical history </h3>
 <form action="getrec">
 <b>Enter medical number</b>
 <input type= "text" name="medicalno"><br>
 <input type= "submit"><br>
 </form>

</body>
</html>