package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormAddress;
import com.dorjear.ralf.form.FormCityCountry;
import com.dorjear.ralf.form.FormCustBaseReq;

public class FormAddInitAssessmentRequest extends FormCustBaseReq{
	private String birthDate;
	private FormAddress residentialAddress;
	private FormAddress previousAddress;
	private FormAddress postalAddress;
	private Boolean postAddrSameAsResiAddr;
	private FormCityCountry[] last3YearOtherCountryCities;
	
	private String photoId;
	private String licenceState;
	private String licenceExpiryDate;
	private String licenceNumber;
	private String licenceCardNumber;
	private String ozPassportCountry;
	private String ozPassportCountryBirth;
	private String ozPassportPlaceBirth;
	private String ozPassportNumber;
	private String ozPassportNameBirth;
	private String ozPassportCitizenFirstName;
	private String ozPassportCitizenLastName;
	private String intPassportCountry;
	private String intPassportNumber;
	
	private Integer depositAmountMonthly;
	private Integer withdrawAmountMonthly;
	private Integer numberOfOverseaPayMonthly;
	private String sourceOfWealthCountry;
	private Boolean safeDepositCustody;
	
	private String nationality;
	private String hasMultipleNat;
	private String nationality2;
	private String nationality3;
	
	private Boolean hasOtherTaxCountries;
	private String[] otherTaxCountries;
	
	private String employmentStatus;
	private String employmentRole;
	private String occupation;
	private String industry;
	
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public FormAddress getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(FormAddress residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public FormAddress getPreviousAddress() {
		return previousAddress;
	}
	public void setPreviousAddress(FormAddress previousAddress) {
		this.previousAddress = previousAddress;
	}
	public FormAddress getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(FormAddress postalAddress) {
		this.postalAddress = postalAddress;
	}
	public Boolean getPostAddrSameAsResiAddr() {
		return postAddrSameAsResiAddr;
	}
	public void setPostAddrSameAsResiAddr(Boolean postAddrSameAsResiAddr) {
		this.postAddrSameAsResiAddr = postAddrSameAsResiAddr;
	}
	public FormCityCountry[] getLast3YearOtherCountryCities() {
		return last3YearOtherCountryCities;
	}
	public void setLast3YearOtherCountryCities(
			FormCityCountry[] last3YearOtherCountryCities) {
		this.last3YearOtherCountryCities = last3YearOtherCountryCities;
	}
	public String getPhotoId() {
		return photoId;
	}
	public void setPhotoId(String photoId) {
		this.photoId = photoId;
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
	public String getOzPassportCountry() {
		return ozPassportCountry;
	}
	public void setOzPassportCountry(String ozPassportCountry) {
		this.ozPassportCountry = ozPassportCountry;
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
	public String getOzPassportCitizenFirstName() {
		return ozPassportCitizenFirstName;
	}
	public void setOzPassportCitizenFirstName(String ozPassportCitizenFirstName) {
		this.ozPassportCitizenFirstName = ozPassportCitizenFirstName;
	}
	public String getOzPassportCitizenLastName() {
		return ozPassportCitizenLastName;
	}
	public void setOzPassportCitizenLastName(String ozPassportCitizenLastName) {
		this.ozPassportCitizenLastName = ozPassportCitizenLastName;
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
	public Integer getDepositAmountMonthly() {
		return depositAmountMonthly;
	}
	public void setDepositAmountMonthly(Integer depositAmountMonthly) {
		this.depositAmountMonthly = depositAmountMonthly;
	}
	public Integer getWithdrawAmountMonthly() {
		return withdrawAmountMonthly;
	}
	public void setWithdrawAmountMonthly(Integer withdrawAmountMonthly) {
		this.withdrawAmountMonthly = withdrawAmountMonthly;
	}
	public Integer getNumberOfOverseaPayMonthly() {
		return numberOfOverseaPayMonthly;
	}
	public void setNumberOfOverseaPayMonthly(Integer numberOfOverseaPayMonthly) {
		this.numberOfOverseaPayMonthly = numberOfOverseaPayMonthly;
	}
	public String getSourceOfWealthCountry() {
		return sourceOfWealthCountry;
	}
	public void setSourceOfWealthCountry(String sourceOfWealthCountry) {
		this.sourceOfWealthCountry = sourceOfWealthCountry;
	}
	public Boolean getSafeDepositCustody() {
		return safeDepositCustody;
	}
	public void setSafeDepositCustody(Boolean safeDepositCustody) {
		this.safeDepositCustody = safeDepositCustody;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getHasMultipleNat() {
		return hasMultipleNat;
	}
	public void setHasMultipleNat(String hasMultipleNat) {
		this.hasMultipleNat = hasMultipleNat;
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
	
	public Boolean getHasOtherTaxCountries() {
		return hasOtherTaxCountries;
	}
	public void setHasOtherTaxCountries(Boolean hasOtherTaxCountries) {
		this.hasOtherTaxCountries = hasOtherTaxCountries;
	}
	public String[] getOtherTaxCountries() {
		return otherTaxCountries;
	}
	public void setOtherTaxCountries(String[] otherTaxCountries) {
		this.otherTaxCountries = otherTaxCountries;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public String getEmploymentRole() {
		return employmentRole;
	}
	public void setEmploymentRole(String employmentRole) {
		this.employmentRole = employmentRole;
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
	
}
