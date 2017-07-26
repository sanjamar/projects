package com.gtm.compte.metier;

public class Compte {
	
	private int code;
	protected float solde;
	private static int nbCompte;
	
	//constructeur
	
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
		nbCompte++;
	}
	public void verser(float mt) {
		
		
		if (mt < 0)  {
			
			System.out.println("You don't have enough money on Your account!");
		}
		else {
			
			solde = solde + mt;
			System.out.println("Your deposit of " + mt + " has been added on Your account!\nYour new solde is " + solde);
			
		}
		
	}	
	public void retirer(float mt) {
			
			
			if (mt <0)  {
				
				System.out.println("You don't have enough money on Your account!");
			}
			else {
				
				if (mt > solde) {
					System.out.println("Invalide request!");
					
				}
				else {
					solde = solde - mt;
					System.out.println(mt + " has been taken from Your account!\nYour new solde is " + solde);
				}
				
				
			}	
		
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	
	
	public static int getNbCompte() {
		return nbCompte;
	}
	public static void setNbCompte(int nbComptes) {
		Compte.nbCompte = nbCompte;
	}
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}

	
	
	
	
	

}
