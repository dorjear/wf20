package com.dorjear.ralf.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class FormAddress {
	
	@Size(max = 20)
	private String unit;
	
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	
	@NotBlank
	private String state;
	
	@Size(max = 3)
	private String countryCode;
	
	private String zip;
	private String propertyName;
	private String addressLine1;
	private String addressLine2;
	
	@Size(max = 2)
	private String tenureMonths;
	
	@Size(max = 2)
	private String tenureYears;
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetType() {
		return streetType;
	}
	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getTenureMonths() {
		return tenureMonths;
	}
	public void setTenureMonths(String tenureMonths) {
		this.tenureMonths = tenureMonths;
	}
	public String getTenureYears() {
		return tenureYears;
	}
	public void setTenureYears(String tenureYears) {
		this.tenureYears = tenureYears;
	}
}
