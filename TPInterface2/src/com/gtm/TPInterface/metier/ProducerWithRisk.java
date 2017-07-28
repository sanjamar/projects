package com.gtm.TPInterface.metier;

public class ProducerWithRisk extends Producer {
	
	private int prime;

	public ProducerWithRisk(String name, String surname, int age, String date, int nbUnits) {
		super(name, surname, age, date, nbUnits);
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
		return "ProducerWithRisk [prime=" + prime + ", toString()=" + super.toString() + "]";
	}
	
}
