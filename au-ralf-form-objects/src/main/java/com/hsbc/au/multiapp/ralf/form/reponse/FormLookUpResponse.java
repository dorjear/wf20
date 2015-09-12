package com.hsbc.au.multiapp.ralf.form.reponse;

import java.util.List;
import java.util.Map;

import com.hsbc.au.multiapp.ralf.form.FormLookUpData;

public class FormLookUpResponse extends FormResponseBase {
	private Map<String, List<FormLookUpData>> resultMap;

	public Map<String, List<FormLookUpData>> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, List<FormLookUpData>> resultMap) {
		this.resultMap = resultMap;
	}
	

}
