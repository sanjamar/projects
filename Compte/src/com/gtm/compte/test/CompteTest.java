package com.gtm.compte.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.gtm.compte.metier.Compte;

public class CompteTest {

	@Test
	public void testVerser() {
		//fail("Not yet implemented");
		
		/*int solde = 800;
		float mt = 0;*/
		Compte c = new Compte(5697258, 800);
		c.verser(50);
		c.verser(80);
		c.verser(0);
		
		float resultat = c.getSolde(); 
		Assert.assertEquals("Erreur verser", 930, resultat, 0);
		
	}
	//@Ignore
	@Test
	public void testRetirer() {
		//fail("Not yet implemented");
		
		Compte c = new Compte(5697258, 800);
		c.retirer(60);
		c.retirer(70);
		c.retirer(100);

		
		float resultat = c.getSolde(); 
		Assert.assertEquals("Erreur retirer", 570, resultat, 0);
		
	}
	

}
