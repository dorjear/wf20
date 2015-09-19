package com.dorjear.ralf.form.history;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormManualNoteHistoryRequest extends FormRequestBase{
	private Long ralfCustomerId;
	private String appRefNumber;
	private Boolean forCustomerOnly;
	private Boolean forAppLeadOnly;
	

	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}
	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	public String getAppRefNumber() {
		return appRefNumber;
	}
	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}
	public Boolean isForCustomerOnly() {
		return forCustomerOnly;
	}
	public void setForCustomerOnly(Boolean forCustomerOnly) {
		this.forCustomerOnly = forCustomerOnly;
	}
	public Boolean isForAppLeadOnly() {
		return forAppLeadOnly;
	}
	public void setForAppLeadOnly(Boolean forAppLeadOnly) {
		this.forAppLeadOnly = forAppLeadOnly;
	}
}
