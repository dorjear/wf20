package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class FormCustBasicInfo {

	private Long ralfCustomerId;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobilePhone;
	private Boolean mobilePhoneIntelFlag;
	private String homePhone;
	private Boolean homePhoneIntelFlag;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,6})+$")
	@Size(max = 100)
	@Email
	private String email;
	
	private String age;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateOfBirth;
	private String gender;
	private String maidenName;
	private FormAddress currentAddress;
	private FormAddress mailingAddress;
	
	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}
	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public FormAddress getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(FormAddress currentAddress) {
		this.currentAddress = currentAddress;
	}
	public FormAddress getMailingAddress() {
		return mailingAddress;
	}
	public void setMailingAddress(FormAddress mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

}
