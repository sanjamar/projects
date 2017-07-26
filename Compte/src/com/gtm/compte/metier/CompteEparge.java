package com.gtm.compte.metier;

public class CompteEparge extends Compte {

	private float taux;

	public CompteEparge(int code, float solde) {
		super(code, solde);
		// TODO Auto-generated constructor stub
	}
	public CompteEparge(int code, float solde, float taux) {
		super(code, solde);
		this.taux = taux;
	}


	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", toString()=" + super.toString() + "]";
	}

	public void calculInterets() {
		
		//taux = (float) 0.01;
		if (solde > 0){
			float i = solde * taux;
			solde = solde * ( 1 + taux);
			
			System.out.println(i + " was added to Your account.\nYour new sold is " + solde);
		}
		else {
			System.out.println("Money was not added to your account! ");
		}
					
		
	}
}
