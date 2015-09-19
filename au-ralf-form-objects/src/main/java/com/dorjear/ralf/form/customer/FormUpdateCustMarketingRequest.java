package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCustBaseReq;

public class FormUpdateCustMarketingRequest extends FormCustBaseReq {
	private Boolean allowEmail;
	private Boolean allowSMS;
	private Boolean allowDirectMail;
	private Boolean allowPhone;
	public Boolean getAllowEmail() {
		return allowEmail;
	}
	public void setAllowEmail(Boolean allowEmail) {
		this.allowEmail = allowEmail;
	}
	public Boolean getAllowSMS() {
		return allowSMS;
	}
	public void setAllowSMS(Boolean allowSMS) {
		this.allowSMS = allowSMS;
	}
	public Boolean getAllowDirectMail() {
		return allowDirectMail;
	}
	public void setAllowDirectMail(Boolean allowDirectMail) {
		this.allowDirectMail = allowDirectMail;
	}
	public Boolean getAllowPhone() {
		return allowPhone;
	}
	public void setAllowPhone(Boolean allowPhone) {
		this.allowPhone = allowPhone;
	}
	
	
}
