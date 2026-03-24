<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
</head>
<body>
<h1 align="center">Product Form &nbsp;&nbsp;<a href="listproducts.jsp">List Products</a></h1>
<form action ="CreateProduct" method="post">
Enter Product Name : <input type="text" name="name"><br><br>
Enter Product Brand : <input type="text" name="brand"><br><br>
Enter Product Price : <input type="text" name="price"><br><br>
<input type="submit" value="Add Products"> 

</form>
</body>
</html>