<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.test.Model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		Product pr = (Product)application.getAttribute("data");
	%>
	<h1>Edit Product</h1>
	<form action="EditProduct" method = "post">

	Name: <input type="text" name="name" value="${pr.getName() }"><br><br>
	Brand: <input type="text" name="brand" value="${pr.getBrand() }"><br><br>
	Price: <input type="text" name="price" value="${pr.getPrice() }"><br><br>
	
	<input type="submit" value="update">
	</form>
</body>
</html>