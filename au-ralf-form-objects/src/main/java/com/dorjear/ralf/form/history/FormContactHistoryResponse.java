package com.dorjear.ralf.form.history;

import com.dorjear.ralf.form.FormContact;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormContactHistoryResponse extends FormResponseBase {
	private FormContact[] contacts={};

	public FormContact[] getContacts() {
		return contacts;
	}

	public void setContacts(FormContact[] contacts) {
		this.contacts = contacts;
	}

	
}
