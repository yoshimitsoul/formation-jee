<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="fr">
<head>
<link title="style" href="./css/style.css" type="text/css" rel="stylesheet"/>
<meta charset="UTF-8">
<title>formation jee</title>
</head>
<body>
	<p>Bonjour ${utilisateur}</p>
	<form method ="post">
		<input type = "text" name ="prenom"></input>
		<input type = "submit" value ="OK"></input>
	</form>
</body>
</html>