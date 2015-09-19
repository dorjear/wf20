package com.dorjear.ralf.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class FormCodeValue {
	@Size(min=1, max=100)
	@NotBlank
	private String code;
	
	@Size(min=1, max=4000)
	@NotBlank
	private String value;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
