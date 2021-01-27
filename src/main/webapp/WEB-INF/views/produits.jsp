<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include  page="/WEB-INF/views/header.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<body>
	<div class="row justify-content-center">
	<div class="col-12 col-md-8 col-lg-6 pb-5 text-center">
		<h1>Liste des produits</h1>
	</div>
	</div>
    <div class="container">
    <div class="row justify-content-center">
        <c:forEach var="produit" items="${ produits }" varStatus="produitStatus">
			<div class="card mt-3 ml-3 text-center" style="width: 18rem;">
				${ produitStatus.index } - ${ produit.nom }
				
				<a href="panier-ajout?id=${ produitStatus.index }" class="btn btn-primary btn-sm active" role="button" title="ajout-panier">Ajouter au panier</a>
				<a href="produit-supprimer?id=${ produitStatus.index}" class="btn btn-danger btn-sm active" role="button" title="ajout-panier">Supprimer le produit</a>
			</div>
		</c:forEach>
    	</div>
    </div>
  </body>
</html>