package com.dorjear.ralf.form.dashboard;

import java.util.Arrays;

import com.dorjear.ralf.form.FormAppLeadSummary;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormAgentAppLeadSummaryResponse extends FormResponseBase {
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
