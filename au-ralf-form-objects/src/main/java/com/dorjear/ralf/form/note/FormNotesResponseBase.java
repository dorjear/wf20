package com.dorjear.ralf.form.note;

import com.dorjear.ralf.form.FormNote;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormNotesResponseBase extends FormResponseBase {
	
	private FormNote[] notes = {};

	public FormNote[] getNotes() {
		return notes;
	}

	public void setNotes(FormNote[] notes) {
		this.notes = notes;
	}

}
