package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustBaseReq;

public class FormCustAssetDeleteRequest extends FormCustBaseReq {
	private String category;
	private String code;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
