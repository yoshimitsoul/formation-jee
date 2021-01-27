<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include  page="/WEB-INF/views/header.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<head>
		<title>Ajouter un produit</title>
	</head>
	
	<body>
		<form method="POST">
			<div>
				<label>Nom du produit</label>
				<input type="text" name="nom" />
			</div>
			
			<input type="submit" value="Ajouter" />
		</form>
	</body>
</html>