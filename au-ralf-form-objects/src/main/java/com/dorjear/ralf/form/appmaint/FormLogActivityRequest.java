package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormNote;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormLogActivityRequest extends FormRequestBase {
	private FormNote note;

	public FormNote getNote() {
		return note;
	}

	public void setNote(FormNote note) {
		this.note = note;
	}
}
