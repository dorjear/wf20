package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustBaseReq;
import com.dorjear.ralf.form.FormCustNationalities;

public class FormUpdateCustNationalitiesRequest extends FormCustBaseReq {
	private FormCustNationalities customerNationalities;

	public FormCustNationalities getCustomerNationalities() {
		return customerNationalities;
	}

	public void setCustomerNationalities(FormCustNationalities customerNationalities) {
		this.customerNationalities = customerNationalities;
	}
	
}
