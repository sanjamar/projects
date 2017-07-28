package com.gtm.TPInterface.metier;

public class Salesman extends Employee {
	
	private float turnover;
	
	/*public Salesman(String name, String surname, int age, String date) {
		super(name, surname, age, date);
		// TODO Auto-generated constructor stub
	}
	*/

	/*
	 * protected float calculTurnoverPart() {
	 * 		return this.turnover * Constants.TURNOVER_PART / 100;
	
	 */
	
	public Salesman(String name, String surname, int age, String date, float turnover) {
		super(name, surname, age, date);
		this.turnover = turnover;
	}


	public float getTurnover() {
		return turnover;
	}


	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}


	@Override
	public float calculSalary() {
		// TODO Auto-generated method stub
		return 0.20f*turnover + 400;
	// return this.calculTurnoverPart() + Constants.SALESMAN_PRIME;
	}

	@Override
	public String toString() {
		return "Salesman [turnover=" + turnover + ", toString()=" + super.toString() + "]";
	}
	
	
}
