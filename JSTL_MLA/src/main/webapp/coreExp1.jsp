<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL-core</title>
</head>
<body>
<h1>JSTL Core Tags</h1>
<c:forEach var="a" begin="1" end="10">
<c:out value="${a}"></c:out>
</c:forEach>
<br>
<br>
<%
List<String> listNames =Arrays.asList("Rohit","Virat","SKY","Dhone","Axar");
application.setAttribute("names",listNames);
%>
<br>
<br>
<c:forEach items="${names}" var="data">
<c:out value="${data}"></c:out>
<br>
</c:forEach>
<c:set var="age" value="${19}"></c:set>
<c:out value="${age}"></c:out>
<%-- <c:remove var="age"/> --%>
<c:choose>
<c:when test="${age ==18 }">
<c:out value="Just Eligible"></c:out>
</c:when>
<c:when test="${age >18 }">
<c:out value="most Eligible"></c:out>
</c:when>
<c:otherwise>
<c:out value="not Eligible for voting"></c:out>
</c:otherwise>
</c:choose>
<br>
<c:forTokens items="Rohit,Virat,Kohli,SKY,Axar. All are Players" delims=",.-" var="names">
<c:out value="${names}"></c:out><br>
</c:forTokens>
</body>
</html>