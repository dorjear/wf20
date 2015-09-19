package com.dorjear.ralf.form.cardapp;

import com.dorjear.ralf.form.FormCardAppExist;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormCardAppExistRequest  extends FormRequestBase {
	
	private FormCardAppExist cardAppExist;

	public FormCardAppExist getCardAppExist() {
		return cardAppExist;
	}

	public void setCardAppExist(FormCardAppExist cardAppExist) {
		this.cardAppExist = cardAppExist;
	}
}
