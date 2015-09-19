package com.dorjear.ralf.form;

public class FormCardAppExist {
	
	private String appRefNumber;
	private Integer currentStep;
	private FormCardExistStep1 step1;
	private FormCardExistStep2 step2;
	private FormCardExistStep3 step3;
	private FormCardPartner partner;
	

	public String getAppRefNumber() {
		return appRefNumber;
	}
	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}
	public Integer getCurrentStep() {
		return currentStep;
	}
	public void setCurrentStep(Integer currentStep) {
		this.currentStep = currentStep;
	}
	public FormCardExistStep1 getStep1() {
		return step1;
	}
	public void setStep1(FormCardExistStep1 step1) {
		this.step1 = step1;
	}
	public FormCardExistStep2 getStep2() {
		return step2;
	}
	public void setStep2(FormCardExistStep2 step2) {
		this.step2 = step2;
	}
	public FormCardExistStep3 getStep3() {
		return step3;
	}
	public void setStep3(FormCardExistStep3 step3) {
		this.step3 = step3;
	}
	public FormCardPartner getPartner() {
		return partner;
	}
	public void setPartner(FormCardPartner partner) {
		this.partner = partner;
	}
	
}
