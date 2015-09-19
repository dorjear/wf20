package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FormEvidData {
	
	@Pattern(regexp = "^$|M|P")
	private String applicantType;
	
	private String licenceState;
	private String licenceExpiryDate;
	private String licenceNumber;
	private String licenceCardNumber;
	private String medicareNumber;
	private String medicareRefNumber;
	
	@Size(min = 0)
	@Pattern(regexp = "^$|G|B|Y")
	private String medicareColor;
	
	@Size(max = 23)
	private String medicareMiddleName;
	@Size(max = 9)
	
	private String medicareExpiryDate;
	private String ozPassportCountryBirth;
	private String ozPassportPlaceBirth;
	private String ozPassportNumber;
	private String ozPassportNameBirth;
	private String intPassportCountry;
	private String intPassportNumber;
	
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	public String getLicenceState() {
		return licenceState;
	}
	public void setLicenceState(String licenceState) {
		this.licenceState = licenceState;
	}
	public String getLicenceExpiryDate() {
		return licenceExpiryDate;
	}
	public void setLicenceExpiryDate(String licenceExpiryDate) {
		this.licenceExpiryDate = licenceExpiryDate;
	}
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getLicenceCardNumber() {
		return licenceCardNumber;
	}
	public void setLicenceCardNumber(String licenceCardNumber) {
		this.licenceCardNumber = licenceCardNumber;
	}
	public String getMedicareNumber() {
		return medicareNumber;
	}
	public void setMedicareNumber(String medicareNumber) {
		this.medicareNumber = medicareNumber;
	}
	public String getMedicareRefNumber() {
		return medicareRefNumber;
	}
	public void setMedicareRefNumber(String medicareRefNumber) {
		this.medicareRefNumber = medicareRefNumber;
	}
	public String getMedicareColor() {
		return medicareColor;
	}
	public void setMedicareColor(String medicareColor) {
		this.medicareColor = medicareColor;
	}
	public String getMedicareMiddleName() {
		return medicareMiddleName;
	}
	public void setMedicareMiddleName(String medicareMiddleName) {
		this.medicareMiddleName = medicareMiddleName;
	}
	public String getMedicareExpiryDate() {
		return medicareExpiryDate;
	}
	public void setMedicareExpiryDate(String medicareExpiryDate) {
		this.medicareExpiryDate = medicareExpiryDate;
	}
	public String getOzPassportCountryBirth() {
		return ozPassportCountryBirth;
	}
	public void setOzPassportCountryBirth(String ozPassportCountryBirth) {
		this.ozPassportCountryBirth = ozPassportCountryBirth;
	}
	public String getOzPassportPlaceBirth() {
		return ozPassportPlaceBirth;
	}
	public void setOzPassportPlaceBirth(String ozPassportPlaceBirth) {
		this.ozPassportPlaceBirth = ozPassportPlaceBirth;
	}
	public String getOzPassportNumber() {
		return ozPassportNumber;
	}
	public void setOzPassportNumber(String ozPassportNumber) {
		this.ozPassportNumber = ozPassportNumber;
	}
	public String getOzPassportNameBirth() {
		return ozPassportNameBirth;
	}
	public void setOzPassportNameBirth(String ozPassportNameBirth) {
		this.ozPassportNameBirth = ozPassportNameBirth;
	}
	public String getIntPassportCountry() {
		return intPassportCountry;
	}
	public void setIntPassportCountry(String intPassportCountry) {
		this.intPassportCountry = intPassportCountry;
	}
	public String getIntPassportNumber() {
		return intPassportNumber;
	}
	public void setIntPassportNumber(String intPassportNumber) {
		this.intPassportNumber = intPassportNumber;
	}

}
