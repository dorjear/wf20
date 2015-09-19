package com.dorjear.ralf.form.branch;

import java.util.List;

import com.dorjear.ralf.form.FormTeamGroup;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormBranchTeamGroupsResponse extends FormResponseBase{
	private List<FormTeamGroup> teamGroups;

	public List<FormTeamGroup> getTeamGroups() {
		return teamGroups;
	}

	public void setTeamGroups(List<FormTeamGroup> teamGroups) {
		this.teamGroups = teamGroups;
	}
	
	

}
