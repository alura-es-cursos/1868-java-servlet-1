<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/nuevaEmpresa" var="linkServletNuevaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="${ linkServletNuevaEmpresa}" method="post">
	
		Nombre empresa: <input type="text" name="nombre"/>
		Fecha Abertura: <input type="text" name="fecha"/>
		
		<input type="submit"/>
	
	</form>

</body>
</html>