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
import com.dorjear.ralf.form.agent.FormSearchAgentsRequest;
import com.dorjear.ralf.form.agent.FormSearchAgentsResponse;
import com.dorjear.ralf.form.base.FormRequestBase;
import com.dorjear.ralf.form.base.FormResponseBase;
import com.dorjear.ralf.web.processor.spi.RequestProcessor;

@Component
public class RalfUserSearchProcessor implements RequestProcessor{
	@Autowired
	UserService userService;
	
	@Override
	public FormResponseBase process(FormRequestBase formReq, HttpServletRequest httpReq){
		System.out.println(this.getClass());
		FormSearchAgentsRequest request = (FormSearchAgentsRequest)formReq;
		FormSearchAgentsResponse response = new FormSearchAgentsResponse();
		response.setCmd(request.getCmd());
		List<FormUserNameId> agents = new ArrayList<FormUserNameId>();
		response.setAgents(agents);
		RalfUserSearchCriteria searchInput = new RalfUserSearchCriteria();
		searchInput.setBranch(request.getBranch());
		searchInput.setRoles(request.getRoles());
		
		List<TbRalfUser> searchResult = userService.search(searchInput);
		for(TbRalfUser user : searchResult){
			FormUser formUser = (FormUser) JsonObjectUtil.convertStringToObject(user.getDetail(), FormUser.class.getName());
			FormUserNameId formUserNameId = new FormUserNameId();
			BeanUtils.copyProperties(formUser, formUserNameId);
			agents.add(formUserNameId);
		}
		response.setResponseStatus("success");
 		return response;
	}
}
