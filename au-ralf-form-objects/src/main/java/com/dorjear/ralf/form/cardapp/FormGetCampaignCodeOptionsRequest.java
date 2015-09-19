package com.dorjear.ralf.form.cardapp;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormGetCampaignCodeOptionsRequest extends FormRequestBase{
	private String productCode;
	private String productGroup;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	
}
