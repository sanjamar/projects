package com.gtm.TPInterface.metier;

public class Wharehouseman extends Employee {
	
	protected int nbHours;

	/*public Wharehouseman(String name, String surname, int age, String date) {
		super(name, surname, age, date);
		// TODO Auto-generated constructor stub
	}
*/
	
	public Wharehouseman(String name, String surname, int age, String date, int nbHours) {
		super(name, surname, age, date);
		this.nbHours = nbHours;
	}
	
	public float calculFixedSalary() {
		return nbHours * 65;
	}

	@Override
	public float calculSalary() {
		// TODO Auto-generated method stub
		return calculFixedSalary();
	}


	@Override
	public String toString() {
		return "Wharehouseman [nbHours=" + nbHours + ", toString()=" + super.toString() + "]";
	}

}
