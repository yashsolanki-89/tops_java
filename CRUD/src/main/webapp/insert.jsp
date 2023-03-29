<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  name="insert" method="post" action="StudentController">
<table cellpadding="10px">
<tr>
 <td>First name</td>
 <td><input type="text" name="fname"></td>
</tr>
<tr>
 <td>last name</td>
 <td><input type="text" name="lname" ></td>
</tr>
<tr>
 <td>Email</td>
 <td><input type="text" name="email" ></td>
</tr>
<tr>
 <td>Moblie</td>
 <td><input type="text" name="moblie" ></td>
</tr>
<tr>
 <td>Address</td>
 <td><textarea rows="5" cols="18" name="address"></textarea></td>
</tr>
<tr>
 <td>Gender</td>
 <td>
 <input type="radio" name="gender" value="male">Male
 <input type="radio" name="gender" value="female">FeMale
 </td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="Insert">
</td>
</tr>
</table>
</form>
</body>
</html>