package test.com.dorjear.web.processor.common;
import org.junit.Test;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.ralf.form.FormCodeValueList;


public class LoadListJsonTester {
	
	@Test
	public void testProcess(){
	}
	
	public static void main(String[] args){
		FormCodeValueList a = JsonObjectUtil.loadObjectFromClassPathJsonFile("LoadListJsonTester_CodeValueList", FormCodeValueList.class);
		System.out.println(a.getCodeValueList().get(1).getValue());
	}

}
