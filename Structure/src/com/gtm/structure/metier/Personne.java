package com.gtm.structure.metier;

import java.util.Collection;

/**
 * structure de la classe personne
 * @author sanja
 *
 */

public class Personne {

	/**
	 * nom de la personne
	 */
	protected String nom;
	protected String prenom;
	protected int age;
	protected Collection<Voiture> mesVoitures;
	protected static int nbPersonne;
	protected final int nbJambes=2;
	
	/**
	 * Méthode de récupération du nom de la personne
	 * @return retourne le nom  de la personne
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {   
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Collection<Voiture> getMesVoitures() {
		return mesVoitures;
	}
	public void setMesVoitures(Collection<Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
	}
	
	
	public static int getNbPersonne() {
		return nbPersonne;
	}
	public static void setNbPersonne(int nbPersonne) {
		Personne.nbPersonne = nbPersonne;
	}
	@Override
	/**
	 * 
	 */
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		nbPersonne++;

		
	}
	public Personne() {
		super();
		nbPersonne++;
	}
	
	public final void methode() {
		System.out.println("I can't redefine it!");
	}
	

}
