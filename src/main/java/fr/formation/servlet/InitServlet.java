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

@WebServlet("/init")
public class InitServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Création de la liste des produits
		List<Produit> mesProduits = new ArrayList<>();

		mesProduits.add(new Produit("Hache Viking(APP)"));
		mesProduits.add(new Produit("Lance Romaine (APP)"));

		// Ajout de la liste dans le scope Application
		this.getServletContext().setAttribute("produits", mesProduits);

		// Redirection vers la liste des produits
		resp.sendRedirect("produits");
	}
}
