package com.dorjear.ralf.form.lead;

import com.dorjear.ralf.form.base.FormResponseBase;

public class FormAddLeadResponse extends FormResponseBase {
	private Long	ralfCustomerId;

	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}

	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}

}
