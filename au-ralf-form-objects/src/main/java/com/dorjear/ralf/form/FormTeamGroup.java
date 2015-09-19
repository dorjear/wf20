package com.dorjear.ralf.form;

import java.util.List;

public class FormTeamGroup {
	
	private long id;
	private String branchCode;
	private String name;
	private boolean allowAutoAllocation;
	private List<FormTeam>  teams;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getAllowAutoAllocation() {
		return allowAutoAllocation;
	}
	public void setAllowAutoAllocation(boolean allowAutoAllocation) {
		this.allowAutoAllocation = allowAutoAllocation;
	}
	public List<FormTeam> getTeams() {
		return teams;
	}
	public void setTeams(List<FormTeam> teams) {
		this.teams = teams;
	}
	
	
	
	
	
	
}
