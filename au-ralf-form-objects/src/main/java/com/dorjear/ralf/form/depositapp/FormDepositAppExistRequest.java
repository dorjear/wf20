package com.dorjear.ralf.form.depositapp;

import com.dorjear.ralf.form.FormDepositAppExist;
import com.dorjear.ralf.form.base.FormRequestBase;


public class FormDepositAppExistRequest extends FormRequestBase{
	
	private FormDepositAppExist depositAppExist;

	public FormDepositAppExist getDepositAppExist() {
		return depositAppExist;
	}

	public void setDepositAppExist(FormDepositAppExist depositAppExist) {
		this.depositAppExist = depositAppExist;
	}
	
}
