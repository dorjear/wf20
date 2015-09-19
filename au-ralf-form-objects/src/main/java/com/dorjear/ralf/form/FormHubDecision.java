package com.dorjear.ralf.form;

import java.util.List;



public class FormHubDecision {
	
	private String lastUpdateDate;
	private String applicationNumber;
	private String mainPbn;
	private String join1Pbn;
	private String join2Pbn;
	
	private List<FormCustHubProduct> products;
	private String vdcAutoOpenErrorMessage;
	private String ostStatus;
	private String ostErrorMessage;
	private Boolean blacklistReviewRequired;
	
	private String[] hubErrorMessages;
	private String mainFatcaErrorMessage;
	private String join1FatcaErrorMessage;
	private String join2FatcaErrorMessage;
	private String nominatedAccountErrorMessage;
	
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getMainPbn() {
		return mainPbn;
	}
	public void setMainPbn(String mainPbn) {
		this.mainPbn = mainPbn;
	}
	public String getJoin1Pbn() {
		return join1Pbn;
	}
	public void setJoin1Pbn(String join1Pbn) {
		this.join1Pbn = join1Pbn;
	}
	public String getJoin2Pbn() {
		return join2Pbn;
	}
	public void setJoin2Pbn(String join2Pbn) {
		this.join2Pbn = join2Pbn;
	}
	public List<FormCustHubProduct> getProducts() {
		return products;
	}
	public void setProducts(List<FormCustHubProduct> products) {
		this.products = products;
	}
	public String getVdcAutoOpenErrorMessage() {
		return vdcAutoOpenErrorMessage;
	}
	public void setVdcAutoOpenErrorMessage(String vdcAutoOpenErrorMessage) {
		this.vdcAutoOpenErrorMessage = vdcAutoOpenErrorMessage;
	}
	public String getOstStatus() {
		return ostStatus;
	}
	public void setOstStatus(String ostStatus) {
		this.ostStatus = ostStatus;
	}
	public String getOstErrorMessage() {
		return ostErrorMessage;
	}
	public void setOstErrorMessage(String ostErrorMessage) {
		this.ostErrorMessage = ostErrorMessage;
	}
	public Boolean getBlacklistReviewRequired() {
		return blacklistReviewRequired;
	}
	public void setBlacklistReviewRequired(Boolean blacklistReviewRequired) {
		this.blacklistReviewRequired = blacklistReviewRequired;
	}
	public String[] getHubErrorMessages() {
		return hubErrorMessages;
	}
	public void setHubErrorMessages(String[] hubErrorMessages) {
		this.hubErrorMessages = hubErrorMessages;
	}
	public String getMainFatcaErrorMessage() {
		return mainFatcaErrorMessage;
	}
	public void setMainFatcaErrorMessage(String mainFatcaErrorMessage) {
		this.mainFatcaErrorMessage = mainFatcaErrorMessage;
	}
	public String getJoin1FatcaErrorMessage() {
		return join1FatcaErrorMessage;
	}
	public void setJoin1FatcaErrorMessage(String join1FatcaErrorMessage) {
		this.join1FatcaErrorMessage = join1FatcaErrorMessage;
	}
	public String getJoin2FatcaErrorMessage() {
		return join2FatcaErrorMessage;
	}
	public void setJoin2FatcaErrorMessage(String join2FatcaErrorMessage) {
		this.join2FatcaErrorMessage = join2FatcaErrorMessage;
	}
	public String getNominatedAccountErrorMessage() {
		return nominatedAccountErrorMessage;
	}
	public void setNominatedAccountErrorMessage(String nominatedAccountErrorMessage) {
		this.nominatedAccountErrorMessage = nominatedAccountErrorMessage;
	}
}
