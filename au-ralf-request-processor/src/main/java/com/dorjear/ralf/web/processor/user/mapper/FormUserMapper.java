package com.dorjear.ralf.web.processor.user.mapper;

import org.springframework.stereotype.Component;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.base.util.converter.DataConverterUtil;
import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.web.processor.util.WFConstants;

@Component
public class FormUserMapper{
	
	public static TbRalfUser buildModel(FormUser formObj){
		TbRalfUser model = new TbRalfUser();
		model.setBranches(DataConverterUtil.convertArrayToDelimString(formObj.getBranches(), WFConstants.DELIM));
		model.setEmail(formObj.getEmail());
		model.setFirstName(formObj.getFirstName());
		model.setMiddleName(formObj.getMiddleName());
		model.setLastName(formObj.getLastName());
		model.setPassword(formObj.getPasword());
		model.setPrimaryBranch(formObj.getPrimaryBranch());
		model.setDetail(JsonObjectUtil.convertObjectToString(formObj));
		return model;
	}
}
