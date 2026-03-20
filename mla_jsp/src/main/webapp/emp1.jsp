<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int x=11;
int y=22;
public int add()
{
	return x+y;
}


%>
<%= add() %>
<br>
<%= new Date() %>

<% out.println("Scriplet tag".toUpperCase()); %>
</body>
</html>