package com.dorjear.ralf.form.branch;

import java.util.List;

import com.dorjear.ralf.form.FormLookUpData;
import com.dorjear.ralf.form.base.FormResponseBase;


public class FormGetBranchOptionsResponse extends FormResponseBase {

	List<FormLookUpData> options;

	public List<FormLookUpData> getOptions() {
		return options;
	}

	public void setOptions(List<FormLookUpData> options) {
		this.options = options;
	}
	
	
}
