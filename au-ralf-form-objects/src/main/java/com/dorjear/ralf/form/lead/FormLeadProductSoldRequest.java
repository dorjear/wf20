package com.dorjear.ralf.form.lead;

import com.dorjear.ralf.form.FormAppBaseReq;

public class FormLeadProductSoldRequest extends FormAppBaseReq{
	private String newAccountNumber;
	private String referToStaff;
	private String referToBranch;
	private String referFromStaff;
	private String referFromBranch;
	
	public String getNewAccountNumber() {
		return newAccountNumber;
	}
	public void setNewAccountNumber(String newAccountNumber) {
		this.newAccountNumber = newAccountNumber;
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
	public String getReferFromStaff() {
		return referFromStaff;
	}
	public void setReferFromStaff(String referFromStaff) {
		this.referFromStaff = referFromStaff;
	}
	public String getReferFromBranch() {
		return referFromBranch;
	}
	public void setReferFromBranch(String referFromBranch) {
		this.referFromBranch = referFromBranch;
	}
}
