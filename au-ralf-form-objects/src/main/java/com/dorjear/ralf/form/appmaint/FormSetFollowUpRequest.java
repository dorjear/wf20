package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppBaseReq;

public class FormSetFollowUpRequest extends FormAppBaseReq {
	private String followUpDate;
	private String followUpTime;
	private String note;
	public String getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(String followUpDate) {
		this.followUpDate = followUpDate;
	}
	public String getFollowUpTime() {
		return followUpTime;
	}
	public void setFollowUpTime(String followUpTime) {
		this.followUpTime = followUpTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
