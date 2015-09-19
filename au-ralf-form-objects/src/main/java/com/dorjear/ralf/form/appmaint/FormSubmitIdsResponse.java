package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormEvidResult;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormSubmitIdsResponse extends FormResponseBase {
	private FormEvidResult evidResult;

	public FormEvidResult getEvidResult() {
		return evidResult;
	}

	public void setEvidResult(FormEvidResult evidResult) {
		this.evidResult = evidResult;
	}
	
	
}
