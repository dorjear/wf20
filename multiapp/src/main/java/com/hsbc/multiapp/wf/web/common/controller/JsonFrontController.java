package com.hsbc.multiapp.wf.web.common.controller;
 
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsbc.au.base.gson.util.JsonObjectUtil;
import com.hsbc.au.ralf.form.FormCodeValue;
 
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
    	String path = request.getServletContext().getRealPath("/");
    	System.out.println(path);
    	String dataFileName = "FormCodeValue";
    	String fileFullPath = path+"jsonTest/json/response/"+dataFileName+".txt";

    	FormCodeValue codeValue = JsonObjectUtil.loadObjectFromFileSystemJsonFileFullPath(fileFullPath, FormCodeValue.class);
    	String responseStr = JsonObjectUtil.convertObjectToString(codeValue);
    	System.out.println(responseStr);
    	responseStr = JsonObjectUtil.loadStringFromFileSystemJsonFileFullPath(fileFullPath);
        System.out.println(requestStr);
        return responseStr;
    }
 
}