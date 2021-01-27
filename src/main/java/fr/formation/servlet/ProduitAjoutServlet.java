package fr.formation.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.model.Produit;

//MAPPING (URL D'ACCES) !!!!
@WebServlet("/produit-ajout")
public class ProduitAjoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// On délègue directement vers la vue
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/produit-ajout.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Récuparation du nom du produit (via le formulaire)
		String nomProduit = req.getParameter("nom");

		// Création du produit avec le nom du produit
		Produit monProduit = new Produit(nomProduit);

		// Récupération de la liste de produits qui se trouve dans le scope Application
		List<Produit> mesProduits = (List<Produit>) this.getServletContext().getAttribute("produits");

		// Ajoute le produit à la liste
		mesProduits.add(monProduit);

		// Redirection vers la page des produits
		resp.sendRedirect("produits");
	}

}
