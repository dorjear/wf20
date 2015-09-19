package com.dorjear.ralf.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;


public class FormCityCountry {
	
	@NotBlank
	@Size(min = 1, max = 50)
	private String city;
	
	@NotBlank
	@Size(min = 3, max = 3)
	private String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
