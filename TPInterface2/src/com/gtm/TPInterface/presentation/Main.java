package com.gtm.TPInterface.presentation;

import java.util.Date;

import com.gtm.TPInterface.metier.Bill;
import com.gtm.TPInterface.metier.Independant;
import com.gtm.TPInterface.metier.Producer;
import com.gtm.TPInterface.metier.ProducerWithRisk;
import com.gtm.TPInterface.metier.Representant;
import com.gtm.TPInterface.metier.Salesman;
import com.gtm.TPInterface.metier.Staff;
import com.gtm.TPInterface.metier.Wharehouseman;
import com.gtm.TPInterface.metier.WharehousemanWithRisk;

public class Main {

	public static void main(String[] args) {
		
		final Staff employees = new Staff();
	    employees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
	    employees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
	    employees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
	    employees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
	    employees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
	    employees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
	    
	    Independant marcel = new Independant("Marcel", "DeVelo", 32);
	    employees.add(marcel);
	    Bill bill1 = new Bill(new Date(), 50, "gas bill");
	    Bill bill2 = new Bill(new Date(), 290, "Frais de déplacement - car");
	    marcel.getBills().add(bill1);
	    marcel.getBills().add(bill2);
	    
	    for (int i=0; i<employees.size(); i++) {
	    	System.out.println("Employee " + (i+1) + " is " + employees.get(i));
	    }
	    
	    employees.displaySalary();
	    employees.displayAverageSalary();

	}

}
