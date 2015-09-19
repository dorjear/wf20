package com.dorjear.ralf.form.branch;


public class FormBranchTeamRequest extends FormBranchIdRequestBase {

	private String branch;
	private String name;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
