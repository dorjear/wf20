package com.dorjear.ralf.form.dashboard;

import java.util.Set;

import javax.validation.constraints.Size;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormCountUnassignedRequest extends FormRequestBase {
	
	private String productGroup;
	private String currentAssignedToBranch;
	private String appOrLead;
	private String status;
	
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getCurrentAssignedToBranch() {
		return currentAssignedToBranch;
	}
	public void setCurrentAssignedToBranch(String currentAssignedToBranch) {
		this.currentAssignedToBranch = currentAssignedToBranch;
	}
	public String getAppOrLead() {
		return appOrLead;
	}
	public void setAppOrLead(String appOrLead) {
		this.appOrLead = appOrLead;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
