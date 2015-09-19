package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.FormStaffWorkLoad;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormGetStaffWorkLoadResponse extends FormResponseBase {
	private FormStaffWorkLoad[] staffWorkLoads;

	public FormStaffWorkLoad[] getStaffWorkLoads() {
		return staffWorkLoads;
	}

	public void setStaffWorkLoads(FormStaffWorkLoad[] staffWorkLoads) {
		this.staffWorkLoads = staffWorkLoads;
	}

	
}
