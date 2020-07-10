<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>envío de correos</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

</head>

<body>

	<div class="container">
		<div class="row">
			<div class="col-12">
				<h3>Administrador de mensajes</h3>
				<hr />
				<form action='<c:url value="/mensaje/" />' modelAttribute="mensaje"
					method="post">
					<div class="form-group">
						<label for="remitente">Remitente: </label> <input type="text"
							class="form-control" id="remitente" name="remitente"
							placeholder="ingrese su nombre..." aria-describedby="emailHelp">
					</div>
					<div class="form-group">
						<label for="mensaje">Mensaje</label>
						<textarea placeholder="Ingrese su mensaje..." class="form-control"
							id="mensaje" rows="3" name="mensaje"></textarea>
					</div>
					<button type="submit" class="btn btn-secondary">Agregar</button>
				</form>
			</div>
		</div>



		<c:forEach var="mensaje" items='${mensajes}'>

			<div class="row my-5">
				<div class="col-12">

					<div class="card">
						<div class="card-body">
							<h5 class="card-title">
								<c:out value="${mensaje.getRemitente()}" />
							</h5>
							<p class="card-text">
								<c:out value="${mensaje.getMensaje()}" />
							</p>
						</div>
						<a href='<c:out value="/mensaje/eliminar?id=${mensaje.getId()}"></c:out>' class="btn btn-warning active" role="button"
							aria-pressed="true">Eliminar</a>
					</div>


				</div>
			</div>

		</c:forEach>



	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
</body>

</html>