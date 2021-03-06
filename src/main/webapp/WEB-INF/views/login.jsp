<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include  page="/WEB-INF/views/header.jsp"></jsp:include>

<!DOCTYPE html>
<html>
  <body>
  <div class="row justify-content-center">
		<c:if test="${ messageErreur != null }">
			<div>CA SAFFICHE SI CEST VRAI</div>
		</c:if>
		
		${ param.error }
		
		<%-- <c:forEach var="a" items="${ list }">
			CA SE REPETE
		</c:forEach> --%>
		
		<c:forEach var="i" begin="0" end="4" step="1">
			Connectez-vous ! ${ i }
		</c:forEach>
		
		<h2>${ messageErreur }</h2>
	</div>
    <div class="container">
    <div class="row justify-content-center">
		<div class="col-12 col-md-8 col-lg-6 pb-5">
        <form class = "form-group" method="POST">
			<div>
				<input type="text" name="username"class="form-control mt-2" placeholder="Nom d'utilisateur"/>
			</div>
			<div>
				<input type="password" name="password" class="form-control mt-2" placeholder="Mot de passe"/>
			</div>
			<input class="btn btn-lg btn-dark btn-block mt-5" type="submit" value="Se connecter" />
		</form>
    	</div>
    </div>
    </div>
  </body>
 </html>