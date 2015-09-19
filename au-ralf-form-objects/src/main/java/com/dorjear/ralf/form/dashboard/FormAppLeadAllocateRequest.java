package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAppLeadAllocateRequest extends FormRequestBase {
	private String assignedToBranch;
	private String assignedToStaff;
	private String[] appRefNumbers;			// TODO will this a application number?
	
	public String getAssignedToBranch() {
		return assignedToBranch;
	}
	public void setAssignedToBranch(String assignedToBranch) {
		this.assignedToBranch = assignedToBranch;
	}
	public String getAssignedToStaff() {
		return assignedToStaff;
	}
	public void setAssignedToStaff(String assignedToStaff) {
		this.assignedToStaff = assignedToStaff;
	}
	public String[] getAppRefNumbers() {
		return appRefNumbers;
	}
	public void setAppRefNumbers(String[] appRefNumbers) {
		this.appRefNumbers = appRefNumbers;
	}
	
}
