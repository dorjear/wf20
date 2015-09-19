package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustBaseReq;
import com.dorjear.ralf.form.FormCustCompoundInfo;

public class FormUpdateCustCompoundInfoRequest extends FormCustBaseReq {
	private FormCustCompoundInfo customerCompoundInfo;

	public FormCustCompoundInfo getCustomerCompoundInfo() {
		return customerCompoundInfo;
	}

	public void setCustomerCompoundInfo(FormCustCompoundInfo customerCompoundInfo) {
		this.customerCompoundInfo = customerCompoundInfo;
	}	
}
