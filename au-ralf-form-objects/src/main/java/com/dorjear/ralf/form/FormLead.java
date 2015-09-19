package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;

public class FormLead {
	private String id;
	private String need;
	private String productGroup;
	@Unique
	private String[] products;
	private String campaignCode;
	private String referToStaff;
	private String referToBranch;
	private String referToStaffRole;
	private String referReasonCode;
	private String priority;
	private String note;
	private String referFromBranch;
	private String referFromStaff;
	
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String followUpDate;
	private String expectCompletionDate;
	private int borrowingPercent;
	private int purchasePrice;
	private String hubCustomerId;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
	public String[] getProducts() {
		return products;
	}

	public void setProducts(String[] products) {
		this.products = products;
	}

	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public String getReferToStaff() {
		return referToStaff;
	}
	public void setReferToStaff(String referToStaff) {
		this.referToStaff = referToStaff;
	}
	public String getReferToBranch() {
		return referToBranch;
	}
	public void setReferToBranch(String referToBranch) {
		this.referToBranch = referToBranch;
	}
	
	public String getReferToStaffRole() {
		return referToStaffRole;
	}
	public void setReferToStaffRole(String referToStaffRole) {
		this.referToStaffRole = referToStaffRole;
	}
	
	public String getReferReasonCode() {
		return referReasonCode;
	}
	public void setReferReasonCode(String referReasonCode) {
		this.referReasonCode = referReasonCode;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(String followUpDate) {
		this.followUpDate = followUpDate;
	}
	public String getExpectCompletionDate() {
		return expectCompletionDate;
	}

	public void setExpectCompletionDate(String expectCompletionDate) {
		this.expectCompletionDate = expectCompletionDate;
	}

	public int getBorrowingPercent() {
		return borrowingPercent;
	}

	public void setBorrowingPercent(int borrowingPercent) {
		this.borrowingPercent = borrowingPercent;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
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

	public String getHubCustomerId() {
		return hubCustomerId;
	}

	public void setHubCustomerId(String hubCustomerId) {
		this.hubCustomerId = hubCustomerId;
	}

}
