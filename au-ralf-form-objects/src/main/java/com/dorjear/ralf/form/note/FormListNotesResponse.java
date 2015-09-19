package com.dorjear.ralf.form.note;

import com.dorjear.ralf.form.FormNote;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormListNotesResponse extends FormResponseBase {
	private FormNote[] note = {};

	public FormNote[] getNote() {
		return note;
	}

	public void setNote(FormNote[] note) {
		this.note = note;
	}
	
}
