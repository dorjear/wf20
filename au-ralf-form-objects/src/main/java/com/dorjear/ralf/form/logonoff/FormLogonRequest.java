package com.dorjear.ralf.form.logonoff;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormLogonRequest extends FormRequestBase {
	@NotBlank
	@Size(min = 5, max = 20)
	private String userId;
	@Size(min = 5)
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
