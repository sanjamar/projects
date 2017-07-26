package com.gtm.structure.metier;

/**
 * Classe de structure des voitures
 * @author sanja
 *
 */
public class Voiture {

	
	private String couleur;
	private String marque;
	private Personne proprietaire;
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public Personne getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	@Override
	public String toString() {
		return "Voiture [couleur=" + couleur + ", marque=" + marque + "]";
	}
	
	
}
