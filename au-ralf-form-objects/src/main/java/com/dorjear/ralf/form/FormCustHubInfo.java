package com.dorjear.ralf.form;



public class FormCustHubInfo {
	

	private String segment;
	private String corporatePartner;
	private String relationshipManager;
	private String financialPlanner;
	private String lastKYCRefreshDate;
	private FormCustHubProduct[] products = new FormCustHubProduct[0];
	private String powerOfAttoneyCode;
	private Boolean allowMarketingEmail;
	private Boolean allowMarketingSMS;
	private Boolean allowMarketingPhone;
	private Boolean allowMarketingDirectMail;
	private Boolean pbnRegistration;
	
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getCorporatePartner() {
		return corporatePartner;
	}
	public void setCorporatePartner(String corporatePartner) {
		this.corporatePartner = corporatePartner;
	}
	public String getRelationshipManager() {
		return relationshipManager;
	}
	public void setRelationshipManager(String relationshipManager) {
		this.relationshipManager = relationshipManager;
	}
	public String getFinancialPlanner() {
		return financialPlanner;
	}
	public void setFinancialPlanner(String financialPlanner) {
		this.financialPlanner = financialPlanner;
	}
	public String getLastKYCRefreshDate() {
		return lastKYCRefreshDate;
	}
	public void setLastKYCRefreshDate(String lastKYCRefreshDate) {
		this.lastKYCRefreshDate = lastKYCRefreshDate;
	}
	public FormCustHubProduct[] getProducts() {
		return products;
	}
	public void setProducts(FormCustHubProduct[] products) {
		this.products = products;
	}
	public String getPowerOfAttoneyCode() {
		return powerOfAttoneyCode;
	}
	public void setPowerOfAttoneyCode(String powerOfAttoneyCode) {
		this.powerOfAttoneyCode = powerOfAttoneyCode;
	}
	public Boolean getAllowMarketingEmail() {
		return allowMarketingEmail;
	}
	public void setAllowMarketingEmail(Boolean allowMarketingEmail) {
		this.allowMarketingEmail = allowMarketingEmail;
	}
	public Boolean getAllowMarketingSMS() {
		return allowMarketingSMS;
	}
	public void setAllowMarketingSMS(Boolean allowMarketingSMS) {
		this.allowMarketingSMS = allowMarketingSMS;
	}
	public Boolean getAllowMarketingPhone() {
		return allowMarketingPhone;
	}
	public void setAllowMarketingPhone(Boolean allowMarketingPhone) {
		this.allowMarketingPhone = allowMarketingPhone;
	}
	public Boolean getAllowMarketingDirectMail() {
		return allowMarketingDirectMail;
	}
	public void setAllowMarketingDirectMail(Boolean allowMarketingDirectMail) {
		this.allowMarketingDirectMail = allowMarketingDirectMail;
	}
	public Boolean getPbnRegistration() {
		return pbnRegistration;
	}
	public void setPbnRegistration(Boolean pbnRegistration) {
		this.pbnRegistration = pbnRegistration;
	}
	
}
