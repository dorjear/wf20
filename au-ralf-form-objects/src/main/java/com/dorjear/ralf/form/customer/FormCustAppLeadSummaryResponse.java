package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormAppLeadSummary;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormCustAppLeadSummaryResponse extends FormResponseBase {
	private Boolean exceedLimit;
	private FormAppLeadSummary[] summaries;

	public Boolean getExceedLimit() {
		return exceedLimit;
	}

	public void setExceedLimit(Boolean exceedLimit) {
		this.exceedLimit = exceedLimit;
	}

	public FormAppLeadSummary[] getSummaries() {
		return summaries;
	}

	public void setSummaries(FormAppLeadSummary[] summaries) {
		this.summaries = summaries;
	}
}
