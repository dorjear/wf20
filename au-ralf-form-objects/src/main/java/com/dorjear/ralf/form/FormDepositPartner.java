package com.dorjear.ralf.form;

public class FormDepositPartner extends FormDepositStep1{
	
	private String premierEligibility;
	private String hubCustomerId;
	private Boolean otpRequired;

	public String getPremierEligibility() {
		return premierEligibility;
	}
	public void setPremierEligibility(String premierEligibility) {
		this.premierEligibility = premierEligibility;
	}
	public String getHubCustomerId() {
		return hubCustomerId;
	}
	public void setHubCustomerId(String hubCustomerId) {
		this.hubCustomerId = hubCustomerId;
	}
	public Boolean getOtpRequired() {
		return otpRequired;
	}
	public void setOtpRequired(Boolean otpRequired) {
		this.otpRequired = otpRequired;
	}

	
}
