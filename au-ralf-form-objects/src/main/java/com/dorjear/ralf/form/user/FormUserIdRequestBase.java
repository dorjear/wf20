package com.dorjear.ralf.form.user;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormUserIdRequestBase extends FormRequestBase {
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
