<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include  page="/WEB-INF/views/header.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<body>
	<div class="row justify-content-center">
	<div class="col-12 col-md-8 col-lg-6 pb-5 text-center">
		<h1>Liste des fournisseurs</h1>
	</div>
	</div>
    <div class="container">
    <div class="row justify-content-center">
		<ul class="list-group">
		<c:forEach var="fournisseur" items="${ fournisseurs }">
			<li class="list-group-item text-center">${fournisseur.nom}</li>
		</c:forEach>
		</ul>
    	</div>
    </div>
    <div class="row justify-content-center mt-3">
		<a href="fournisseur-ajouter" class="btn btn-success btn-sm active" role="button" title="ajout-fournisseur">Ajouter un fournissseur</a>
    </div>
  </body>
</html>