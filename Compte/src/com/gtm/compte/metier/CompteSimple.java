package com.gtm.compte.metier;

public class CompteSimple extends Compte {

	private float decouvert;

	public CompteSimple(int code, float solde) {
		super(code, solde);
		// TODO Auto-generated constructor stub

	}

	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}

	public void retirer(float mt) {

		if (mt < 0) {

			System.out.println("Invalide request!");
		} else {

			// If mt is bigger than solde and decouvert (not enough money)
			
			if (mt > solde - decouvert) {
				System.out.println("You don't have enough money on Your account!");
			}

			else {
				solde = solde - mt;
				//decouvert = 0 - solde;

				System.out.println(mt + " has been taken from Your account!\nYour new solde is " + solde);
				// System.out.println("Your request was declined!");
			}

		}
	}
}
