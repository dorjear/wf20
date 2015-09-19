package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;

public class FormAppAttribute {
	
	private Long ralfCustomerId;
	private String hubCustomerId;
	private String campaign;
	private String need;
	private String productGroup;
	private String[] productCodes;
	private String assignedToStaff;
	private String assignedToStaffName;
	private String assignedToBranch;
	private String appOrLead;
	private String channel;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateEntered;
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateSubmitted;
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateLastUpdated;
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateFollowUp;
	
	private String createdBy;
	private String createdByName;
	private String monitoredBy;
	private String monitoredByName;
	private String source;
	private String lastActionNote;
	private String referFromBranch;
	private String referFromStaff;
	private String referFromStaffName;
	private String referReasonCode;
	private String needIdentifiedByStaff;
	private String needIdentifiedByStaffName;
	private Integer borrowingPercent;
	private Integer purchasePrice;

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
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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
	public String getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(String dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
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
	public String getLastActionNote() {
		return lastActionNote;
	}
	public void setLastActionNote(String lastActionNote) {
		this.lastActionNote = lastActionNote;
	}
	public String getReferFromBranch() {
		return referFromBranch;
	}
	public void setReferFromBranch(String referFromBranch) {
		this.referFromBranch = referFromBranch;
	}
	public String getReferFromStaff() {
		return referFromStaff;
	}
	public void setReferFromStaff(String referFromStaff) {
		this.referFromStaff = referFromStaff;
	}
	public String getReferFromStaffName() {
		return referFromStaffName;
	}
	public void setReferFromStaffName(String referFromStaffName) {
		this.referFromStaffName = referFromStaffName;
	}
	public String getReferReasonCode() {
		return referReasonCode;
	}
	public void setReferReasonCode(String referReasonCode) {
		this.referReasonCode = referReasonCode;
	}
	public String getNeedIdentifiedByStaff() {
		return needIdentifiedByStaff;
	}
	public void setNeedIdentifiedByStaff(String needIdentifiedByStaff) {
		this.needIdentifiedByStaff = needIdentifiedByStaff;
	}
	public String getNeedIdentifiedByStaffName() {
		return needIdentifiedByStaffName;
	}
	public void setNeedIdentifiedByStaffName(String needIdentifiedByStaffName) {
		this.needIdentifiedByStaffName = needIdentifiedByStaffName;
	}
	public Integer getBorrowingPercent() {
		return borrowingPercent;
	}
	public void setBorrowingPercent(Integer borrowingPercent) {
		this.borrowingPercent = borrowingPercent;
	}
	public Integer getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
}
