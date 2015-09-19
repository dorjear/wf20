package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormManagerAppLeadDashboardRequest extends FormRequestBase {
	private String productGroup;
	private String assignedToBranch;
	private Boolean assigned;
	private String appOrLead;
	private String team2;

	public String getAssignedToBranch() {
		return assignedToBranch;
	}
	public void setAssignedToBranch(String assignedToBranch) {
		this.assignedToBranch = assignedToBranch;
	}
	public Boolean getAssigned() {
		return assigned;
	}
	public void setAssigned(Boolean assigned) {
		this.assigned = assigned;
	}
	public String getAppOrLead() {
		return appOrLead;
	}
	public void setAppOrLead(String appOrLead) {
		this.appOrLead = appOrLead;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	
}
