package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormGetStaffWorkLoadRequest extends FormRequestBase{
	private String branch;
	private String staff;
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
}
