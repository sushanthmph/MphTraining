<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.test.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>data</title>
</head>
<body>
<h1>Employee</h1>
<% 
Employee emp =(Employee)session.getAttribute("emp");
out.println(emp.getName());
Employee obj =(Employee)application.getAttribute("info");
out.println("<br>"+obj.getId()+" "+obj.getName()+" "+obj.getCmp()+" "+obj.getCity());
%>
</body>
</html>