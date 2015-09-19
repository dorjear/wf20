package com.dorjear.ralf.form.depositapp;

import com.dorjear.ralf.form.FormCustomerLevel;
import com.dorjear.ralf.form.base.FormResponseBase;


public class FormCustomerLevelResponse extends FormResponseBase {
	
	private FormCustomerLevel newCustomer;

	public FormCustomerLevel getNewCustomer() {
		return newCustomer;
	}

	public void setNewCustomer(FormCustomerLevel newCustomer) {
		this.newCustomer = newCustomer;
	}
	
}
