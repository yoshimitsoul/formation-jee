package fr.formation.model;

import javax.servlet.annotation.WebServlet;


@WebServlet
public class Produit {

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Produit(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "TS " + this.nom;
	}
}