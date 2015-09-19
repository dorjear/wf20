package com.dorjear.ralf.form;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormCustBaseReq extends FormRequestBase {
	private Long ralfCustomerId = null;

	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}

	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	
}
