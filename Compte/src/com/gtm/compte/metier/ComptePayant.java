package com.gtm.compte.metier;

public class ComptePayant extends Compte {
	
	public ComptePayant(int code, float solde) {
		super(code, solde);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "ComptePayant [toString()=" + super.toString() + "]";
	}


	public void verser(float mt) {
		
		float taux = 0.01f;
		float i = solde * taux;
		solde = (float) (solde + mt - (0.01*mt));
		
		System.out.println(i + " has been taken from Your account!\nYour new solde is " + solde);
		
	}	
	public void retirer(float mt) {
		
		float taux = (float) 0.01;
		
		float decouvert = 0 - solde;
		
		if (decouvert > 200) {
			System.out.println("Your request was declined!");
		}
		else {
			float i = solde * taux;
			//solde = solde * ( 1 + taux);
			solde = (float) (solde - mt - (0.01*mt));
			
			System.out.println(i + " has been taken from Your account!\nYour new solde is " + solde);
		}
		
	}
		
}
