package com.dorjear.ralf.form;


public class FormDepositStep2 {
	
	private FormAddress residentialAddress;
	private FormAddress previousAddress;
	private FormAddress postalAddress;
	private FormAddress permanentAddress;
	
	private Boolean postAddrSameAsResiAddr;
	private Boolean permAddrSameAsResiAddr;
	private Boolean prevAddrSameAsMainApplicant;
	private Boolean resiAddrSameAsMainApplicant;
	private Boolean postAddrSameAsMainApplicant;
	private Boolean permAddrSameAsMainApplicant;
	
	private String[] last3YearOtherCountries;
	
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
	public FormAddress getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(FormAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Boolean getPostAddrSameAsResiAddr() {
		return postAddrSameAsResiAddr;
	}
	public void setPostAddrSameAsResiAddr(Boolean postAddrSameAsResiAddr) {
		this.postAddrSameAsResiAddr = postAddrSameAsResiAddr;
	}
	public Boolean getPermAddrSameAsResiAddr() {
		return permAddrSameAsResiAddr;
	}
	public void setPermAddrSameAsResiAddr(Boolean permAddrSameAsResiAddr) {
		this.permAddrSameAsResiAddr = permAddrSameAsResiAddr;
	}
	public Boolean getResiAddrSameAsMainApplicant() {
		return resiAddrSameAsMainApplicant;
	}
	public void setResiAddrSameAsMainApplicant(Boolean resiAddrSameAsMainApplicant) {
		this.resiAddrSameAsMainApplicant = resiAddrSameAsMainApplicant;
	}
	public Boolean getPostAddrSameAsMainApplicant() {
		return postAddrSameAsMainApplicant;
	}
	public void setPostAddrSameAsMainApplicant(Boolean postAddrSameAsMainApplicant) {
		this.postAddrSameAsMainApplicant = postAddrSameAsMainApplicant;
	}
	public Boolean getPermAddrSameAsMainApplicant() {
		return permAddrSameAsMainApplicant;
	}
	public void setPermAddrSameAsMainApplicant(Boolean permAddrSameAsMainApplicant) {
		this.permAddrSameAsMainApplicant = permAddrSameAsMainApplicant;
	}
	public FormAddress getPreviousAddress() {
		return previousAddress;
	}
	public void setPreviousAddress(FormAddress previousAddress) {
		this.previousAddress = previousAddress;
	}
	public String[] getLast3YearOtherCountries() {
		return last3YearOtherCountries;
	}
	public void setLast3YearOtherCountries(String[] last3YearOtherCountries) {
		this.last3YearOtherCountries = last3YearOtherCountries;
	}
	public Boolean getPrevAddrSameAsMainApplicant() {
		return prevAddrSameAsMainApplicant;
	}
	public void setPrevAddrSameAsMainApplicant(Boolean prevAddrSameAsMainApplicant) {
		this.prevAddrSameAsMainApplicant = prevAddrSameAsMainApplicant;
	}
	
}
