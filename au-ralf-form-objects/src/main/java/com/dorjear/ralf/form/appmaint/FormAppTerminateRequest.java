package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppBaseReq;

public class FormAppTerminateRequest extends FormAppBaseReq{
	private String terminateReason;
	private String referToStaff;
	private String referToBranch;
	private String referFromStaff;
	private String referFromBranch;
	private String note;
	
	public String getTerminateReason() {
		return terminateReason;
	}
	public void setTerminateReason(String terminateReason) {
		this.terminateReason = terminateReason;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
