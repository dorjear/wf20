package com.dorjear.ralf.web.processor.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.ralf.db.model.RalfUserSearchCriteria;
import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.db.service.UserService;
import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.form.FormUserNameId;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.form.user.FormGetUserNameEmailResponse;
import com.dorjear.ralf.form.user.FormUserIdRequestBase;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;

@Component
public class RalfGetUserNameEmailProcessor implements RequestProcessor{
	@Autowired
	UserService userService;
	
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		FormUserIdRequestBase request = (FormUserIdRequestBase)formReq;
		FormGetUserNameEmailResponse response = new FormGetUserNameEmailResponse();
		TbRalfUser user = userService.getById(request.getUserId());
		if(user!=null){
			response.setFirstName(user.getFirstName());
			response.setMiddleName(user.getMiddleName());
			response.setLastName(user.getLastName());
			response.setEmail(user.getEmail());
		}
		response.setResponseStatus("success");
 		return response;
	}
}
