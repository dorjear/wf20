package com.dorjear.ralf.web.processor.logonoff;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dorjear.base.gson.util.JsonObjectUtil;
import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.db.service.UserService;
import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.form.logonoff.FormLogonRequest;
import com.dorjear.ralf.form.logonoff.FormLogonResponse;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;

@Component
public class RalfLogonProcessor implements RequestProcessor{
	@Autowired
	UserService userService;
	
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		System.out.println(this.getClass());
		FormLogonRequest request = (FormLogonRequest)formReq;
		FormLogonResponse response = new FormLogonResponse();
		response.setCmd(request.getCmd());

		TbRalfUser user = userService.getById(request.getUserId());
		if(user==null){
			response.setResponseStatus("error");
			response.setErrorCode("NO_USER");
			return response;
		}
		if(!request.getPassword().equals(user.getPassword())){
			response.setResponseStatus("error");
			response.setErrorCode("PASSWORD_WRONG");
			return response;
		}
		FormUser formUser= (FormUser) JsonObjectUtil.convertStringToObject(user.getDetail(), FormUser.class.getName());
		httpReq.getSession().setAttribute("logonUser", formUser);
		response.setUser(formUser);
		response.setResponseStatus("success");
 		return response;
	}
}
