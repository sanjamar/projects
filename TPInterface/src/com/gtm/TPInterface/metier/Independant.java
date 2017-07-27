package com.gtm.TPInterface.metier;

import java.util.ArrayList;
import java.util.List;

public class Independant extends Employee {
	
	private int sirenNumber;
	private List<Bill> bills = new ArrayList<Bill>();
	

	public Independant(String name, String surname, int sirenNumber) {
		super(name, surname, 0, null);
		this.sirenNumber = sirenNumber;
	}

	
	public int getSirenNumber() {
		return sirenNumber;
	}


	public void setSirenNumber(int sirenNumber) {
		this.sirenNumber = sirenNumber;
	}


	public List<Bill> getBills() {
		return bills;
	}


	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}


	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Independant " + name;
	}


	@Override
	public float calculSalary() {
		// TODO Auto-generated method stub
		float total = 0;
		
		
		for(Bill bill: bills) {
			
			
			
			if (!bill.getLabel().startsWith("Frais de déplacement - ") ) {
				
				total +=  bill.getAmount();
			}
				
			
		}
		return total;
		
		
	}

}
