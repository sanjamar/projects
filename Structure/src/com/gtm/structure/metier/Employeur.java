package com.gtm.structure.metier;

/**
 * Classe de structure d'employeur
 * @author sanja
 *
 */
public class Employeur extends Personne {
	
	private Double dividende;
	

	public Employeur(String nom, String prenom, int age, Double dividende) {
		super(nom, prenom, age);
		this.dividende = dividende;
	}

	public Double getDividende() {
		return dividende;
	}

	public void setDividende(Double dividende) {
		this.dividende = dividende;
	}

	@Override
	public String toString() {
		return "Employeur [dividende=" + dividende + ", toString()=" + super.toString() + "]";
	}
	
	public void methode10() {
		System.out.println("Je suis dans la classe Employeur");
	}
	
	public void afficheDividende() {
		System.out.println("Le dividende de l'employeur est " + dividende);
	}

	// try of redefinition of the method final
	/*public final void methode() {
		System.out.println("I can't redefine it!");
	}*/
	
}
