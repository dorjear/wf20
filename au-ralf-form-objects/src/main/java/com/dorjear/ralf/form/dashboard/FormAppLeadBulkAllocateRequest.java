package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.FormAllocation;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAppLeadBulkAllocateRequest extends FormRequestBase{
	private String productGroup;
	private String currentAssignedToBranch;
	private String appOrLead;
	private String status;
	private String assignedToBranch;
	private FormAllocation[] allocations;
	
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
	public String getAssignedToBranch() {
		return assignedToBranch;
	}
	public void setAssignedToBranch(String assignedToBranch) {
		this.assignedToBranch = assignedToBranch;
	}
	public FormAllocation[] getAllocations() {
		return allocations;
	}
	public void setAllocations(FormAllocation[] allocations) {
		this.allocations = allocations;
	}
}
