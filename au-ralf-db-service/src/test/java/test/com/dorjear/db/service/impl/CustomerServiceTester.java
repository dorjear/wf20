package test.com.dorjear.db.service.impl;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.dorjear.base.util.converter.DataConverterUtil;
import com.dorjear.ralf.db.model.TbRalfCustomer;
import com.dorjear.ralf.db.service.CustomerService;
import com.dorjear.ralf.db.service.configuration.DBServiceConfig;

public class CustomerServiceTester {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBServiceConfig.class);

		CustomerService service = (CustomerService) context.getBean("customerService");
		TbRalfCustomer tbCustomer = new TbRalfCustomer();
		tbCustomer.setCustomerId("dorjear");
		tbCustomer.setFirstName("Tony");
		tbCustomer.setLastName("King");
		tbCustomer.setDateOfBirth(DataConverterUtil.convertStringToDate("31/12/1988"));
		service.save(tbCustomer);
		tbCustomer.setCustomerId(null);
		List<TbRalfCustomer> tbCustomerList = service.findByExample(tbCustomer);
		System.out.println(tbCustomerList.get(0).getCreateDate());
		TbRalfCustomer tbCustomer2 = tbCustomerList.get(0);
		service.update(tbCustomer2);
		TbRalfCustomer tbCustomer3 = service.getById("dorjear");
		System.out.println(tbCustomer3.getDateOfBirth());
		service.deleteById("dorjear");
		

		context.close();
	}
}
