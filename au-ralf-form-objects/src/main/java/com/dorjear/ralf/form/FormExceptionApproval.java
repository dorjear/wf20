package com.dorjear.ralf.form;

public class FormExceptionApproval {

	private String level;
	private String[] approverRoles;
	private String [] onBehalfOfApproverGroups;
	
	private String approveType;
	private String note;
	private String approvedBy;
	private String approvalDate;
//	private String applicantType;
//	private String riskType;
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String[] getApproverRoles() {
		return approverRoles;
	}
	public void setApproverRoles(String[] approverRoles) {
		this.approverRoles = approverRoles;
	}
	public String[] getOnBehalfOfApproverGroups() {
		return onBehalfOfApproverGroups;
	}
	public void setOnBehalfOfApproverGroups(String[] onBehalfOfApproverGroups) {
		this.onBehalfOfApproverGroups = onBehalfOfApproverGroups;
	}
	public String getApproveType() {
		return approveType;
	}
	public void setApproveType(String approveType) {
		this.approveType = approveType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
//	public String getApplicantType() {
//		return applicantType;
//	}
//	public void setApplicantType(String applicantType) {
//		this.applicantType = applicantType;
//	}
//	public String getRiskType() {
//		return riskType;
//	}
//	public void setRiskType(String riskType) {
//		this.riskType = riskType;
//	}
	
	
	
}
