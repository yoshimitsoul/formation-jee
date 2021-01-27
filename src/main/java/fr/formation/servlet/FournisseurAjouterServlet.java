package fr.formation.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.model.Fournisseur;

@WebServlet("/fournisseur-ajouter")
public class FournisseurAjouterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/fournisseur-ajout.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Récupèration des paramètres
		String fournisseurNom = req.getParameter("nom");

		// Construction du fournisseur
		Fournisseur monFournisseur = new Fournisseur(fournisseurNom);

		// Récupération de la liste des fournisseurs du scope Application
		List<Fournisseur> mesFournisseurs = (List<Fournisseur>) this.getServletContext().getAttribute("fournisseurs");

		// Ajout du fournisseur à la liste
		mesFournisseurs.add(monFournisseur);

		// Rediriger vers la liste des fournisseurs
		resp.sendRedirect("fournisseurs");
	}
}
