<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Se connecter</title>
	</head>
	
	<body>
		<c:if test="${ messageErreur != null }">
			<div>CA SAFFICHE SI CEST VRAI</div>
		</c:if>
		
		${ param.error }
		
		<%-- <c:forEach var="a" items="${ list }">
			CA SE REPETE
		</c:forEach> --%>
		
		<c:forEach var="i" begin="0" end="7" step="1">
			CA SE REPETE ${ i }
		</c:forEach>
		
		<h2>${ messageErreur }</h2>
		
		<form method="POST">
			<div>
				<label>Nom d'utilisateur</label>
				<input type="text" name="username" />
			</div>
			
			<div>
				<label>Mot de passe</label>
				<input type="password" name="password" />
			</div>
			
			<input type="submit" value="Se connecter" />
		</form>
	</body>
</html>