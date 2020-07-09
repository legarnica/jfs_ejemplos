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

	<form action='<c:url value="/ejemplo/addData" />' method="get">

		Nueva tarea: <input type="text" id="txtTarea" name="txtTarea">
		
		<button type="submit">Agregar Tarea</button>

	</form>

<ul>
	<c:forEach var="tarea" items="${tareas}">
		<li> <c:out value="${tarea}" /> </li>	
	</c:forEach>
</ul>



</body>
</html>