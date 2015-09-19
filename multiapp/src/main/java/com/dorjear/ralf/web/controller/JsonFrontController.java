package com.dorjear.ralf.web.controller;
 
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.web.configuration.CmdConfig;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;
import com.dorjear.ralf.web.processor.util.ApplicationContextProvider;
import com.dorjear.ralf.web.processor.util.DemoResponseFileHelper;
 
@Controller
@RequestMapping("/")
public class JsonFrontController {
 
	private final String defaultErrorResponse = "{\"responseStatus\":\"error\"}";
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping(value = "/*", method = RequestMethod.POST)
    public @ResponseBody String handleRequestJsonAndResponseJson(@RequestBody String requestStr, HttpServletRequest request) {
		try{
	    	String responseStr = defaultErrorResponse;
		    FormResponseBase response = new FormResponseBase();
		   	if(StringUtils.isBlank(DemoResponseFileHelper.getWebRoot())) {
	    		DemoResponseFileHelper.setWebRoot(request.getServletContext().getRealPath("/"));
	    	}
	    	
	    	FormRequestBase formReq= (FormRequestBase) JsonObjectUtil.convertStringToObject(requestStr, CmdConfig.FORM_REQUEST_BASE);
	    	String cmd = formReq.getCmd();
	    	String formReqType = CmdConfig.getRequestClass(cmd);
	    	String processorType = CmdConfig.getRequestProcessor(cmd);
	    	if(formReqType==null){
		        String fileFullPath=DemoResponseFileHelper.getFullPath(cmd);
			    responseStr = JsonObjectUtil.loadStringFromFileSystemJsonFileFullPath(fileFullPath);
			    if(responseStr==null) responseStr = defaultErrorResponse;
		    	System.out.println(responseStr);
		        return responseStr;	    		
	    	}
	 		try {
		    	formReq= (FormRequestBase) JsonObjectUtil.convertStringToObject(requestStr, formReqType);
		    	ApplicationContext context = ApplicationContextProvider.getApplicationContext();
			    RequestProcessor processor;
	 		    response.setCmd(formReq.getCmd());
				processor = (RequestProcessor) context.getBean(Class.forName(processorType));
			    response = processor.process(formReq, request);
			} catch (BeansException e) {
				response.setErrorCode("GE0001");
				response.setResponseStatus("error");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				response.setErrorCode("GE0001");
				response.setResponseStatus("error");
				e.printStackTrace();
			} catch (Exception e){
				response.setErrorCode("GE0001");
				response.setResponseStatus("error");
				e.printStackTrace();			
			}

	    	responseStr = JsonObjectUtil.convertObjectToString(response);
	        return responseStr;
			
		}catch(Exception e){
			e.printStackTrace();
			return defaultErrorResponse;
		}
    }
 
}