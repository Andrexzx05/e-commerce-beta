<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/estilote.css">
</head>
<body>
<h3>Registro nuevo Cliente</h3>
<form action ="Respuesta.jsp" method= "post">
	<table border = "1" cellpadding= "5" cellspacing="5">
	<tr> <td>Nombre</td><td> <input type="text"name="textNombre"> </td> </tr>
	<tr> <td>Cedula</td><td> <input type="number"name="textCedula" maxlenght ="10"/> </td> </tr>
<tr> 
<td><input type="submit" name= "btn_enviar" id="btn_enviar" value="EnviarRegistro"/> </td>
 
	<td><input type="reset"/> </td> 
</tr>
	<input type="radio"name="rdResidencia" value = "Sur"/>Sur
	<input type="radio"name="rdResidencia" value = "Norte"/>Norte
	<input type="radio"name="rdResidencia" value = "Centro"/>Centro
</table>
</form>

</body>
</html>