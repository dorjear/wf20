package com.dorjear.ralf.form.lead;

import com.dorjear.ralf.form.FormApplication;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAddLeadRequest extends FormRequestBase {
	private FormApplication lead;

	public FormApplication getLead() {
		return lead;
	}

	public void setLead(FormApplication lead) {
		this.lead = lead;
	}

}
