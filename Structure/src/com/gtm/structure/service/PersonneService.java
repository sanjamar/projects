package com.gtm.structure.service;

import com.gtm.structure.dao.PersonneJDBC;
import com.gtm.structure.metier.Personne;

/**
 * Classe de service
 * @author sanja
 *
 */

public class PersonneService {
	
	//declaration and initialization of the variable of DAO
	private PersonneJDBC personneJDBC= new PersonneJDBC();
    
	//getter
	public PersonneJDBC getPersonneJDBC() {
		return personneJDBC;
	}
	//setter
	public void setPersonneJDBC(PersonneJDBC personneJDBC) {
		this.personneJDBC = personneJDBC;
	}
	
	//gestion de la demande de creation d'une personne
	public void ajouterPersonne(Personne p) {
		personneJDBC.ajouterPersonne(p);
	}
	
	/*public void lirePersonne (Personne p) {
		personneJDBC.lirePersonne(p);
	}*/
	
	public Personne lirePersonne(Personne p) {
		return personneJDBC.lirePersonne(p);
	}
	
	public void supprimerPersonne (Personne p) {
		personneJDBC.supprimerPersonne(p);
	}
	
	public Personne modifierPersonne (Personne p, String lenom, String leprenom) {
		return personneJDBC.modifierPersonne(p, lenom, leprenom);
	}

}
