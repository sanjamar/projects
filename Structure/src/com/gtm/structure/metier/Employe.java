package com.gtm.structure.metier;

/**
 * Classe de structire des employés
 * @author sanja
 *
 */
public class Employe extends Personne {
	private Double salaire;
	
	
	public Employe(String nom, String prenom, int age, Double salaire) {
		super(nom, prenom, age);
		this.salaire = salaire;
		
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
		
	}

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}
	
	public void methode9() {
		System.out.println("Je suis dans la classe Employe");
	}
	
	public void afficheSalaire() {
		System.out.println("Le salaire de l'employe est " + salaire);
	}

}
