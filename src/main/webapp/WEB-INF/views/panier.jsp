<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include  page="/WEB-INF/views/header.jsp"></jsp:include>

<!DOCTYPE html>
<html>
	<body>
		<div class="row justify-content-center">
	<div class="col-12 col-md-8 col-lg-6 pb-5 text-center">
		<h1>Article dans le panier</h1>
	</div>
	</div>
    <div class="container">
    <div class="row justify-content-center">
		<ul class="list-group">
		<c:forEach var="produit" items="${ panier }" varStatus="produitStatus">
			<li class="list-group-item"> ${ produit.nom }</li>
		</c:forEach>
		</ul>
    	</div>
    </div>
	</body>
</html>