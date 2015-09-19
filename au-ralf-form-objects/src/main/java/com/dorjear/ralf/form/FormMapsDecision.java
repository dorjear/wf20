package com.dorjear.ralf.form;


public class FormMapsDecision {
	
	private String mapsRefId;
	private String status;
	private String creditCardNumber;
	private Integer creditLimit;
	private String[] referCodes;
	public String getMapsRefId() {
		return mapsRefId;
	}
	public void setMapsRefId(String mapsRefId) {
		this.mapsRefId = mapsRefId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public Integer getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String[] getReferCodes() {
		return referCodes;
	}
	public void setReferCodes(String[] referCodes) {
		this.referCodes = referCodes;
	}
}
