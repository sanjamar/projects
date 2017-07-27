package com.gtm.TPInterface.metier;

import java.util.ArrayList;
import java.util.Collection;


public class Staff {
	
	
	
	private final Collection<Employee> employees; 
	
	public Staff() {
	
		super();
		this.employees = new ArrayList<Employee>();
		
		
	}
	 public void add(final Employee e) {
		 this.employees.add(e);
	 }
	 
	 public Employee get(int i) {
			 
		 return ((ArrayList<Employee>) employees).get(i);
	 }
	 
	 public int size() {
		 return employees.size();
	 }
	
	 public void displaySalary() {
		 
		 /*for(final Employee employee : this.employees) {
		  * 
		  * System.out.println("\t-Employee " + employee.getName()
		  * 	+ " " + employee.getSurname() + " has salary of "
		  * 	+ employee.calculSalary() + " €.");
		   }
		  */
		  for (int i=0; i<employees.size(); i++) {
		    	System.out.println(((ArrayList<Employee>) employees).get(i).getName() + " " + ((ArrayList<Employee>) employees).get(i).getSurname() + " has salary of " + ((ArrayList<Employee>) employees).get(i).calculSalary() + " €.");
		    }
		 
	 }
	 public void displayAverageSalary() {
		 
		 /*long total = 0;
		  * for(final Employee employee : this.employees) {
		  * 
		  * 	total += employee.calculSalary();
		  * 
		  * 
		  * System.out.println("The average salary is: "  + (total/ employees.size()) + " €.");
		   }
		  */
		 
		 float averageSalary = 0;
		 
		 for (int i=0; i<employees.size(); i++) {
			 averageSalary = averageSalary + ((ArrayList<Employee>) employees).get(i).calculSalary();
			 
		    }
		 averageSalary = averageSalary/employees.size();
		 System.out.println("The average salary is: " + averageSalary + " €.");
		 
	 }

}
