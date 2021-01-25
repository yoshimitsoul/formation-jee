<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Liste des produits</title>
	</head>
	
	<body>
		<c:forEach var="produit" items="${ produits }">
			<!--<p>${ produit.getNom() }</p> -->
			<p>${ produit.nom }</p>
		</c:forEach>
	</body>
</html>