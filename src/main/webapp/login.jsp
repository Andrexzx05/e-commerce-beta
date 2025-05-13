<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header>Code & Cake</header>
	<nav>
		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li><a href="consulta.jsp">Ver Productos</a></li>
			<li><a href="categoria.jsp">Buscar Categoria</a></li>
			<li><a href="Registro.jsp">Registrarse</a></li>
		</ul>
	</nav>
	<div id="content">
		<section>
			<article>
				<h3>Iniciar Sesion</h3>
				<form action="validarLogin.jsp" method="post" class="card">
					<table border="0" cellpadding="5" cellspacing="5">
						<!-- input correo -->
						<tr>
							<td><label for="correo">Correo:</label></td>
							<td><input type="email" id="correo" name="correo" required></td>
						</tr>
						<!-- input contraseña -->
						<tr>
							<td><label for="contraseña">Contraseña:</label></td>
							<td><input type="password" id="contrasena" name="contrasena"
								required></td>
						</tr>
						<!-- input submit -->
						<tr>
							<td><label for="error"></label></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Iniciar Sesion"></td>
						</tr>
					</table>
				</form>
			</article>
		</section>
	</div>

</body>
</html>