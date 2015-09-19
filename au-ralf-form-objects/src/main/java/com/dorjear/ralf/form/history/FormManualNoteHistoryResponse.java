package com.dorjear.ralf.form.history;

import java.util.ArrayList;
import java.util.List;

import com.dorjear.ralf.form.FormNote;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormManualNoteHistoryResponse extends FormResponseBase {
	
	private List<FormNote> notes = new ArrayList<FormNote>();

	public List<FormNote> getNotes() {
		return notes;
	}

	public void setNotes(List<FormNote> notes) {
		this.notes = notes;
	}

	
}
