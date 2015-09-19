package com.dorjear.ralf.form.user;

import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormUserRespBase extends FormResponseBase {
	private FormUser user;

	public FormUser getUser() {
		return user;
	}

	public void setUser(FormUser user) {
		this.user = user;
	}	

}
