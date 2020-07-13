<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/style.css">
<meta charset="ISO-8859-1">
<title>Say Hi Form</title>
</head>
<body>

	Hi ${param.name}. Welcome to the Spring course.
	<p><br>
	<h2> Hola a todos </h2>
	
	<!-- 29 -->
	${msg}
	</p>
	
	<!-- 30 -->
	<img alt="pic" src="${pageContext.request.contextPath}/res/Morgana.png">

</body>
</html>