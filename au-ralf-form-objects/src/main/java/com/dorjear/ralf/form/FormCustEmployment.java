package com.dorjear.ralf.form;


public class FormCustEmployment {

	private String employmentStatus;
	private String employerName;
	private String employerPhone;
	private Boolean employerPhoneIntelFlag;
	private FormAddress employerAddress;
	private String occupation;
	private String industry;
	private String jobTitle;
	private String natureOfBusiness;
	private Integer employmentMonths;
	private Integer employmentYears;
	private String previousEmployer;
	private String previousOccupation;
	private Integer previousEmploymentMonths;
	private Integer previousEmploymentYears;
	
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
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
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public Integer getEmploymentMonths() {
		return employmentMonths;
	}
	public void setEmploymentMonths(Integer employmentMonths) {
		this.employmentMonths = employmentMonths;
	}
	public Integer getEmploymentYears() {
		return employmentYears;
	}
	public void setEmploymentYears(Integer employmentYears) {
		this.employmentYears = employmentYears;
	}
	public String getPreviousEmployer() {
		return previousEmployer;
	}
	public void setPreviousEmployer(String previousEmployer) {
		this.previousEmployer = previousEmployer;
	}
	public String getPreviousOccupation() {
		return previousOccupation;
	}
	public void setPreviousOccupation(String previousOccupation) {
		this.previousOccupation = previousOccupation;
	}
	public Integer getPreviousEmploymentMonths() {
		return previousEmploymentMonths;
	}
	public void setPreviousEmploymentMonths(Integer previousEmploymentMonths) {
		this.previousEmploymentMonths = previousEmploymentMonths;
	}
	public Integer getPreviousEmploymentYears() {
		return previousEmploymentYears;
	}
	public void setPreviousEmploymentYears(Integer previousEmploymentYears) {
		this.previousEmploymentYears = previousEmploymentYears;
	}
	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}
	public Boolean getEmployerPhoneIntelFlag() {
		return employerPhoneIntelFlag;
	}
	public void setEmployerPhoneIntelFlag(Boolean employerPhoneIntelFlag) {
		this.employerPhoneIntelFlag = employerPhoneIntelFlag;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
}
