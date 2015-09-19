package com.dorjear.ralf.form.note;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormListNotesRequest extends FormRequestBase{

	private String appRefNumber;
	private Long ralfCustomerId;
	private String noteType;
	private Boolean important;
	
	public String getAppRefNumber() {
		return appRefNumber;
	}
	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}
	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}
	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	public String getNoteType() {
		return noteType;
	}
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}
	public Boolean getImportant() {
		return important;
	}
	public void setImportant(Boolean important) {
		this.important = important;
	}
	
}
