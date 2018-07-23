<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Esempio1</title>
</head>
<body>
<center>
<h1>Testo</h1>
<br>
<h2><% System.out.println(request.getParameter("nome")); %></h2>
</center>
</body>
</html>