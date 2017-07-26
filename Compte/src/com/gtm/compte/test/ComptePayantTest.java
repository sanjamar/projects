package com.gtm.compte.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.compte.metier.Compte;
import com.gtm.compte.metier.ComptePayant;

public class ComptePayantTest {

	@Test
	public void testVerser() {
		//fail("Not yet implemented");
		
		ComptePayant cp = new ComptePayant(5697258, 800);
		cp.verser(100);
	
		float resultat = cp.getSolde(); 
		Assert.assertEquals("Erreur verser", 899, resultat, 0);
		
		
		
	}

	@Test
	public void testRetirer() {
		//fail("Not yet implemented");
		
		ComptePayant cp = new ComptePayant(5697258, 800);
		cp.retirer(100);
		
		float resultat = cp.getSolde(); 
		Assert.assertEquals("Erreur retirer", 699, resultat, 0);
		
		
		
	}

}
