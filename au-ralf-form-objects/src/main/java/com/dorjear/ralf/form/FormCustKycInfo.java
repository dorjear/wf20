package com.dorjear.ralf.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class FormCustKycInfo {

	private String mobilePhone;
	private Boolean mobilePhoneIntelFlag;
	private String homePhone;
	private Boolean homePhoneIntelFlag;
	
	@Size(min = 1, max = 100)
	@NotBlank
	@Email
	private String email;
	private FormAddress residentialAddress;
	private FormAddress postalAddress;
	private String countryOfBirth;
	private String nationality;
	private String multipleNationality;
	private String nationality2;
	private String nationality3;
	private String employerName;
	private FormAddress employerAddress;
	private String natureOfBusiness;
	private String jobTitle;
	private String occupation;

	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public Boolean getMobilePhoneIntelFlag() {
		return mobilePhoneIntelFlag;
	}
	public void setMobilePhoneIntelFlag(Boolean mobilePhoneIntelFlag) {
		this.mobilePhoneIntelFlag = mobilePhoneIntelFlag;
	}
	public Boolean getHomePhoneIntelFlag() {
		return homePhoneIntelFlag;
	}
	public void setHomePhoneIntelFlag(Boolean homePhoneIntelFlag) {
		this.homePhoneIntelFlag = homePhoneIntelFlag;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public FormAddress getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(FormAddress residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public FormAddress getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(FormAddress postalAddress) {
		this.postalAddress = postalAddress;
	}
	
	public String getCountryOfBirth() {
		return countryOfBirth;
	}
	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMultipleNationality() {
		return multipleNationality;
	}
	public void setMultipleNationality(String multipleNationality) {
		this.multipleNationality = multipleNationality;
	}
	public String getNationality2() {
		return nationality2;
	}
	public void setNationality2(String nationality2) {
		this.nationality2 = nationality2;
	}
	public String getNationality3() {
		return nationality3;
	}
	public void setNationality3(String nationality3) {
		this.nationality3 = nationality3;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public FormAddress getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(FormAddress employerAddress) {
		this.employerAddress = employerAddress;
	}
	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
}
