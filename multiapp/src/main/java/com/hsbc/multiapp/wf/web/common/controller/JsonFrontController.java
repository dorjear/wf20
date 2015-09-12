package com.hsbc.multiapp.wf.web.common.controller;
 
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsbc.au.base.gson.util.JsonObjectUtil;
import com.hsbc.au.multiapp.ralf.form.FormCodeValue;
import com.hsbc.au.multiapp.ralf.form.reponse.FormResponseBase;
import com.hsbc.au.multiapp.ralf.form.request.FormRequestBase;
import com.hsbc.au.web.processor.common.DemoDataUtil;
import com.hsbc.au.web.processor.spi.RequestProcessor;
import com.hsbc.multiapp.wf.web.common.configuration.AppConfig;
 
@Controller
@RequestMapping("/")
public class JsonFrontController {
 
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping(value = "/multiapp", method = RequestMethod.POST)
    public @ResponseBody String handleRequestJsonAndResponseJson(@RequestBody String requestStr, HttpServletRequest request) {
    	if(StringUtils.isBlank(DemoDataUtil.getWebRoot())) {
    		DemoDataUtil.setWebRoot(request.getServletContext().getRealPath("/"));
    	}
    	
    	FormRequestBase formReq= (FormRequestBase) JsonObjectUtil.convertStringToObject(requestStr, "com.hsbc.au.multiapp.ralf.form.request.FormRequestBase");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    RequestProcessor processor;
	    FormResponseBase response = new FormResponseBase();
		try {
			processor = (RequestProcessor) context.getBean(Class.forName("com.hsbc.au.web.processor.common.LookUpDataProcessor"));
		    response = processor.process(formReq, request);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

//	    String fileFullPath=DemoDataUtil.getFullPath(formReq.getCmd());
//    	FormCodeValue codeValue = JsonObjectUtil.loadObjectFromFileSystemJsonFileFullPath(fileFullPath, FormCodeValue.class);
    	String responseStr = JsonObjectUtil.convertObjectToString(response);
//    	System.out.println(responseStr);
//    	responseStr = JsonObjectUtil.loadStringFromFileSystemJsonFileFullPath(fileFullPath);
//      System.out.println(requestStr);
        return responseStr;
    }
 
}