package com.dorjear.ralf.web.processor.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.db.service.UserService;
import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.form.user.FormUserIdRequestBase;
import com.dorjear.ralf.form.user.FormUserRespBase;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;

@Component
public class RalfLoadUserProcessor implements RequestProcessor{
	@Autowired
	UserService userService;
	
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		FormUserIdRequestBase request = (FormUserIdRequestBase)formReq;
		FormUserRespBase response = new FormUserRespBase();
		TbRalfUser user = userService.getById(request.getUserId());
		FormUser formObj = (FormUser) JsonObjectUtil.convertStringToObject(user.getDetail(), FormUser.class.getName());
		response.setUser(formObj);
		response.setResponseStatus("success");
 		return response;
	}
}
