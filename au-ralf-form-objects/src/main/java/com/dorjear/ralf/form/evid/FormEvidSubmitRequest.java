package com.dorjear.ralf.form.evid;

import com.dorjear.ralf.form.FormEvidData;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormEvidSubmitRequest extends FormRequestBase {

	private FormEvidData evidData;

	public FormEvidData getEvidData() {
		return evidData;
	}

	public void setEvidData(FormEvidData evidData) {
		this.evidData = evidData;
	}

}
