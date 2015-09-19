package com.dorjear.ralf.form.user;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormUsersToTeamRequestBase extends FormRequestBase {
	private String[] userIds;
	private String teamId;
	
	public String[] getUserIds() {
		return userIds;
	}
	public void setUserIds(String[] userIds) {
		this.userIds = userIds;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	
}
