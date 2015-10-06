package com.dorjear.ralf.web.processor.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dorjear.ralf.db.model.TbRalfApplication;
import com.dorjear.ralf.db.model.TbRalfCustomer;
import com.dorjear.ralf.db.service.ApplicationService;
import com.dorjear.ralf.db.service.CustomerService;
import com.dorjear.ralf.form.FormCustomer;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.form.lead.FormAddLeadRequest;
import com.dorjear.ralf.web.processor.application.mapper.FormApplicationMapper;
import com.dorjear.ralf.web.processor.customer.mapper.FormCustomerMapper;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;

@Component
public class RalfAddLeadProcessor implements RequestProcessor{
	@Autowired
	CustomerService customerService;
	@Autowired
	ApplicationService applicationService;
	
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		System.out.println(this.getClass());
		FormAddLeadRequest request = (FormAddLeadRequest)formReq;
		FormCustomer formCustomer = request.getLead().getApplicant();
		TbRalfCustomer modelCustomer = FormCustomerMapper.buildModel(formCustomer);
		TbRalfApplication modelApplication = FormApplicationMapper.buildModel(request.getLead());
		customerService.save(modelCustomer);
		applicationService.save(modelApplication);


		FormResponseBase response = new FormResponseBase();
		response.setCmd(request.getCmd());
		response.setResponseStatus("success");
 		return response;
	}
}