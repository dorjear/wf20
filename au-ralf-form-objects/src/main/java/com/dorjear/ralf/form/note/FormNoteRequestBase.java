package com.dorjear.ralf.form.note;

import com.dorjear.ralf.form.FormNote;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormNoteRequestBase extends FormRequestBase {
	private FormNote note;

	public FormNote getNote() {
		return note;
	}

	public void setNote(FormNote note) {
		this.note = note;
	}
}
