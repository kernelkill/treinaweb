<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Verificador de Idade</title>
</head>
<body>
	<h1 align="center">Digite Seu nome e Idade</h1>
	<form action="SvtVerificaIdade">
		<table style="border:" align="center">
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Idade:</td>
				<td><input type="text" name="idade" /></td>
			</tr>
			<tr>
				<td colspan="2">
						<input type="submit" value="Enviar" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>