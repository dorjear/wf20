package com.hsbc.au.web.processor.util;


public class DemoResponseUtil{
	private static String webRoot="";
	private static final String DEMO_FILE_EXTENSION=".txt";
	private static final String DEMO_FILE_FOLDER="jsonTest/json/response/";
	
	public static String getFullPath(String fileName){
    	String fileFullPath = webRoot+DEMO_FILE_FOLDER+fileName+DEMO_FILE_EXTENSION;
    	return fileFullPath;
	}
	
	public static void setWebRoot(String path){
		webRoot = path;
	}
	
	public static String getWebRoot(){
		return webRoot;
	}
}
