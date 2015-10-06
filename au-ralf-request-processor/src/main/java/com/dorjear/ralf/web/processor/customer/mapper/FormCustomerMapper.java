package com.dorjear.ralf.web.processor.customer.mapper;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.base.util.converter.DataConverterUtil;
import com.dorjear.ralf.db.model.TbRalfCustomer;
import com.dorjear.ralf.form.FormCustomer;

@Component
public class FormCustomerMapper{
	
	public static TbRalfCustomer buildModel(FormCustomer formObj){
		TbRalfCustomer model = new TbRalfCustomer();
		model.setCustomerId(formObj.getCustomerId());
		model.setDateOfBirth(DataConverterUtil.convertStringToDate(formObj.getBirthDate()));
		model.setFirstName(formObj.getFirstName());
		model.setMiddleName(formObj.getMiddleName());
		model.setLastName(formObj.getLastName());
		model.setCustomerId(generateCustomerId(formObj));

		model.setDetail(JsonObjectUtil.convertObjectToString(formObj));
		return model;
	}
	
	public static String generateCustomerId(FormCustomer formObj){
		String prefix = formObj.getFirstName().substring(0, 1)+formObj.getLastName().substring(0, 1);
		String serial = ""+new Date().getTime() % 10000;
		return prefix+serial;
	}
}