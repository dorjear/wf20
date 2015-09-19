package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppBaseReq;
import com.dorjear.ralf.form.FormCodeValue;

public class FormSendCommunicationRequest extends FormAppBaseReq {
	private String commType;
	private String template;
	private FormCodeValue[] dynamicData;
	
	public String getCommType() {
		return commType;
	}
	public void setCommType(String commType) {
		this.commType = commType;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public FormCodeValue[] getDynamicData() {
		return dynamicData;
	}
	public void setDynamicData(FormCodeValue[] dynamicData) {
		this.dynamicData = dynamicData;
	}
	
	
}
