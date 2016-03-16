<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aqui Sem Titulo</title>
</head>
<body>
	<%! 
		public String getDataAtual(){
		return new Date().toString();
	}
	%>
	
	<h1>Bem-vindo ao curso de javaWeb da Treinaweb.</h1>
	
	<%
	String mensagem = " ";
	mensagem = "Estou Aprendendo Java";
	out.println(mensagem);
	%>
	<p>A data atual é <%=getDataAtual()  %></p>

</body>
</html>