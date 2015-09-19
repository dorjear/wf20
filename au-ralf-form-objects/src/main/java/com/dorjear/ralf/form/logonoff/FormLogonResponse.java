package com.dorjear.ralf.form.logonoff;

import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormLogonResponse extends FormResponseBase {
	private FormUser user;
	private Integer availableAttempts;

	public FormUser getUser() {
		return user;
	}

	public void setUser(FormUser user) {
		this.user = user;
	}

	public Integer getAvailableAttempts() {
		return availableAttempts;
	}

	public void setAvailableAttempts(Integer availableAttempts) {
		this.availableAttempts = availableAttempts;
	}
	
	

}
