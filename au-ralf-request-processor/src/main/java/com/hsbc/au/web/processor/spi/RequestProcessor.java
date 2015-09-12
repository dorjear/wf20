package com.hsbc.au.web.processor.spi;

import javax.servlet.http.HttpServletRequest;

import com.hsbc.au.multiapp.ralf.form.reponse.FormResponseBase;
import com.hsbc.au.multiapp.ralf.form.request.FormRequestBase;

public interface RequestProcessor {
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq);
}
