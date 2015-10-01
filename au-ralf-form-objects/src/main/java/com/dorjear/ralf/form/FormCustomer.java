package com.dorjear.ralf.form;

import java.util.List;


public class FormCustomer {
	private String customerId;
	private String hubCustomerId;
	private String customerGroup;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String birthDate;
	private String maidenName;

	private String email;
	private String homePhone;
	private String mobilePhone;
	private Boolean homePhoneIntelFlag;
	private Boolean mobilePhoneIntelFlag;

	//deposit step2
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
	private List<FormCityCountry> last3YearOtherCountries;

	//deposit step3
	private Boolean isResident;
	private String nationality;
	private Boolean hasMultipleNat;
	private String nationality2;
	private String nationality3;
	private Boolean hasOtherTaxCountries;
	private String countryTax;
	private List<String> otherTaxCountries;
	private String tfn;
	private String tfnExemption;
	private Boolean usPersonForTax;
	private String countryOfBirth;
	private String previousFirstName; 
	private String otherFirstName;

	//deposit step4
	private String employmentStatus;
	private String employmentRole;
	private String employerName;
	private String employerPhoneNum;
	private Boolean employerPhoneIntelFlag;
	private FormAddress employerAddress;
	private String industry;
	private String occupation;
	private String natureOfBusiness;
	private String jobTitle;
	private String contractLengthYears;
	private String contractlengthMonths;
	private Integer employeeYears;
	private Integer employeeMonths;

	private String incomeSource;
	private Integer netSalary;
	private String salaryFreq;
	private Integer otherIncome;
	private String otherIncomeFreq;
	private Integer partnerNetIncome;
	private String partnerIncomeFreq;

	private String photoIdType;
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
	private String documentRefNumber;

	//card step1

	//card step2
	private Integer timeWithBankYear;
	private Integer timeWithBankMonth;

	//card step3
	private String maritalStatus;
	private Integer numOfDependants;
	private String qffNum;

	//card step4

	private String relativeTitle;
	private String relativeFirstName;
	private String relativeLastName;
	private String relativePhoneNum;
	private Boolean relativePhoneIntelFlag;
	private String relativeRelationship;


	//card step5
	private String residentialStatus;
	private Integer valueOfEstate;
	private Integer valueOfVehiclesOrBoats;
	private Integer valueOfSavingShares;
	private Integer shareOfMortgageOrRent;
	private Integer shareOfOtherLoans;
	private Integer shareOfLivingExp;
	private Integer totalMortgageBal;
	private String sourceOfWealthCountry;
	public String getCustomerGroup() {
		return customerGroup;
	}
	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Boolean getPrevAddrSameAsMainApplicant() {
		return prevAddrSameAsMainApplicant;
	}
	public void setPrevAddrSameAsMainApplicant(Boolean prevAddrSameAsMainApplicant) {
		this.prevAddrSameAsMainApplicant = prevAddrSameAsMainApplicant;
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
	public List<FormCityCountry> getLast3YearOtherCountries() {
		return last3YearOtherCountries;
	}
	public void setLast3YearOtherCountries(List<FormCityCountry> last3YearOtherCountries) {
		this.last3YearOtherCountries = last3YearOtherCountries;
	}
	public Boolean getIsResident() {
		return isResident;
	}
	public void setIsResident(Boolean isResident) {
		this.isResident = isResident;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Boolean getHasMultipleNat() {
		return hasMultipleNat;
	}
	public void setHasMultipleNat(Boolean hasMultipleNat) {
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
	public String getCountryTax() {
		return countryTax;
	}
	public void setCountryTax(String countryTax) {
		this.countryTax = countryTax;
	}
	public List<String> getOtherTaxCountries() {
		return otherTaxCountries;
	}
	public void setOtherTaxCountries(List<String> otherTaxCountries) {
		this.otherTaxCountries = otherTaxCountries;
	}
	public String getTfn() {
		return tfn;
	}
	public void setTfn(String tfn) {
		this.tfn = tfn;
	}
	public String getTfnExemption() {
		return tfnExemption;
	}
	public void setTfnExemption(String tfnExemption) {
		this.tfnExemption = tfnExemption;
	}
	public Boolean getUsPersonForTax() {
		return usPersonForTax;
	}
	public void setUsPersonForTax(Boolean usPersonForTax) {
		this.usPersonForTax = usPersonForTax;
	}
	public String getCountryOfBirth() {
		return countryOfBirth;
	}
	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	public String getPreviousFirstName() {
		return previousFirstName;
	}
	public void setPreviousFirstName(String previousFirstName) {
		this.previousFirstName = previousFirstName;
	}
	public String getOtherFirstName() {
		return otherFirstName;
	}
	public void setOtherFirstName(String otherFirstName) {
		this.otherFirstName = otherFirstName;
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
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerPhoneNum() {
		return employerPhoneNum;
	}
	public void setEmployerPhoneNum(String employerPhoneNum) {
		this.employerPhoneNum = employerPhoneNum;
	}
	public Boolean getEmployerPhoneIntelFlag() {
		return employerPhoneIntelFlag;
	}
	public void setEmployerPhoneIntelFlag(Boolean employerPhoneIntelFlag) {
		this.employerPhoneIntelFlag = employerPhoneIntelFlag;
	}
	public FormAddress getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(FormAddress employerAddress) {
		this.employerAddress = employerAddress;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
	public String getContractLengthYears() {
		return contractLengthYears;
	}
	public void setContractLengthYears(String contractLengthYears) {
		this.contractLengthYears = contractLengthYears;
	}
	public String getContractlengthMonths() {
		return contractlengthMonths;
	}
	public void setContractlengthMonths(String contractlengthMonths) {
		this.contractlengthMonths = contractlengthMonths;
	}
	public Integer getEmployeeYears() {
		return employeeYears;
	}
	public void setEmployeeYears(Integer employeeYears) {
		this.employeeYears = employeeYears;
	}
	public Integer getEmployeeMonths() {
		return employeeMonths;
	}
	public void setEmployeeMonths(Integer employeeMonths) {
		this.employeeMonths = employeeMonths;
	}
	public String getIncomeSource() {
		return incomeSource;
	}
	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}
	public Integer getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}
	public String getSalaryFreq() {
		return salaryFreq;
	}
	public void setSalaryFreq(String salaryFreq) {
		this.salaryFreq = salaryFreq;
	}
	public Integer getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(Integer otherIncome) {
		this.otherIncome = otherIncome;
	}
	public String getOtherIncomeFreq() {
		return otherIncomeFreq;
	}
	public void setOtherIncomeFreq(String otherIncomeFreq) {
		this.otherIncomeFreq = otherIncomeFreq;
	}
	public Integer getPartnerNetIncome() {
		return partnerNetIncome;
	}
	public void setPartnerNetIncome(Integer partnerNetIncome) {
		this.partnerNetIncome = partnerNetIncome;
	}
	public String getPartnerIncomeFreq() {
		return partnerIncomeFreq;
	}
	public void setPartnerIncomeFreq(String partnerIncomeFreq) {
		this.partnerIncomeFreq = partnerIncomeFreq;
	}
	public String getPhotoIdType() {
		return photoIdType;
	}
	public void setPhotoIdType(String photoIdType) {
		this.photoIdType = photoIdType;
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
	public String getDocumentRefNumber() {
		return documentRefNumber;
	}
	public void setDocumentRefNumber(String documentRefNumber) {
		this.documentRefNumber = documentRefNumber;
	}
	public Integer getTimeWithBankYear() {
		return timeWithBankYear;
	}
	public void setTimeWithBankYear(Integer timeWithBankYear) {
		this.timeWithBankYear = timeWithBankYear;
	}
	public Integer getTimeWithBankMonth() {
		return timeWithBankMonth;
	}
	public void setTimeWithBankMonth(Integer timeWithBankMonth) {
		this.timeWithBankMonth = timeWithBankMonth;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Integer getNumOfDependants() {
		return numOfDependants;
	}
	public void setNumOfDependants(Integer numOfDependants) {
		this.numOfDependants = numOfDependants;
	}
	public String getQffNum() {
		return qffNum;
	}
	public void setQffNum(String qffNum) {
		this.qffNum = qffNum;
	}
	public String getRelativeTitle() {
		return relativeTitle;
	}
	public void setRelativeTitle(String relativeTitle) {
		this.relativeTitle = relativeTitle;
	}
	public String getRelativeFirstName() {
		return relativeFirstName;
	}
	public void setRelativeFirstName(String relativeFirstName) {
		this.relativeFirstName = relativeFirstName;
	}
	public String getRelativeLastName() {
		return relativeLastName;
	}
	public void setRelativeLastName(String relativeLastName) {
		this.relativeLastName = relativeLastName;
	}
	public String getRelativePhoneNum() {
		return relativePhoneNum;
	}
	public void setRelativePhoneNum(String relativePhoneNum) {
		this.relativePhoneNum = relativePhoneNum;
	}
	public Boolean getRelativePhoneIntelFlag() {
		return relativePhoneIntelFlag;
	}
	public void setRelativePhoneIntelFlag(Boolean relativePhoneIntelFlag) {
		this.relativePhoneIntelFlag = relativePhoneIntelFlag;
	}
	public String getRelativeRelationship() {
		return relativeRelationship;
	}
	public void setRelativeRelationship(String relativeRelationship) {
		this.relativeRelationship = relativeRelationship;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public Integer getValueOfEstate() {
		return valueOfEstate;
	}
	public void setValueOfEstate(Integer valueOfEstate) {
		this.valueOfEstate = valueOfEstate;
	}
	public Integer getValueOfVehiclesOrBoats() {
		return valueOfVehiclesOrBoats;
	}
	public void setValueOfVehiclesOrBoats(Integer valueOfVehiclesOrBoats) {
		this.valueOfVehiclesOrBoats = valueOfVehiclesOrBoats;
	}
	public Integer getValueOfSavingShares() {
		return valueOfSavingShares;
	}
	public void setValueOfSavingShares(Integer valueOfSavingShares) {
		this.valueOfSavingShares = valueOfSavingShares;
	}
	public Integer getShareOfMortgageOrRent() {
		return shareOfMortgageOrRent;
	}
	public void setShareOfMortgageOrRent(Integer shareOfMortgageOrRent) {
		this.shareOfMortgageOrRent = shareOfMortgageOrRent;
	}
	public Integer getShareOfOtherLoans() {
		return shareOfOtherLoans;
	}
	public void setShareOfOtherLoans(Integer shareOfOtherLoans) {
		this.shareOfOtherLoans = shareOfOtherLoans;
	}
	public Integer getShareOfLivingExp() {
		return shareOfLivingExp;
	}
	public void setShareOfLivingExp(Integer shareOfLivingExp) {
		this.shareOfLivingExp = shareOfLivingExp;
	}
	public Integer getTotalMortgageBal() {
		return totalMortgageBal;
	}
	public void setTotalMortgageBal(Integer totalMortgageBal) {
		this.totalMortgageBal = totalMortgageBal;
	}
	public String getSourceOfWealthCountry() {
		return sourceOfWealthCountry;
	}
	public void setSourceOfWealthCountry(String sourceOfWealthCountry) {
		this.sourceOfWealthCountry = sourceOfWealthCountry;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getHubCustomerId() {
		return hubCustomerId;
	}
	public void setHubCustomerId(String hubCustomerId) {
		this.hubCustomerId = hubCustomerId;
	}
	
	
}
