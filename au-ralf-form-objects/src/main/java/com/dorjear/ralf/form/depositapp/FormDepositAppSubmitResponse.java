package com.dorjear.ralf.form.depositapp;

import com.dorjear.ralf.form.FormApplicant;
import com.dorjear.ralf.form.FormEvidResult;
import com.dorjear.ralf.form.FormHubDecision;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormDepositAppSubmitResponse extends FormResponseBase {
	private FormApplicant applicant;
	private FormApplicant partner;
	private FormHubDecision hubDecision;
	private FormEvidResult applicantEvidResult;
	private FormEvidResult partnerEvidResult;
	public FormApplicant getApplicant() {
		return applicant;
	}
	public void setApplicant(FormApplicant applicant) {
		this.applicant = applicant;
	}
	public FormApplicant getPartner() {
		return partner;
	}
	public void setPartner(FormApplicant partner) {
		this.partner = partner;
	}
	public FormHubDecision getHubDecision() {
		return hubDecision;
	}
	public void setHubDecision(FormHubDecision hubDecision) {
		this.hubDecision = hubDecision;
	}
	public FormEvidResult getApplicantEvidResult() {
		return applicantEvidResult;
	}
	public void setApplicantEvidResult(FormEvidResult applicantEvidResult) {
		this.applicantEvidResult = applicantEvidResult;
	}
	public FormEvidResult getPartnerEvidResult() {
		return partnerEvidResult;
	}
	public void setPartnerEvidResult(FormEvidResult partnerEvidResult) {
		this.partnerEvidResult = partnerEvidResult;
	}
	
	
}
