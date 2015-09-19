package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppBaseReq;

public class FormAppReferRequest extends FormAppBaseReq {
	private String referReason;
	private String referToStaff;
	private String referToBranch;
	private String referFromStaff;
	private String referFromBranch;
	private String completionDate;
	private String note;
	private Boolean trackReferal;
	
	public String getReferReason() {
		return referReason;
	}
	public void setReferReason(String referReason) {
		this.referReason = referReason;
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
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Boolean getTrackReferal() {
		return trackReferal;
	}
	public void setTrackReferal(Boolean trackReferal) {
		this.trackReferal = trackReferal;
	}
	
	
}
