package com.hsbc.au.base.cvs.util;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;


public class CSVUtil {
	
	public static Map<String, String> buildStringMapFromCvsClasspath(String fileName, int keyColumnIndex, int valueColumnIndex){
		
	    Map<String,String> map = new HashMap<String, String>();
		try {
			URL url = CSVUtil.class.getClassLoader().getResource(fileName);
			if(url == null) return map;
			File file=new File(url.getFile());
			List<String> lines = FileUtils.readLines(file);
		    for(String line : lines){
		        String strArray[] = line.split(",");
		        if(strArray.length>keyColumnIndex && strArray.length>valueColumnIndex){
		        	map.put(strArray[keyColumnIndex], strArray[valueColumnIndex]);
		        }
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    System.out.println(map);
	    return map;
	}
	

}
