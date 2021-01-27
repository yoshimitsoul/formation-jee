package fr.formation.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.formation.model.Fournisseur;

@WebListener
public class FournisseurInitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		List<Fournisseur> mesFournisseurs = new ArrayList<>();

		mesFournisseurs.add(new Fournisseur("Le comptoir des reliques"));
		mesFournisseurs.add(new Fournisseur("Histoire & Légendes"));
		mesFournisseurs.add(new Fournisseur("Parfums Rozzario"));

		sce.getServletContext().setAttribute("fournisseurs", mesFournisseurs);

	}

}
