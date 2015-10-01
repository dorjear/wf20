package com.dorjear.ralf.form;



public class FormApplication {
	
	private String appRefNumber;
	private String customerId;
	private String status;
	private String subStatus;
	private FormApplicationDetails applicationDetail;
	private FormCustomer applicant;
	private FormCustomer partner;
	private FormEvidData evidData;
	private FormEvidResult evidResult;
	private FormHubDecision depositDecision;
	private FormMapsDecision cardDecision;
	public String getAppRefNumber() {
		return appRefNumber;
	}
	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public FormApplicationDetails getApplicationDetail() {
		return applicationDetail;
	}
	public void setApplicationDetail(FormApplicationDetails applicationDetail) {
		this.applicationDetail = applicationDetail;
	}
	public FormCustomer getApplicant() {
		return applicant;
	}
	public void setApplicant(FormCustomer applicant) {
		this.applicant = applicant;
	}
	public FormCustomer getPartner() {
		return partner;
	}
	public void setPartner(FormCustomer partner) {
		this.partner = partner;
	}
	public FormEvidData getEvidData() {
		return evidData;
	}
	public void setEvidData(FormEvidData evidData) {
		this.evidData = evidData;
	}
	public FormEvidResult getEvidResult() {
		return evidResult;
	}
	public void setEvidResult(FormEvidResult evidResult) {
		this.evidResult = evidResult;
	}
	public FormHubDecision getDepositDecision() {
		return depositDecision;
	}
	public void setDepositDecision(FormHubDecision depositDecision) {
		this.depositDecision = depositDecision;
	}
	public FormMapsDecision getCardDecision() {
		return cardDecision;
	}
	public void setCardDecision(FormMapsDecision cardDecision) {
		this.cardDecision = cardDecision;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	
	
}
