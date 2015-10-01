package com.dorjear.ralf.db.dto;

public class GenericCondition {
	private String andOr;
	private String propertyName;
	private String condition;
	private Class<?> dataType;
	private Object value;
	public String getAndOr() {
		return andOr;
	}
	public void setAndOr(String andOr) {
		this.andOr = andOr;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Class<?> getDataType() {
		return dataType;
	}
	public void setDataType(Class<?> dataType) {
		this.dataType = dataType;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	
}