package com.dorjear.ralf.form;

import com.dorjear.ralf.form.FormDepositStep1;
import com.dorjear.ralf.form.FormDepositStep1Extra;
import com.dorjear.ralf.form.FormDepositStep2;
import com.dorjear.ralf.form.FormDepositStep3;
import com.dorjear.ralf.form.FormDepositStep4;
import com.dorjear.ralf.form.FormDepositStep5;


public class FormDepositAppNtb {
	
	//only required in response message
	private Integer currentStep;
	private String bundle;
	private String appRefNumber;
	private FormDepositStep1 step1;
	private FormDepositStep1 step1Partner;
	private FormDepositStep1Extra step1Extra;
	private FormDepositStep2 step2;
	private FormDepositStep2 step2Partner;
	private FormDepositStep3 step3;
	private FormDepositStep3 step3Partner;
	private FormDepositStep4 step4;
	private FormDepositStep4 step4Partner;
	private FormDepositStep5 step5;
	public Integer getCurrentStep() {
		return currentStep;
	}
	public void setCurrentStep(Integer currentStep) {
		this.currentStep = currentStep;
	}
	public String getBundle() {
		return bundle;
	}
	public void setBundle(String bundle) {
		this.bundle = bundle;
	}
	public String getAppRefNumber() {
		return appRefNumber;
	}
	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}
	public FormDepositStep1 getStep1() {
		return step1;
	}
	public void setStep1(FormDepositStep1 step1) {
		this.step1 = step1;
	}
	public FormDepositStep1 getStep1Partner() {
		return step1Partner;
	}
	public void setStep1Partner(FormDepositStep1 step1Partner) {
		this.step1Partner = step1Partner;
	}
	public FormDepositStep1Extra getStep1Extra() {
		return step1Extra;
	}
	public void setStep1Extra(FormDepositStep1Extra step1Extra) {
		this.step1Extra = step1Extra;
	}
	public FormDepositStep2 getStep2() {
		return step2;
	}
	public void setStep2(FormDepositStep2 step2) {
		this.step2 = step2;
	}
	public FormDepositStep2 getStep2Partner() {
		return step2Partner;
	}
	public void setStep2Partner(FormDepositStep2 step2Partner) {
		this.step2Partner = step2Partner;
	}
	public FormDepositStep3 getStep3() {
		return step3;
	}
	public void setStep3(FormDepositStep3 step3) {
		this.step3 = step3;
	}
	public FormDepositStep3 getStep3Partner() {
		return step3Partner;
	}
	public void setStep3Partner(FormDepositStep3 step3Partner) {
		this.step3Partner = step3Partner;
	}
	public FormDepositStep4 getStep4() {
		return step4;
	}
	public void setStep4(FormDepositStep4 step4) {
		this.step4 = step4;
	}
	public FormDepositStep4 getStep4Partner() {
		return step4Partner;
	}
	public void setStep4Partner(FormDepositStep4 step4Partner) {
		this.step4Partner = step4Partner;
	}
	public FormDepositStep5 getStep5() {
		return step5;
	}
	public void setStep5(FormDepositStep5 step5) {
		this.step5 = step5;
	}
}
