package com.dorjear.ralf.form.appmaint;

import java.util.List;

import com.dorjear.ralf.form.FormException;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormLoadAppExceptionsResponse  extends FormResponseBase{
	private List<FormException> exceptions;

	public List<FormException> getExceptions() {
		return exceptions;
	}

	public void setExceptions(List<FormException> exceptions) {
		this.exceptions = exceptions;
	}

	
	

}
