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

@WebServlet("/produits")
public class ProduitServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Produit> mesProduits = new ArrayList<>();
		
		mesProduits.add(new Produit("Hache Leviathan"));
		mesProduits.add(new Produit("Lames du Chaos"));
		
		//AJOUT DE LA LISTE AU SCOPE REQUEST
		req.setAttribute("produits", mesProduits);

		//DELEGUATION DE LA REQUETE
		this.getServletContext()
			.getRequestDispatcher("/WEB-INF/views/produits.jsp")
			.forward(req, resp);
	}
}