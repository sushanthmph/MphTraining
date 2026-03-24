<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.fmt"  prefix="fmt" %>
    <%@ page import="java.util.*" %>
    <%@ taglib uri="jakarta.tags.core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Format Tags</title>
</head>
<body>
<c:set var="today" value="<%= new Date() %>"></c:set>
<p> Time <strong><fmt:formatDate type="time" value="${today }"/></strong></p><br><br>
<p> Date <strong><fmt:formatDate type="date" value="${today }"/></strong></p><br><br>
<p> Date &amp; Time : <strong><fmt:formatDate  type="both" value="${today }"/></strong></p>

<p> Date &amp; Time : <strong><fmt:formatDate  type="both" dateStyle="short" timeStyle="short" value="${today }"/></strong></p>
<p> Date &amp; Time : <strong><fmt:formatDate  type="both" dateStyle="medium" timeStyle="medium" value="${today }"/></strong></p>
<p> Date &amp; Time : <strong><fmt:formatDate  type="both" dateStyle="long" timeStyle="long" value="${today }"/></strong></p>
<p> Date Pattern : <strong> <fmt:formatDate value="${today }" pattern="yyyy-MM-dd"/> </strong></p>
</body>
</html>