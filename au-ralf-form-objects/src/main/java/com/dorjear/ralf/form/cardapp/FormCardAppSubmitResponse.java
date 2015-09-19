package com.dorjear.ralf.form.cardapp;

import com.dorjear.ralf.form.FormApplicant;
import com.dorjear.ralf.form.FormEvidResult;
import com.dorjear.ralf.form.FormMapsDecision;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormCardAppSubmitResponse  extends FormResponseBase {
	
	private FormApplicant applicant;
	private FormApplicant partner;
	private FormMapsDecision mapsDecision;
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
	public FormMapsDecision getMapsDecision() {
		return mapsDecision;
	}
	public void setMapsDecision(FormMapsDecision mapsDecision) {
		this.mapsDecision = mapsDecision;
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
