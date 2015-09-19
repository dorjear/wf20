package com.dorjear.ralf.form.lookup;

import java.util.List;
import java.util.Map;

import com.dorjear.ralf.form.FormLookUpData;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormLookUpResponse extends FormResponseBase {
	private Map<String, List<FormLookUpData>> resultMap;

	public Map<String, List<FormLookUpData>> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, List<FormLookUpData>> resultMap) {
		this.resultMap = resultMap;
	}
	

}
