package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormCustSearchRequest extends FormRequestBase {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
