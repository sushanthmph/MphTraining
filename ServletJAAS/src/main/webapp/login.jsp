<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
<h1 align="center">Login Page</h1>
<center>
<form action ="LoginServlet" method="post">
Enter UserName : <input type="text" name ="username"><br><br>
Enter Password : <input type="password" name="password"><br><br>
<input type="submit" value="sign in">
</center>

</form>
</body>
</html>