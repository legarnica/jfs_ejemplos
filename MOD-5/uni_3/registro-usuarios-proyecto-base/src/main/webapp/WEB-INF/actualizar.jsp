<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html dir="ltr">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href='../assets/images/favicon.png'>
    <title>Ejemplo - modelo</title>
    <!-- Custom CSS -->
    <link href='../dist/css/style.min.css' rel="stylesheet">

</head>

<body>
    <div class="main-wrapper">
        <!-- Preloader  -->
        <div class="preloader">
            <div class="lds-ripple">
                <div class="lds-pos"></div>
                <div class="lds-pos"></div>
            </div>
        </div>
        <!-- Preloader  -->

        <div class="auth-wrapper d-flex no-block justify-content-center align-items-center position-relative"
            style="background: url(../assets/images/big/auth-bg.jpg) no-repeat center center;">
            <div class="auth-box row text-center">
                <div class="col-lg-7 col-md-5 modal-bg-img" style="background-image: url(../assets/images/big/3.jpg);">
                </div>
                <div class="col-lg-5 col-md-7 bg-white">
					<div class="p-3">
						<img src="../assets/images/big/icon.png" alt="wrapkit">
						<h2 class="mt-3 text-center">Actualizar, también es gratis</h2>
                        <!-- mensaje -->
                        <div>
                            <div class="alert alert-warning alert-dismissible fade show" role="alert">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                <strong>¡título! - </strong> Mensaje de prueba
                            </div>
                        </div>
                        <!-- mensaje #-->
						<form class="mt-4" modelAttribute="usuario" action='#' method="post">

                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <input type="hidden" id="id" name="id" value="1" />
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <input class="form-control" type="text" id="nombre" name="nombre"
                                            placeholder="tu nombre" value="Luis Herrera">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <input class="form-control" type="email" id="correo" name="correo"
                                            placeholder="tu correo" value="lherrera@fake.dev">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <input class="form-control" type="password" id="contrasenia" name="contrasenia"
                                            placeholder="tu contraseña">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <input class="form-control" type="password" id="contrasenia_"
                                            name="contrasenia_" placeholder="tu contraseña otra vez 🤫">
                                    </div>
                                </div>
                                <div class="col-lg-12 text-center">
                                    <button type="submit" class="btn btn-block btn-dark">Actualizar</button>
                                </div>

                                <div class="col-lg-12 text-center mt-5">
                                    <!-- En caso que exista la sesión -->
                                    <!-- Si está registrado -->
                                    <a href="#" class="text-danger">Volver </a> |
                                    <!-- Si está registrado #-->
                                    <!-- En caso que exista la sesión #-->
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- ============================================================== -->
        <!-- Login box.scss -->
        <!-- ============================================================== -->
    </div>
    <!-- footer scripts -->
    <!-- All Required js -->
    <script src="/assets/libs/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap tether Core JavaScript -->
    <script src="/assets/libs/popper.js/dist/umd/popper.min.js"></script>
    <script src="/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- This page plugin js -->
    <script>
        $(".preloader ").fadeOut();
    </script>
    <!-- footer scripts -->
</body>

</html>