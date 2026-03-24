<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Functions</title>
</head>
<body>
<h1>Functions Tags</h1>
<c:set value="Spring Framework is frameworks of framwork and supports AI" var="data"></c:set>
<c:out value="${data }"></c:out>
<c:if test="${fn:contains(data,'supports')}">
<p> In data variable contains supports keyword </p>
</c:if>
<c:if test="${fn:containsIgnoreCase(data,'spring')}">
<p> In data variable contains supports keyword </p>
</c:if>
<c:if test="${fn:contains(data,'framework')}">
<p> In data variable contains supports keyword </p>
</c:if>
<c:out value="${fn:toUpperCase(data)}"></c:out>
</body>
</html>