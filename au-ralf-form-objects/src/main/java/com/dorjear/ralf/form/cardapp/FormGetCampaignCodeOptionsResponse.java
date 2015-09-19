package com.dorjear.ralf.form.cardapp;

import com.dorjear.ralf.form.FormLookUpData;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormGetCampaignCodeOptionsResponse extends FormResponseBase {
	private FormLookUpData[] options;

	public FormLookUpData[] getOptions() {
		return options;
	}

	public void setOptions(FormLookUpData[] options) {
		this.options = options;
	}
}
