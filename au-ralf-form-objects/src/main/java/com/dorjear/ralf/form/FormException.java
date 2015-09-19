package com.dorjear.ralf.form;

import java.util.List;

public class FormException {

	private String exception;
	private String applicantType;
	private String approvalStatus;
	
	private List<FormExceptionApproval> approvals;
	private List<FormBlackListMatchRecord> blackListMatchRecords;
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public List<FormExceptionApproval> getApprovals() {
		return approvals;
	}
	public void setApprovals(List<FormExceptionApproval> approvals) {
		this.approvals = approvals;
	}
	public List<FormBlackListMatchRecord> getBlackListMatchRecords() {
		return blackListMatchRecords;
	}
	public void setBlackListMatchRecords(
			List<FormBlackListMatchRecord> blackListMatchRecords) {
		this.blackListMatchRecords = blackListMatchRecords;
	}
	
	
	
	
}
