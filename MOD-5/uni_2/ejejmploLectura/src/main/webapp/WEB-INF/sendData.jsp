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

	<form action='<c:url value = "/ejemplo/enviarDatos"/>' method="post"
		id="frmSend">

		Dato a enviar: <input type="text" id="dato" name="dato"
			placeholder="Ingrese un dato">

		<button type="submit">Enviar</button>
	</form>

	<c:if test="${mensaje != null}">
		<h2>
			Dato recibido:
			<c:out value="${mensaje}"></c:out>
		</h2>
	</c:if>

</body>
</html>