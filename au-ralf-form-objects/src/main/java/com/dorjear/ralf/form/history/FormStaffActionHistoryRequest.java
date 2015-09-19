package com.dorjear.ralf.form.history;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormStaffActionHistoryRequest extends FormRequestBase{

	private Long ralfCustomerId;
	private String appRefNumber;
	public String getAppRefNumber() {
		return appRefNumber;
	}
	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}
	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}
	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	
}
