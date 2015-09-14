package com.hsbc.multiapp.wf.web.common.configuration;
 
import java.util.Map;

import com.hsbc.au.base.cvs.util.CSVUtil;
 
public class CmdConfig {
    public static final String FORM_REQUEST_BASE = "com.hsbc.au.multiapp.ralf.form.request.FormRequestBase";
	private static Map<String, String> cmdRequestMap;
    private static Map<String, String> cmdProcessorMap;
    public static String getRequestClass(String cmd) {
        return cmdRequestMap.get(cmd);
    }
    public static String getRequestProcessor(String cmd) {
        return cmdProcessorMap.get(cmd);
    }
    
    static{
    	System.out.println("init CmdConfig");
    	cmdRequestMap = CSVUtil.buildStringMapFromCvsClasspath("CmdConfig.csv", 0, 1);
    	cmdProcessorMap = CSVUtil.buildStringMapFromCvsClasspath("CmdConfig.csv", 0, 2);
    }
}