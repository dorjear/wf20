package com.dorjear.ralf.form.note;

import java.util.List;

import com.dorjear.ralf.form.FormNote;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormLoadNotesResponse extends FormResponseBase {
	private List<FormNote> notes;

	public List<FormNote> getNotes() {
		return notes;
	}

	public void setNotes(List<FormNote> notes) {
		this.notes = notes;
	}
}
