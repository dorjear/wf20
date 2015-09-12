package com.hsbc.au.multiapp.ralf.form;

public class FormLookUpData {
	
	private String code;
	private String value;
	private int sortIndex;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getSortIndex() {
		return sortIndex;
	}
	public void setSortIndex(int sortIndex) {
		this.sortIndex = sortIndex;
	}

}
