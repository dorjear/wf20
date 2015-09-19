package com.dorjear.ralf.form.lead;

import com.dorjear.ralf.form.FormCustomer;
import com.dorjear.ralf.form.FormLead;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAddLeadsRequest extends FormRequestBase {
	private Boolean bypassCustSearch;
	private FormCustomer customer;
	private FormLead[] leads;
	public FormCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(FormCustomer customer) {
		this.customer = customer;
	}
	public FormLead[] getLeads() {
		return leads;
	}
	public void setLeads(FormLead[] leads) {
		this.leads = leads;
	}
	public Boolean getBypassCustSearch() {
		return bypassCustSearch;
	}
	public void setBypassCustSearch(Boolean bypassCustSearch) {
		this.bypassCustSearch = bypassCustSearch;
	}
	
	

}
