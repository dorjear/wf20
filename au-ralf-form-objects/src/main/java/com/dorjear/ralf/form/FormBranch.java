package com.dorjear.ralf.form;

import java.util.List;


public class FormBranch {
	private String code;
	private String name;
	private String bsb;
	private String type;
	private String region;
	private String phone;
	private String hubBranchCode;
	private FormAddress address;
	//private FormBranchTeamGroup[] teamGroups;
	private List<FormTeamGroup> teamGroups;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBsb() {
		return bsb;
	}
	public void setBsb(String bsb) {
		this.bsb = bsb;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHubBranchCode() {
		return hubBranchCode;
	}
	public void setHubBranchCode(String hubBranchCode) {
		this.hubBranchCode = hubBranchCode;
	}
	public FormAddress getAddress() {
		return address;
	}
	public void setAddress(FormAddress address) {
		this.address = address;
	}
	public List<FormTeamGroup> getTeamGroups() {
		return teamGroups;
	}
	public void setTeamGroups(List<FormTeamGroup> teamGroups) {
		this.teamGroups = teamGroups;
	}
	
	

}
