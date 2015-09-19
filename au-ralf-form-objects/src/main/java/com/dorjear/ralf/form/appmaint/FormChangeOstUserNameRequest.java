package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppBaseReq;

public class FormChangeOstUserNameRequest extends FormAppBaseReq {
	private String applicantOstUserName;
	private String partnerOstUserName;

	public String getApplicantOstUserName() {
		return applicantOstUserName;
	}
	public void setApplicantOstUserName(String applicantOstUserName) {
		this.applicantOstUserName = applicantOstUserName;
	}
	public String getPartnerOstUserName() {
		return partnerOstUserName;
	}
	public void setPartnerOstUserName(String partnerOstUserName) {
		this.partnerOstUserName = partnerOstUserName;
	}
	
	
	
}
