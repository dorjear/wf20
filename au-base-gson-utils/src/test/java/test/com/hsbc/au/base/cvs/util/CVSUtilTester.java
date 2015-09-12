package test.com.hsbc.au.base.cvs.util;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

import com.hsbc.au.base.cvs.util.CSVUtil;


public class CVSUtilTester {
	
	@Test
	public void testBuildStringMapFromCvsClasspath(){
		String fileName="CSVUtilTest.csv";
		String fileNameEmpty="CSVUtilTest_empty.csv";
		int keyColumnIndex = 0;
		int valueColumnIndex = 1;
	    Map<String,String> map = CSVUtil.buildStringMapFromCvsClasspath(fileName, keyColumnIndex, valueColumnIndex);
		Assert.assertEquals("250", map.get("peanut butter"));

		map = CSVUtil.buildStringMapFromCvsClasspath(fileName, keyColumnIndex+5, valueColumnIndex);
		Assert.assertEquals(0, map.keySet().size());

		map = CSVUtil.buildStringMapFromCvsClasspath(fileName+"a", keyColumnIndex, valueColumnIndex);
		Assert.assertEquals(0, map.keySet().size());
		
		map = CSVUtil.buildStringMapFromCvsClasspath(fileNameEmpty, keyColumnIndex, valueColumnIndex);
		Assert.assertEquals(0, map.keySet().size());
	}
	
	public static void main(String[] args){
		CVSUtilTester tester = new CVSUtilTester();
		tester.testBuildStringMapFromCvsClasspath();
	}

}
