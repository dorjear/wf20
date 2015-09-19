package com.dorjear.ralf.form;


public class FormJointCustomer {
	
	private String customerNumber=null;
	private String customerName=null;
	private FormCustomerNameNumber[] relatedCustomers=new FormCustomerNameNumber[0];
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public FormCustomerNameNumber[] getRelatedCustomers() {
		return relatedCustomers;
	}
	public void setRelatedCustomers(FormCustomerNameNumber[] relatedCustomers) {
		this.relatedCustomers = relatedCustomers;
	}

}
