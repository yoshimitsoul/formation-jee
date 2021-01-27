package fr.formation.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.model.Produit;

@WebServlet("/panier-ajout")
public class PanierAjoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recuperer le parametre id -> pour l'index du produit
		String idString = req.getParameter("id");
		int id = Integer.parseInt(idString);

		// recuperer la liste des produits du scope application
		List<Produit> mesProduits = (List<Produit>) this.getServletContext().getAttribute("produits");

		// recuprer leproduit en question (liste + index)
		Produit monProduit = mesProduits.get(id);

		// recuperer la liste des produits de la scope session("panier")
		List<Produit> monPanier = (List<Produit>) req.getSession().getAttribute("panier");

		// soit la liste existe et tant mieux, soit non et il faut la créer (+add to
		// scope)
		if (monPanier == null) {
			monPanier = new ArrayList<>();
			req.getSession().setAttribute("panier", monPanier);
		}

		// ajouter le produit à la liste des produits du scope session
		monPanier.add(monProduit);
		// Rediriger vers le panier
		resp.sendRedirect("panier");

	}
}
