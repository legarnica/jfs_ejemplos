<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mensajes.jsp</title>
</head>
<body>

	<form:form id="frmMensajes" action="/mensaje/saveMessage"
		modelAttribute="mensaje"> 
		Remitente: <input type="text" id="txtRemitente" name="remitente" />
		<br /> Mensaje: <input type="text" id="txtMensaje" name="mensaje" />
		<br />
		<input type="submit" id="btnEnviar" value="Enviar" />
	</form:form>

	<c:forEach items="${dataMessageList}" var="mensaje">
		<c:out
			value="${mensaje.getRemitente()} dice que ${mensaje.getMensaje()}" />
		<br />
	</c:forEach>
</body>
</html>