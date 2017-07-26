package com.gtm.TestUnit.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.gtm.TestUnit.metier.Operation;

public class OperationTests {

	@Test
	public void testAdditon() {
		int resultat = Operation.additon(10, 13);
		Assert.assertEquals("ERREUR ADDITION", 23, resultat, 0);
	}
	
	@Test
	public void testSoustraction() {
		int resultat = Operation.soustraction(5, 6);
		Assert.assertEquals("ERREUR SOUSTRACTION", -1, resultat, 0);
	}
	
	@Test
	public void testMultiplication() {
		int resultat = Operation.multiplication(10, 7);
		Assert.assertEquals("ERREUR MULTIPLICATION", 70, resultat, 0);
	}
	//@Ignore
	@Test
	public void testDivision() {
		int resultat = Operation.division(9, 3);
		Assert.assertEquals("ERREUR DIVISION", 3, resultat, 0);
	}

}
