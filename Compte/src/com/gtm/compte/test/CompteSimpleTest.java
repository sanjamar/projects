package com.gtm.compte.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.compte.metier.Compte;
import com.gtm.compte.metier.CompteSimple;

public class CompteSimpleTest {

	@Test
	public void testRetirer() {
		//fail("Not yet implemented");
		CompteSimple cs = new CompteSimple(5697258, 800);
		
		cs.retirer(20);
		cs.retirer(10);
		cs.retirer(150);
		cs.retirer(-50);
		cs.retirer(950);

		float resultat = cs.getSolde(); 
		Assert.assertEquals("Erreur retirer", 620, resultat, 0);
		
	}

}
