package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustBaseReq;
import com.dorjear.ralf.form.FormCustKycInfo;

public class FormUpdateCustKycRequest extends FormCustBaseReq {
	private FormCustKycInfo customerKycInfo;

	public FormCustKycInfo getCustomerKycInfo() {
		return customerKycInfo;
	}

	public void setCustomerKycInfo(FormCustKycInfo customerKycInfo) {
		this.customerKycInfo = customerKycInfo;
	}


}
