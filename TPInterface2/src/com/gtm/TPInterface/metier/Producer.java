package com.gtm.TPInterface.metier;

public class Producer extends Employee {
	
	protected int nbUnits;

	/*public Producer(String name, String surname, int age, String date) {
		super(name, surname, age, date);
		// TODO Auto-generated constructor stub
	}*/

	public Producer(String name, String surname, int age, String date, int nbUnits) {
		super(name, surname, age, date);
		this.nbUnits = nbUnits;
	}
	
	public float calculFixedSalary() {
		return nbUnits * 5;
	}
	
	@Override
	public float calculSalary() {
		// TODO Auto-generated method stub
		return calculFixedSalary();
	}

	@Override
	public String toString() {
		return "Producer [nbUnits=" + nbUnits + ", toString()=" + super.toString() + "]";
	}

}
