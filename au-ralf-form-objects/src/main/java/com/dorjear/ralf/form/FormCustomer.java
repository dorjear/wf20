package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class FormCustomer {
	
	private Long ralfCustomerId;
	
	private String hubProsCustomerId;
	
	@NotBlank
	@Size(max = 60)
	private String firstName;
	
	@NotBlank
	@Size(max = 60)
	private String middleName;
	
	@NotBlank
	@Size(max = 60)
	private String lastName;
	
	private String title;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String dateOfBirth;
	
	@Size(max = 20)
	private String preferredContact;
	
	@Size(max = 20)
	private String homePhone;
	
	@Size(max = 20)
	private String mobilePhone;
	
	private Boolean homePhoneIntelFlag;
	private Boolean mobilePhoneIntelFlag;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,6})+$")
	@Size(max = 100)
	@Email
	private String email;
	
	private String hubCustomerId;
	private String pbn;
	private Integer monthlyIncome;
	private Integer annualIncome;
	private Integer householdAnnualIncome;
	
	private String motherMaidenName;
	private FormAddress currentAddress;
	private FormAddress mailingAddress;
	
	
	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}
	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	public String getHubProsCustomerId() {
		return hubProsCustomerId;
	}
	public void setHubProsCustomerId(String hubProsCustomerId) {
		this.hubProsCustomerId = hubProsCustomerId;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPreferredContact() {
		return preferredContact;
	}
	public void setPreferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public Boolean getHomePhoneIntelFlag() {
		return homePhoneIntelFlag;
	}
	public void setHomePhoneIntelFlag(Boolean homePhoneIntelFlag) {
		this.homePhoneIntelFlag = homePhoneIntelFlag;
	}
	public Boolean getMobilePhoneIntelFlag() {
		return mobilePhoneIntelFlag;
	}
	public void setMobilePhoneIntelFlag(Boolean mobilePhoneIntelFlag) {
		this.mobilePhoneIntelFlag = mobilePhoneIntelFlag;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHubCustomerId() {
		return hubCustomerId;
	}
	public void setHubCustomerId(String hubCustomerId) {
		this.hubCustomerId = hubCustomerId;
	}
	public String getPbn() {
		return pbn;
	}
	public void setPbn(String pbn) {
		this.pbn = pbn;
	}
	public Integer getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(Integer monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public Integer getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Integer annualIncome) {
		this.annualIncome = annualIncome;
	}
	public Integer getHouseholdAnnualIncome() {
		return householdAnnualIncome;
	}
	public void setHouseholdAnnualIncome(Integer householdAnnualIncome) {
		this.householdAnnualIncome = householdAnnualIncome;
	}
	public String getMotherMaidenName() {
		return motherMaidenName;
	}
	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
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
