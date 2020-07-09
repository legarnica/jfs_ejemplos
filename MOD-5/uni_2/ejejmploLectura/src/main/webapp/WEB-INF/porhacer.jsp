<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio envío</title>
</head>
<body>

	<form action='<c:url value = "/ejemplo/todo"/>' method="get"
		id="frmSend" modelAttribute="tarea">

		Dato a enviar: <br /> 
		<input type="text" id="texto" name="texto" placeholder="Ingrese un dato"> 
		<input type="text" id="nivel" name="nivel" placeholder="Ingrese un nivel">

		<button type="submit">Enviar</button>
	</form>

	<c:if test="${tareas != null}">
		<ul>
			<c:forEach var="tarea" items="${tareas}">
				<li><c:out value="${tarea}" /></li>
			</c:forEach>
		</ul>
	</c:if>

</body>
</html>