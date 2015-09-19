package com.dorjear.ralf.form.agent;

import java.util.List;

import com.dorjear.ralf.form.FormUserNameId;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormSearchAgentsResponse extends FormResponseBase {
	private List<FormUserNameId> agents;

	public List<FormUserNameId> getAgents() {
		return agents;
	}

	public void setAgents(List<FormUserNameId> agents) {
		this.agents = agents;
	}

}
