package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustBaseReq;
import com.dorjear.ralf.form.FormCustEmployment;

public class FormUpdateCustEmploymentRequest extends FormCustBaseReq {
	private FormCustEmployment customerEmployment;

	public FormCustEmployment getCustomerEmployment() {
		return customerEmployment;
	}

	public void setCustomerEmployment(FormCustEmployment customerEmployment) {
		this.customerEmployment = customerEmployment;
	}


}
