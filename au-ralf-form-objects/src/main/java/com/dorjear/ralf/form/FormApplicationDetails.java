package com.dorjear.ralf.form;

import java.util.List;


public class FormApplicationDetails {
	
	private String productGroup;
	private String productCodes;
	private Boolean debitCardRequired;
	private String ostUserName;
	private Boolean directIncomeDeposit;
	private List<String> activities;
	private String mainReason;
	private Integer depositAmountMonthly;
	private Integer withdrawAmountMonthly;
	private Integer numberOfOverseaPayMonthly;
	private Integer firstYearFund;
	private Integer firstYearAsset;
	private String initialFundDepositMethod;
	private String sourceOfCash;
	private String initialFundSource;
	private String initialFundCountry;
	private String sourceOfWealthCountry;
	private Boolean safeDepositCustody;
	private Boolean productSuitabilityConfirmed;

	private String campaignCode;
	private String loanPurposeCode;
	private String loanPurposeDesc;
	private String loanReason;
	private Integer loanAmount;
	private Integer loanTermInMonths;
	private Integer numOfCards;
	private Integer combinedCreditLimit;
	private Integer totalBalOwing;
	private String ddAcctHolder;
	private String ddFinInst;
	private String ddAcctNum;
	private String ddAcctBSB;
	private String ddFinInstOther;
	private List<FormBalanceTransfer> balanceTransfers;
	private String isLimited;
	private Integer limitDesired;
	private Boolean receiveLimitOffer;
	private Boolean allowOverLimit;
	
	public Boolean getDebitCardRequired() {
		return debitCardRequired;
	}
	public void setDebitCardRequired(Boolean debitCardRequired) {
		this.debitCardRequired = debitCardRequired;
	}
	public String getOstUserName() {
		return ostUserName;
	}
	public void setOstUserName(String ostUserName) {
		this.ostUserName = ostUserName;
	}
	public Boolean getDirectIncomeDeposit() {
		return directIncomeDeposit;
	}
	public void setDirectIncomeDeposit(Boolean directIncomeDeposit) {
		this.directIncomeDeposit = directIncomeDeposit;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	public String getMainReason() {
		return mainReason;
	}
	public void setMainReason(String mainReason) {
		this.mainReason = mainReason;
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
	public Integer getFirstYearFund() {
		return firstYearFund;
	}
	public void setFirstYearFund(Integer firstYearFund) {
		this.firstYearFund = firstYearFund;
	}
	public Integer getFirstYearAsset() {
		return firstYearAsset;
	}
	public void setFirstYearAsset(Integer firstYearAsset) {
		this.firstYearAsset = firstYearAsset;
	}
	public String getInitialFundDepositMethod() {
		return initialFundDepositMethod;
	}
	public void setInitialFundDepositMethod(String initialFundDepositMethod) {
		this.initialFundDepositMethod = initialFundDepositMethod;
	}
	public String getSourceOfCash() {
		return sourceOfCash;
	}
	public void setSourceOfCash(String sourceOfCash) {
		this.sourceOfCash = sourceOfCash;
	}
	public String getInitialFundSource() {
		return initialFundSource;
	}
	public void setInitialFundSource(String initialFundSource) {
		this.initialFundSource = initialFundSource;
	}
	public String getInitialFundCountry() {
		return initialFundCountry;
	}
	public void setInitialFundCountry(String initialFundCountry) {
		this.initialFundCountry = initialFundCountry;
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
	public Boolean getProductSuitabilityConfirmed() {
		return productSuitabilityConfirmed;
	}
	public void setProductSuitabilityConfirmed(Boolean productSuitabilityConfirmed) {
		this.productSuitabilityConfirmed = productSuitabilityConfirmed;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public String getLoanPurposeCode() {
		return loanPurposeCode;
	}
	public void setLoanPurposeCode(String loanPurposeCode) {
		this.loanPurposeCode = loanPurposeCode;
	}
	public String getLoanPurposeDesc() {
		return loanPurposeDesc;
	}
	public void setLoanPurposeDesc(String loanPurposeDesc) {
		this.loanPurposeDesc = loanPurposeDesc;
	}
	public String getLoanReason() {
		return loanReason;
	}
	public void setLoanReason(String loanReason) {
		this.loanReason = loanReason;
	}
	public Integer getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Integer getLoanTermInMonths() {
		return loanTermInMonths;
	}
	public void setLoanTermInMonths(Integer loanTermInMonths) {
		this.loanTermInMonths = loanTermInMonths;
	}
	public Integer getNumOfCards() {
		return numOfCards;
	}
	public void setNumOfCards(Integer numOfCards) {
		this.numOfCards = numOfCards;
	}
	public Integer getCombinedCreditLimit() {
		return combinedCreditLimit;
	}
	public void setCombinedCreditLimit(Integer combinedCreditLimit) {
		this.combinedCreditLimit = combinedCreditLimit;
	}
	public Integer getTotalBalOwing() {
		return totalBalOwing;
	}
	public void setTotalBalOwing(Integer totalBalOwing) {
		this.totalBalOwing = totalBalOwing;
	}
	public String getDdAcctHolder() {
		return ddAcctHolder;
	}
	public void setDdAcctHolder(String ddAcctHolder) {
		this.ddAcctHolder = ddAcctHolder;
	}
	public String getDdFinInst() {
		return ddFinInst;
	}
	public void setDdFinInst(String ddFinInst) {
		this.ddFinInst = ddFinInst;
	}
	public String getDdAcctNum() {
		return ddAcctNum;
	}
	public void setDdAcctNum(String ddAcctNum) {
		this.ddAcctNum = ddAcctNum;
	}
	public String getDdAcctBSB() {
		return ddAcctBSB;
	}
	public void setDdAcctBSB(String ddAcctBSB) {
		this.ddAcctBSB = ddAcctBSB;
	}
	public String getDdFinInstOther() {
		return ddFinInstOther;
	}
	public void setDdFinInstOther(String ddFinInstOther) {
		this.ddFinInstOther = ddFinInstOther;
	}
	public List<FormBalanceTransfer> getBalanceTransfers() {
		return balanceTransfers;
	}
	public void setBalanceTransfers(List<FormBalanceTransfer> balanceTransfers) {
		this.balanceTransfers = balanceTransfers;
	}
	public String getIsLimited() {
		return isLimited;
	}
	public void setIsLimited(String isLimited) {
		this.isLimited = isLimited;
	}
	public Integer getLimitDesired() {
		return limitDesired;
	}
	public void setLimitDesired(Integer limitDesired) {
		this.limitDesired = limitDesired;
	}
	public Boolean getReceiveLimitOffer() {
		return receiveLimitOffer;
	}
	public void setReceiveLimitOffer(Boolean receiveLimitOffer) {
		this.receiveLimitOffer = receiveLimitOffer;
	}
	public Boolean getAllowOverLimit() {
		return allowOverLimit;
	}
	public void setAllowOverLimit(Boolean allowOverLimit) {
		this.allowOverLimit = allowOverLimit;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getProductCodes() {
		return productCodes;
	}
	public void setProductCodes(String productCodes) {
		this.productCodes = productCodes;
	}

	
}
