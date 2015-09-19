package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;

public class FormEvidResult {
	
	@Pattern(regexp = "^$|M|P")
	private String applicantType;
	private String evidResult;	
	// overall evid result EVID_PASSED="E";EVID_MANUAL_PASSED="Y";EVID_FAILED="N";
	
	private Boolean licenceNeeded;
	private Boolean passportNeeded;
	private Boolean medicareNeeded;
	private Boolean licenceProvided;
	private Boolean passportProvided;
	
	private Boolean pep;
	private Boolean sactions;
	private Boolean sharedFraud;
	private Boolean velocity;
	
	private String lastUpdateDate;
	private String lastUpdateTime;

	private Integer numberOfNameMatch;
	private Integer numberOfAddressMatch;
	private Integer numberOfDobMatch;
	private Integer numberOfIdMatch;
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	public String getEvidResult() {
		return evidResult;
	}
	public void setEvidResult(String evidResult) {
		this.evidResult = evidResult;
	}
	public Boolean getLicenceNeeded() {
		return licenceNeeded;
	}
	public void setLicenceNeeded(Boolean licenceNeeded) {
		this.licenceNeeded = licenceNeeded;
	}
	public Boolean getPassportNeeded() {
		return passportNeeded;
	}
	public void setPassportNeeded(Boolean passportNeeded) {
		this.passportNeeded = passportNeeded;
	}
	public Boolean getMedicareNeeded() {
		return medicareNeeded;
	}
	public void setMedicareNeeded(Boolean medicareNeeded) {
		this.medicareNeeded = medicareNeeded;
	}
	public Boolean getLicenceProvided() {
		return licenceProvided;
	}
	public void setLicenceProvided(Boolean licenceProvided) {
		this.licenceProvided = licenceProvided;
	}
	public Boolean getPassportProvided() {
		return passportProvided;
	}
	public void setPassportProvided(Boolean passportProvided) {
		this.passportProvided = passportProvided;
	}
	public Boolean getPep() {
		return pep;
	}
	public void setPep(Boolean pep) {
		this.pep = pep;
	}
	public Boolean getSactions() {
		return sactions;
	}
	public void setSactions(Boolean sactions) {
		this.sactions = sactions;
	}
	public Boolean getSharedFraud() {
		return sharedFraud;
	}
	public void setSharedFraud(Boolean sharedFraud) {
		this.sharedFraud = sharedFraud;
	}
	public Boolean getVelocity() {
		return velocity;
	}
	public void setVelocity(Boolean velocity) {
		this.velocity = velocity;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Integer getNumberOfNameMatch() {
		return numberOfNameMatch;
	}
	public void setNumberOfNameMatch(Integer numberOfNameMatch) {
		this.numberOfNameMatch = numberOfNameMatch;
	}
	public Integer getNumberOfAddressMatch() {
		return numberOfAddressMatch;
	}
	public void setNumberOfAddressMatch(Integer numberOfAddressMatch) {
		this.numberOfAddressMatch = numberOfAddressMatch;
	}
	public Integer getNumberOfDobMatch() {
		return numberOfDobMatch;
	}
	public void setNumberOfDobMatch(Integer numberOfDobMatch) {
		this.numberOfDobMatch = numberOfDobMatch;
	}
	public Integer getNumberOfIdMatch() {
		return numberOfIdMatch;
	}
	public void setNumberOfIdMatch(Integer numberOfIdMatch) {
		this.numberOfIdMatch = numberOfIdMatch;
	}
	
}
