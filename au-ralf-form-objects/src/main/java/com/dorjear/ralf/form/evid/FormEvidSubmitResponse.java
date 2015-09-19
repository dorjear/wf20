package com.dorjear.ralf.form.evid;

import com.dorjear.ralf.form.FormEvidResult;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormEvidSubmitResponse extends FormResponseBase {

	private FormEvidResult evidResult;

	public FormEvidResult getEvidResult() {
		return evidResult;
	}

	public void setEvidResult(FormEvidResult evidResult) {
		this.evidResult = evidResult;
	}

}
