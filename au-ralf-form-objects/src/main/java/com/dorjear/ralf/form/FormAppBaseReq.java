package com.dorjear.ralf.form;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAppBaseReq extends FormRequestBase {
	private String appRefNumber = null;

	public String getAppRefNumber() {
		return appRefNumber;
	}

	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}


}
