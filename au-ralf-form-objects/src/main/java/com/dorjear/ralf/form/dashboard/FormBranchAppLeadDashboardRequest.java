package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormBranchAppLeadDashboardRequest extends FormRequestBase{
	private String branch;
	private Integer team2Id;
	private String dateRangeCode;
	private String dateFrom;
	private String dateTo;
	private Boolean countAssignedTo;
	private Boolean countInitiatedFrom;
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Integer getTeam2Id() {
		return team2Id;
	}
	public void setTeam2Id(Integer team2Id) {
		this.team2Id = team2Id;
	}
	public String getDateRangeCode() {
		return dateRangeCode;
	}
	public void setDateRangeCode(String dateRangeCode) {
		this.dateRangeCode = dateRangeCode;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public Boolean getCountAssignedTo() {
		return countAssignedTo;
	}
	public void setCountAssignedTo(Boolean countAssignedTo) {
		this.countAssignedTo = countAssignedTo;
	}
	public Boolean getCountInitiatedFrom() {
		return countInitiatedFrom;
	}
	public void setCountInitiatedFrom(Boolean countInitiatedFrom) {
		this.countInitiatedFrom = countInitiatedFrom;
	}
}
