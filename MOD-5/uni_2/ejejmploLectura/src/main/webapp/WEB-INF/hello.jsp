<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Vista Hello</h1>


<c:if test="${saludo != null}">
	<h3>Un saludo</h3>
	<p><c:out value="${saludo}" /></p>
</c:if>

<c:if test="${despedida != null}">
	<h3>Una despedida</h3>
	<p><c:out value="${despedida}" /></p>
</c:if>

</body>
</html>