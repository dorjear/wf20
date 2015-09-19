package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;


public class FormAppLeadSummary {
	private String appRefNumber;
	private Long ralfCustomerId;
	private String hubCustomerId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String hubCustomerType;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateOfBirth;
	
	private String campaign;
	private String need;
	private String productGroup;
	private String[] productCodes;
	private String assignedToStaff;
	private String assignedToStaffName;
	private String assignedToBranch;
	private String appOrLead;
	private String status;
	private String suburb;
	private String postcode;
	private String idType;
	private String idNumber;
	private String recordType;
	private String channel;
	private String beError1;
	private String beError2;
	private String evidOverall;
	private Boolean fraud;
	private Boolean pep;
	private Boolean sanctions;
	private Boolean velocity;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateEntered;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateSubmitted;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateLastActioned;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateFollowUp;
	
	private String createdBy;
	private String createdByName;
	private String monitoredBy;
	private String monitoredByName;
	private String source;

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
	public String getHubCustomerId() {
		return hubCustomerId;
	}
	public void setHubCustomerId(String hubCustomerId) {
		this.hubCustomerId = hubCustomerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHubCustomerType() {
		return hubCustomerType;
	}
	public void setHubCustomerType(String hubCustomerType) {
		this.hubCustomerType = hubCustomerType;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public String getNeed() {
		return need;
	}
	public void setNeed(String need) {
		this.need = need;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String[] getProductCodes() {
		return productCodes;
	}
	public void setProductCodes(String[] productCodes) {
		this.productCodes = productCodes;
	}
	public String getAssignedToStaff() {
		return assignedToStaff;
	}
	public void setAssignedToStaff(String assignedToStaff) {
		this.assignedToStaff = assignedToStaff;
	}
	public String getAssignedToStaffName() {
		return assignedToStaffName;
	}
	public void setAssignedToStaffName(String assignedToStaffName) {
		this.assignedToStaffName = assignedToStaffName;
	}
	public String getAssignedToBranch() {
		return assignedToBranch;
	}
	public void setAssignedToBranch(String assignedToBranch) {
		this.assignedToBranch = assignedToBranch;
	}
	public String getAppOrLead() {
		return appOrLead;
	}
	public void setAppOrLead(String appOrLead) {
		this.appOrLead = appOrLead;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getBeError1() {
		return beError1;
	}
	public void setBeError1(String beError1) {
		this.beError1 = beError1;
	}
	public String getBeError2() {
		return beError2;
	}
	public void setBeError2(String beError2) {
		this.beError2 = beError2;
	}
	public String getEvidOverall() {
		return evidOverall;
	}
	public void setEvidOverall(String evidOverall) {
		this.evidOverall = evidOverall;
	}
	public Boolean isFraud() {
		return fraud;
	}
	public void setFraud(Boolean fraud) {
		this.fraud = fraud;
	}
	public Boolean isPep() {
		return pep;
	}
	public void setPep(Boolean pep) {
		this.pep = pep;
	}
	public Boolean isSanctions() {
		return sanctions;
	}
	public void setSanctions(Boolean sanctions) {
		this.sanctions = sanctions;
	}
	public Boolean isVelocity() {
		return velocity;
	}
	public void setVelocity(Boolean velocity) {
		this.velocity = velocity;
	}
	public String getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(String dateEntered) {
		this.dateEntered = dateEntered;
	}
	public String getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	public String getDateLastActioned() {
		return dateLastActioned;
	}
	public void setDateLastActioned(String dateLastActioned) {
		this.dateLastActioned = dateLastActioned;
	}
	public String getDateFollowUp() {
		return dateFollowUp;
	}
	public void setDateFollowUp(String dateFollowUp) {
		this.dateFollowUp = dateFollowUp;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedByName() {
		return createdByName;
	}
	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}
	public String getMonitoredBy() {
		return monitoredBy;
	}
	public void setMonitoredBy(String monitoredBy) {
		this.monitoredBy = monitoredBy;
	}
	public String getMonitoredByName() {
		return monitoredByName;
	}
	public void setMonitoredByName(String monitoredByName) {
		this.monitoredByName = monitoredByName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Boolean getFraud() {
		return fraud;
	}
	public Boolean getPep() {
		return pep;
	}
	public Boolean getSanctions() {
		return sanctions;
	}
	public Boolean getVelocity() {
		return velocity;
	}
	
}
