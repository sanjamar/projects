package com.gtm.compte.presentation;

import java.util.Scanner;

import com.gtm.compte.metier.Compte;
import com.gtm.compte.metier.CompteEparge;
import com.gtm.compte.metier.ComptePayant;
import com.gtm.compte.metier.CompteSimple;


public class Main {
	
	public static void compteFonction1() {
		
		Compte c = new Compte(5697258, 800);
		c.verser(20);
		c.retirer(50);
		
		CompteSimple cs = new CompteSimple(5697258, 800, -200);
		cs.retirer(1000);
		
		
		CompteEparge ce = new CompteEparge (5697258, 800, (float) 1.01);
		ce.calculInterets();
		
		ComptePayant cp = new ComptePayant (5697258, 800);
		cp.retirer(20);
		cp.verser(10);
		
		System.out.println("nombre de compte = " + Compte.getNbCompte());
		
	}
	
	public static void compteFonction2() {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donner le numero du compte: ");
		int numero = clavier.nextInt();
		
		System.out.println("Donner le solde du compte: ");
		float solde = clavier.nextFloat();
		
		Compte c = new Compte(numero, solde);
		System.out.println(c);
		clavier.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//compteFonction1();
		compteFonction2();
		
	
	}

	
	
}
