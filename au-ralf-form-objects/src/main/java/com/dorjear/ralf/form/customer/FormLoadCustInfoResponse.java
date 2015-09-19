package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCodeValue;
import com.dorjear.ralf.form.FormCustBasicInfo;
import com.dorjear.ralf.form.FormCustEmployment;
import com.dorjear.ralf.form.FormCustHubInfo;
import com.dorjear.ralf.form.FormCustIncome;
import com.dorjear.ralf.form.FormCustNationalities;
import com.dorjear.ralf.form.FormJointCustomer;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormLoadCustInfoResponse extends FormResponseBase {
	private FormCustBasicInfo basicInfo;
	private FormCustHubInfo hubInfo;
	private FormCustEmployment employment;
	private FormCustIncome incomeInfo;
	private FormCustNationalities nationalities;
	private FormCodeValue[] socialProfiles = new FormCodeValue[0];
	private FormJointCustomer[] jointCustomers = new FormJointCustomer[0];
	
	public FormCustBasicInfo getBasicInfo() {
		return basicInfo;
	}
	public void setBasicInfo(FormCustBasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	public FormCustHubInfo getHubInfo() {
		return hubInfo;
	}
	public void setHubInfo(FormCustHubInfo hubInfo) {
		this.hubInfo = hubInfo;
	}
	public FormCustEmployment getEmployment() {
		return employment;
	}
	public void setEmployment(FormCustEmployment employment) {
		this.employment = employment;
	}
	public FormCustIncome getIncomeInfo() {
		return incomeInfo;
	}
	public void setIncomeInfo(FormCustIncome incomeInfo) {
		this.incomeInfo = incomeInfo;
	}
	public FormCustNationalities getNationalities() {
		return nationalities;
	}
	public void setNationalities(FormCustNationalities nationalities) {
		this.nationalities = nationalities;
	}
	public FormCodeValue[] getSocialProfiles() {
		return socialProfiles;
	}
	public void setSocialProfiles(FormCodeValue[] socialProfiles) {
		this.socialProfiles = socialProfiles;
	}
	public FormJointCustomer[] getJointCustomers() {
		return jointCustomers;
	}
	public void setJointCustomers(FormJointCustomer[] jointCustomers) {
		this.jointCustomers = jointCustomers;
	}

	
}
