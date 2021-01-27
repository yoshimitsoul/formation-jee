package fr.formation.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.formation.model.Produit;

@WebListener
public class ProduitInitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		// creation de la liste
		List<Produit> mesProduits = new ArrayList<>();
		System.out.println("création liste");

		mesProduits.add(new Produit("Hache viking"));
		mesProduits.add(new Produit("Oeuf de Fabergé"));

		// aAjout de la liste dans le scope d'app
		sce.getServletContext().setAttribute("produits", mesProduits);

	}

}
