package com.dorjear.ralf.web.processor.logonoff;

import java.util.List;

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
		
		TbRalfUser example = new TbRalfUser();
		example.setUserId(request.getUserId());
		example.setPassword(request.getPassword());
		List<TbRalfUser> users = userService.findByExample(example);
		if(users.size()==0){
			response.setResponseStatus("error");
			response.setErrorCode("logonfail");
			return response;
		}
		FormUser formUser= (FormUser) JsonObjectUtil.convertStringToObject(users.get(0).getDetail(), FormUser.class.getName());
		httpReq.getSession().setAttribute("logonUser", formUser);
		response.setUser(formUser);
		response.setResponseStatus("success");
 		return response;
	}
}
