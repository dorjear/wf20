package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormCodeValue;
import com.dorjear.ralf.form.FormCustBaseReq;

public class FormUpdateCustSocialProfileRequest extends FormCustBaseReq {
	private FormCodeValue[] socialProfiles;

	public FormCodeValue[] getSocialProfiles() {
		return socialProfiles;
	}

	public void setSocialProfiles(FormCodeValue[] socialProfiles) {
		this.socialProfiles = socialProfiles;
	}
	
}
