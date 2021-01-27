package fr.formation.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.model.Produit;

@WebServlet("/produit-supprimer")
public class ProduitSupprimerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// recuperation de l'index du produit à supprimer
		String idString = req.getParameter("id");
		int id = Integer.parseInt(idString);

		// reuperer liste des produits
		List<Produit> mesProduits = (List<Produit>) this.getServletContext().getAttribute("produits");

		// supprimer le produit de la liste
		mesProduits.remove(id);

		// redirection sur liste des produits
		resp.sendRedirect("produits");

	}
}
