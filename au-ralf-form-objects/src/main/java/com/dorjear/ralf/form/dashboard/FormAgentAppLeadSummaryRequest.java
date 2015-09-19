package com.dorjear.ralf.form.dashboard;


public class FormAgentAppLeadSummaryRequest extends FormAppLeadSummaryRequest {
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
