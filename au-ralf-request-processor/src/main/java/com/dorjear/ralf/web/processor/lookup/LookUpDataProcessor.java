package com.dorjear.ralf.web.processor.lookup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.form.lookup.FormLookUpResponse;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;
import com.dorjear.ralf.web.processor.util.DemoResponseFileHelper;

@Component
public class LookUpDataProcessor implements RequestProcessor{
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		System.out.println(this.getClass());
		String fileName = formReq.getCmd();

    	String fileFullPath = DemoResponseFileHelper.getFullPath(fileName);

    	FormLookUpResponse response = JsonObjectUtil.loadObjectFromFileSystemJsonFileFullPath(fileFullPath, FormLookUpResponse.class);
		return response;
	}
}
