package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormRegionalAppLeadDashboardRequest extends FormRequestBase{
	private String region;
	private String dateRangeCode;
	private String dateFrom;
	private String dateTo;
	private Boolean countAssignedTo;
	private Boolean countInitiatedFrom;
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
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
