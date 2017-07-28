package com.gtm.TPInterface.metier;

public abstract class Employee {
	
	protected String name;
	private String surname;
	private int age;
	private String date;
	
	
	public String getName() {
		return "Employee " + name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Employee(String name, String surname, int age, String date) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", date=" + date + "]";
	}
	
	public abstract float calculSalary();
		
		

}
