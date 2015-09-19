package com.dorjear.ralf.web.processor.spi;

import javax.servlet.http.HttpServletRequest;

import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;

public interface RequestProcessor {
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq);
}
