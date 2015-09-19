package com.dorjear.ralf.form;

import java.util.List;


public class FormCardStep2 {
	
	private Integer timeWithBankYear;
	private Integer timeWithBankMonth;
	private Integer numOfCards;
	private Integer combinedCreditLimit;
	private Integer totalBalOwing;
	private String ddAcctHolder;
	private String ddFinInst;
	private String ddAcctNum;
	private String ddAcctBSB;
	private String ddFinInstOther;
	private List<FormBalanceTransfer> balanceTransfers;
	
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
}
