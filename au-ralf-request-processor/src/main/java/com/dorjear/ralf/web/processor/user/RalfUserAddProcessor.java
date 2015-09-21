package com.dorjear.ralf.web.processor.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.db.service.UserService;
import com.dorjear.ralf.form.FormUser;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.form.user.FormUserRequestBase;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;
import com.dorjear.ralf.web.processor.user.mapper.FormUserMapper;

@Component
public class RalfUserAddProcessor implements RequestProcessor{
	@Autowired
	UserService userService;
	
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		System.out.println(this.getClass());
		FormUserRequestBase request = (FormUserRequestBase)formReq;
		FormUser formUser = request.getUser();
		TbRalfUser model = FormUserMapper.buildModel(formUser);
		userService.save(model);


		FormResponseBase response = new FormResponseBase();
		response.setCmd(request.getCmd());
		response.setResponseStatus("success");
 		return response;
	}
}
