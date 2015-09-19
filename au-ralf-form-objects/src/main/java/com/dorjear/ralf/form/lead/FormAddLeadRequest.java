package com.dorjear.ralf.form.lead;

import com.dorjear.ralf.form.FormLead;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAddLeadRequest extends FormRequestBase {
	private FormLead lead;

	public FormLead getLead() {
		return lead;
	}

	public void setLead(FormLead lead) {
		this.lead = lead;
	}

}
