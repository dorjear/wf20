package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormAppLeadSummary;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormAppLeadSearchResponse extends FormResponseBase {
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
