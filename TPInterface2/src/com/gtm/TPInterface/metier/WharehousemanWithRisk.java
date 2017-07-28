package com.gtm.TPInterface.metier;

public class WharehousemanWithRisk extends Wharehouseman {
	
	private int prime;

	public WharehousemanWithRisk(String name, String surname, int age, String date, int nbHours) {
		super(name, surname, age, date, nbHours);
		// TODO Auto-generated constructor stub
		
		this.prime = 200;
		
	}
	@Override
	public float calculSalary() {
		// TODO Auto-generated method stub
		return calculFixedSalary() + prime;
	}
	@Override
	public String toString() {
		return "WharehousemanWithRisk [prime=" + prime + ", toString()=" + super.toString() + "]";
	}

}
