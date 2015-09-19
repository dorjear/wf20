package com.dorjear.ralf.form.depositapp;

import com.dorjear.ralf.form.FormHubDecision;
import com.dorjear.ralf.form.base.FormResponseBase;


public class FormDepositAppExistResponse extends FormResponseBase {
	
	private FormHubDecision hubDecision;

	public FormHubDecision getHubDecision() {
		return hubDecision;
	}

	public void setHubDecision(FormHubDecision hubDecision) {
		this.hubDecision = hubDecision;
	}
	
}
