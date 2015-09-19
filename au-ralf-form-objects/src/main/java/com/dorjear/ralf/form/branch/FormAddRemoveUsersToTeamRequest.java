package com.dorjear.ralf.form.branch;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAddRemoveUsersToTeamRequest  extends FormRequestBase {
	private String[] userIds;
	private Integer teamId;
	public String[] getUserIds() {
		return userIds;
	}
	public void setUserIds(String[] userIds) {
		this.userIds = userIds;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	
}
