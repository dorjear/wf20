package test.com.dorjear.web.processor.common;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.ralf.form.FormCustomer;

public class SampleJsonGenerator {

	public static void main(String[] args) {
		String jsonStr = JsonObjectUtil.generateSampleData(FormCustomer.class);
		System.out.println(jsonStr);
	}

}
