package com.dorjear.ralf.form.history;

import com.dorjear.ralf.form.FormStaffOperation;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormStaffActionHistoryResponse extends FormResponseBase {
	private FormStaffOperation[] actions = {};

	public FormStaffOperation[] getActions() {
		return actions;
	}

	public void setActions(FormStaffOperation[] actions) {
		this.actions = actions;
	}

	

}
