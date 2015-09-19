package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppBaseReq;
import com.dorjear.ralf.form.FormEvidData;

public class FormEvidSubmitRequest extends FormAppBaseReq {
	private FormEvidData evidData;

	public FormEvidData getEvidData() {
		return evidData;
	}

	public void setEvidData(FormEvidData evidData) {
		this.evidData = evidData;
	}

}
