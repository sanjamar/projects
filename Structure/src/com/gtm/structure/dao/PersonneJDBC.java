package com.gtm.structure.dao;



import com.gtm.structure.metier.Personne;

/**
 * Class qui permet d'interroger la base de donées
 * @author sanja
 * 
 */

public class PersonneJDBC {
	
	/**
	 * Méthode d'ajout d'une personne
	 * @param p personne à ajouter en base de donées
	 */
	public void ajouterPersonne(Personne p) {
		
		System.out.println("J'ajoute la personne "+p+" en basse de données");
		
	}

	/*public void lirePersonne(Personne p) {
		
		System.out.println("Je lis personne " +p);
	}*/
	
	/**
	 * Méthode de récupération d'une personne en BDD 
	 * @param p personne à récupérer
	 * @return personne trouvé en BDD
	 */
	
	public Personne lirePersonne(Personne p) {
		
		return p;
	}
	
	/**
	 * Méthode de suppression d'une personne en BDD
	 * @param p personne à suppremer de la BDD
	 */
	
	public void supprimerPersonne(Personne p) {
		
		System.out.println(p+ " supprimée");
	}
	
	/**
	 * Méthode de modification du nom et du prenom d'une personne
	 * @param p personne à modifier
	 * @param lenom le nouveau nom de la personne
	 * @param leprenom le noueveau prenom de la personne
	 * @return personne apès mise à jour
	 */
	
	public Personne modifierPersonne(Personne p, String lenom, String leprenom) {
		
		//System.out.println("Je modifie personne " +p);
		
		p.setNom(lenom);
		p.setPrenom(leprenom);
		return p;
	}
}
