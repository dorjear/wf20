package com.dorjear.ralf.web.processor.application.mapper;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.base.util.converter.DataConverterUtil;
import com.dorjear.ralf.db.model.TbRalfApplication;
import com.dorjear.ralf.form.FormApplication;
import com.dorjear.ralf.form.FormCustomer;

@Component
public class FormApplicationMapper{
	
	public static TbRalfApplication buildModel(FormApplication formObj){
		TbRalfApplication model = new TbRalfApplication();
		FormCustomer applicant = formObj.getApplicant();
		model.setApplicationId(formObj.getAppRefNumber());
		model.setDateOfBirth(DataConverterUtil.convertStringToDate(applicant.getBirthDate()));
		model.setFirstName(applicant.getFirstName());
		model.setMiddleName(applicant.getMiddleName());
		model.setLastName(applicant.getLastName());
		model.setApplicationId(generateApplicationId(formObj));

		model.setDetail(JsonObjectUtil.convertObjectToString(formObj));
		return model;
	}
	
	public static String generateApplicationId(FormApplication formObj){
		String prefix = formObj.getApplicant().getFirstName().substring(0, 1)+formObj.getApplicant().getLastName().substring(0, 1);
		String serial = ""+new Date().getTime() % 1000000;
		return prefix+serial;
	}
}