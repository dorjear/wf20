package com.dorjear.ralf.form;

public class FormCardAppNtb {
	
	private String appRefNumber;
	private Integer currentStep;
	private FormCardStep1 step1;
	private FormCardStep2 step2;
	private FormCardStep3 step3;
	private FormCardStep4 step4;
	private FormCardStep5 step5;
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
	public FormCardStep1 getStep1() {
		return step1;
	}
	public void setStep1(FormCardStep1 step1) {
		this.step1 = step1;
	}
	public FormCardStep2 getStep2() {
		return step2;
	}
	public void setStep2(FormCardStep2 step2) {
		this.step2 = step2;
	}
	public FormCardStep3 getStep3() {
		return step3;
	}
	public void setStep3(FormCardStep3 step3) {
		this.step3 = step3;
	}
	public FormCardStep4 getStep4() {
		return step4;
	}
	public void setStep4(FormCardStep4 step4) {
		this.step4 = step4;
	}
	public FormCardStep5 getStep5() {
		return step5;
	}
	public void setStep5(FormCardStep5 step5) {
		this.step5 = step5;
	}
	public FormCardPartner getPartner() {
		return partner;
	}
	public void setPartner(FormCardPartner partner) {
		this.partner = partner;
	}
}
