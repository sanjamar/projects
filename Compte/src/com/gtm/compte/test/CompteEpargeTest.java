package com.gtm.compte.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.compte.metier.CompteEparge;

public class CompteEpargeTest {

	@Test
	public void testCalculInterets() {
		//fail("Not yet implemented");
		
		CompteEparge ce = new CompteEparge(5697258, 800);
		
		
		ce.setTaux(0.01f);
		ce.setTaux(0.03f);
		
		ce.calculInterets();
		
		float resultat = ce.getSolde(); 
		Assert.assertEquals("Erreur", 824, resultat, 0);
		
		
		
		
	}

}
