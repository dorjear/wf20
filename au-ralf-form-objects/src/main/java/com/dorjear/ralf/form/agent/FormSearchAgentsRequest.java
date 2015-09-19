package com.dorjear.ralf.form.agent;

import javax.validation.constraints.Size;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormSearchAgentsRequest extends FormRequestBase {
	
	@Size(max = 120)
	private String name;
	
	@Size(max = 4)
	private String[] roles;
	
	@Size(max = 3)
	private String branch;
	
	private Integer team;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Integer getTeam() {
		return team;
	}
	public void setTeam(Integer team) {
		this.team = team;
	}
	
}
