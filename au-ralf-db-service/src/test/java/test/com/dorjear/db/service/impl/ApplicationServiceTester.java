package test.com.dorjear.db.service.impl;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.dorjear.base.util.converter.DataConverterUtil;
import com.dorjear.ralf.db.model.TbRalfApplication;
import com.dorjear.ralf.db.service.ApplicationService;
import com.dorjear.ralf.db.service.configuration.DBServiceConfig;

public class ApplicationServiceTester {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBServiceConfig.class);

		ApplicationService service = (ApplicationService) context.getBean("applicationService");
		TbRalfApplication tbApplication = new TbRalfApplication();
		tbApplication.setApplicationId("dorjear");
		tbApplication.setFirstName("Tony");
		tbApplication.setLastName("King");
		tbApplication.setDateOfBirth(DataConverterUtil.convertStringToDate("31/12/1988"));
		service.save(tbApplication);
		tbApplication.setApplicationId(null);
		List<TbRalfApplication> tbApplicationList = service.findByExample(tbApplication);
		System.out.println(tbApplicationList.get(0).getCreateDate());
		TbRalfApplication tbApplication2 = tbApplicationList.get(0);
		service.update(tbApplication2);
		TbRalfApplication tbApplication3 = service.getById("dorjear");
		System.out.println(tbApplication3.getDateOfBirth());
		service.deleteById("dorjear");
		

		context.close();
	}
}