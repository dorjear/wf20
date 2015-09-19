package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.FormSearchCondition;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormAppLeadSearchRequest extends FormRequestBase {
	private FormSearchCondition[] conditions;

	public FormSearchCondition[] getConditions() {
		return conditions;
	}

	public void setConditions(FormSearchCondition[] conditions) {
		this.conditions = conditions;
	}
	
}
