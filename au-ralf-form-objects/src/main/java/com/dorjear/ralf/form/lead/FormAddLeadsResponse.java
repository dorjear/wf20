package com.dorjear.ralf.form.lead;

import com.dorjear.ralf.form.FormCustSearchResult;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormAddLeadsResponse extends FormResponseBase{
	private Long ralfCustomerId;
	private Boolean exceedLimit;
	private FormCustSearchResult[] formCustSearchResult;
	
	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}
	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	public Boolean getExceedLimit() {
		return exceedLimit;
	}
	public void setExceedLimit(Boolean exceedLimit) {
		this.exceedLimit = exceedLimit;
	}
	public FormCustSearchResult[] getFormCustSearchResult() {
		return formCustSearchResult;
	}
	public void setFormCustSearchResult(FormCustSearchResult[] formCustSearchResult) {
		this.formCustSearchResult = formCustSearchResult;
	}
	
}
