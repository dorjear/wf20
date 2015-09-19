package com.dorjear.ralf.form.dashboard;

import java.util.HashMap;

import com.dorjear.ralf.form.base.FormResponseBase;

public class FormManagerAppLeadDashboardResponse extends FormResponseBase {
	private HashMap<String, int[]> actioned;
	private HashMap<String, int[]> entered;
	private HashMap<String, int[]> dues;
	
	public HashMap<String, int[]> getActioned() {
		return actioned;
	}
	public void setActioned(HashMap<String, int[]> actioned) {
		this.actioned = actioned;
	}
	public HashMap<String, int[]> getEntered() {
		return entered;
	}
	public void setEntered(HashMap<String, int[]> entered) {
		this.entered = entered;
	}
	public HashMap<String, int[]> getDues() {
		return dues;
	}
	public void setDues(HashMap<String, int[]> dues) {
		this.dues = dues;
	}
}
