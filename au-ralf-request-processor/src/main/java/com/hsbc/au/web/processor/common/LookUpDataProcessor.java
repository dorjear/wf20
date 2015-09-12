package com.hsbc.au.web.processor.common;

import javax.servlet.http.HttpServletRequest;

import com.hsbc.au.base.gson.util.JsonObjectUtil;
import com.hsbc.au.multiapp.ralf.form.reponse.FormLookUpResponse;
import com.hsbc.au.multiapp.ralf.form.reponse.FormResponseBase;
import com.hsbc.au.multiapp.ralf.form.request.FormRequestBase;
import com.hsbc.au.web.processor.spi.RequestProcessor;

public class LookUpDataProcessor implements RequestProcessor{
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		String fileName = formReq.getCmd();

    	String fileFullPath = DemoDataUtil.getFullPath(fileName);

    	FormLookUpResponse response = JsonObjectUtil.loadObjectFromFileSystemJsonFileFullPath(fileFullPath, FormLookUpResponse.class);
		return response;
	}
}
