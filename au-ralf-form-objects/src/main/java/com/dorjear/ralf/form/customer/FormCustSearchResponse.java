package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustSearchResult;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormCustSearchResponse extends FormResponseBase {
	private Boolean exceedLimit;
	private FormCustSearchResult[] searchResults = new FormCustSearchResult[0];

	public Boolean getExceedLimit() {
		return exceedLimit;
	}

	public void setExceedLimit(Boolean exceedLimit) {
		this.exceedLimit = exceedLimit;
	}

	public FormCustSearchResult[] getSearchResults() {
		return searchResults;
	}

	public void setSearchResults(FormCustSearchResult[] searchResults) {
		this.searchResults = searchResults;
	}


}
