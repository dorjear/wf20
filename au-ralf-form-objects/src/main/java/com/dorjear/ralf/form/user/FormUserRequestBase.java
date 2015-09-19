package com.dorjear.ralf.form.user;

import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormUserRequestBase extends FormRequestBase {
	private FormUser user;

	public FormUser getUser() {
		return user;
	}

	public void setUser(FormUser user) {
		this.user = user;
	}
	
}
