<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="alumno">
	Nombre: <form:input path="nombre" />
		<!-- 39 Errores -->
		<form:errors path="nombre"  style="color:red"/>
		<br>
		<br>
		<br>
	Apellido: <form:input path="apellido" />
		<br>
		<br>
		<br>
		<!-- 36 -->
		Asignaturas optativas: <br>
		<form:select path="optativa" multiple="true">
			<form:option value="Diseño" label="Diseño" />
			<form:option value="Karate" label="Karate" />
			<form:option value="Comercio" label="Comercio" />
		</form:select>
		<br>
		<br>
		<br>
		<!-- 37 -->
		Barcelona<form:radiobutton path="ciudad" value="Barcelona" />
				Madrid<form:radiobutton path="ciudad" value="Madrid" />
						Valencia<form:radiobutton path="ciudad" value="Valencia" />
								Bilbao<form:radiobutton path="ciudad" value="Bilbao" />

		<br>
		<br>
		<br>
		<p>Idiomas</p>
		Inglés<form:checkbox path="idioma" value="ingles" />
		Francés<form:checkbox path="idioma" value="frances" />
		<!-- 40 -->
		<br>
		<br>
			Edad: <form:input path="edad" />
			<form:errors path="edad"  style="color:red"/>
		<br>
		<br>
			Email: <form:input path="email" />
			<form:errors path="email"  style="color:red"/>
			
		<br>
		<br>
			Código Postal: <form:input path="codigoPostal" />
			<form:errors path="codigoPostal"  style="color:red"/>
			
		<br>
		<br>
			Código Postal Madrid: <form:input path="codigoPostalMadrid" />
			<form:errors path="codigoPostalMadrid"  style="color:red"/>
		<br>
		<br>
		<br>
		<input type="submit" value="Enviar" />
	</form:form>

</body>
</html>