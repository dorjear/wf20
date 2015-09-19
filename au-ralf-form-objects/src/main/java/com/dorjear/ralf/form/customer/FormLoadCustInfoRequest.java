package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustBaseReq;

public class FormLoadCustInfoRequest extends FormCustBaseReq {
	private String debitCard;
	private String creditCard;
	private String hubCustomerId;
	private String pbn;
	private String hubAccountNumber;
	private String generalCustomerNumber;	

	public String getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(String debitCard) {
		this.debitCard = debitCard;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getHubCustomerId() {
		return hubCustomerId;
	}

	public void setHubCustomerId(String hubCustomerId) {
		this.hubCustomerId = hubCustomerId;
	}

	public String getPbn() {
		return pbn;
	}

	public void setPbn(String pbn) {
		this.pbn = pbn;
	}

	public String getHubAccountNumber() {
		return hubAccountNumber;
	}

	public void setHubAccountNumber(String hubAccountNumber) {
		this.hubAccountNumber = hubAccountNumber;
	}

	public String getGeneralCustomerNumber() {
		return generalCustomerNumber;
	}

	public void setGeneralCustomerNumber(String generalCustomerNumber) {
		this.generalCustomerNumber = generalCustomerNumber;
	}
	
}
