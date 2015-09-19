package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppAttribute;
import com.dorjear.ralf.form.FormApplicant;
import com.dorjear.ralf.form.FormCardAppNtb;
import com.dorjear.ralf.form.FormCustContactPref;
import com.dorjear.ralf.form.FormDepositAppExist;
import com.dorjear.ralf.form.FormDepositAppNtb;
import com.dorjear.ralf.form.FormEvidResult;
import com.dorjear.ralf.form.FormHubDecision;
import com.dorjear.ralf.form.FormMapsDecision;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormLoadAppResponse extends FormResponseBase {
	private FormDepositAppNtb depositAppNtb;
	private FormDepositAppExist depositAppExist;
	private FormApplicant applicant;
	private FormApplicant partner;
	private FormHubDecision hubDecision;
	private FormMapsDecision mapsDecision;
	private FormEvidResult applicantEvidResult;
	private FormEvidResult partnerEvidResult;
	private FormCardAppNtb cardAppNtb;
	private FormCustContactPref contactPreference;
	private FormAppAttribute applicationAttribute;
	
	public FormDepositAppNtb getDepositAppNtb() {
		return depositAppNtb;
	}
	public void setDepositAppNtb(FormDepositAppNtb depositAppNtb) {
		this.depositAppNtb = depositAppNtb;
	}
	public FormDepositAppExist getDepositAppExist() {
		return depositAppExist;
	}
	public void setDepositAppExist(FormDepositAppExist depositAppExist) {
		this.depositAppExist = depositAppExist;
	}
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
	public FormCardAppNtb getCardAppNtb() {
		return cardAppNtb;
	}
	public void setCardAppNtb(FormCardAppNtb cardAppNtb) {
		this.cardAppNtb = cardAppNtb;
	}
	public FormCustContactPref getContactPreference() {
		return contactPreference;
	}
	public void setContactPreference(FormCustContactPref contactPreference) {
		this.contactPreference = contactPreference;
	}
	public FormAppAttribute getApplicationAttribute() {
		return applicationAttribute;
	}
	public void setApplicationAttribute(FormAppAttribute applicationAttribute) {
		this.applicationAttribute = applicationAttribute;
	}

}
