package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAgentAppLeadDashboardRequest extends FormRequestBase {
	private boolean assignedToMe;
	private boolean monitoredByMe;
	public boolean isAssignedToMe() {
		return assignedToMe;
	}
	public void setAssignedToMe(boolean assignedToMe) {
		this.assignedToMe = assignedToMe;
	}
	public boolean isMonitoredByMe() {
		return monitoredByMe;
	}
	public void setMonitoredByMe(boolean monitoredByMe) {
		this.monitoredByMe = monitoredByMe;
	}
	
}
