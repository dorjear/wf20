package com.dorjear.ralf.form.branch;

import com.dorjear.ralf.form.base.FormRequestBase;


public class FormBranchTeamAddUpdateRequest extends FormRequestBase {

	private long teamGroupId;
	private long teamId;
	private String name;
	private String contactChannel;
	public long getTeamGroupId() {
		return teamGroupId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactChannel() {
		return contactChannel;
	}
	public void setContactChannel(String contactChannel) {
		this.contactChannel = contactChannel;
	}
	public void setTeamGroupId(long teamGroupId) {
		this.teamGroupId = teamGroupId;
	}
	
	
	
	
}
