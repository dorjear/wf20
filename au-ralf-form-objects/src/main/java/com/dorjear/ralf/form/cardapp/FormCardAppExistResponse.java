package com.dorjear.ralf.form.cardapp;

import com.dorjear.ralf.form.FormCardAppExist;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormCardAppExistResponse  extends FormResponseBase {
	
	private FormCardAppExist cardAppExist;

	public FormCardAppExist getCardAppExist() {
		return cardAppExist;
	}

	public void setCardAppExist(FormCardAppExist cardAppExist) {
		this.cardAppExist = cardAppExist;
	}
}
