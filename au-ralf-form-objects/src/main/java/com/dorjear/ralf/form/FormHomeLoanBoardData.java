package com.dorjear.ralf.form;

import java.util.List;

public class FormHomeLoanBoardData {
	
	private String status;
	private String subStatus;
	private List<Integer> totalNumber;
	private List<Integer> totalAmount;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public List<Integer> getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(List<Integer> totalNumber) {
		this.totalNumber = totalNumber;
	}
	public List<Integer> getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(List<Integer> totalAmount) {
		this.totalAmount = totalAmount;
	}
}
