package com.gtm.TPInterface.metier;

import java.util.Date;

public class Bill {
	
	private Date billDate;
	private float amount;
	private String label;
	
	public Date getBillDate() {
		return billDate;
	}
	public Bill(Date billDate, float amount, String label) {
		super();
		this.billDate = billDate;
		this.amount = amount;
		this.label = label;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
