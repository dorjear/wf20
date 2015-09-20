package test.com.dorjear.db.service.impl;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.db.service.UserService;
import com.dorjear.ralf.db.service.configuration.DBServiceConfig;

public class UserServiceTester {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBServiceConfig.class);

		UserService service = (UserService) context.getBean("userService");
		TbRalfUser tbUser = new TbRalfUser();
		tbUser.setUserId("dorjear");
		tbUser.setFirstName("Tony");
		tbUser.setLastName("King");
		service.save(tbUser);
		tbUser.setUserId(null);
		List<TbRalfUser> tbUserList = service.findByExample(tbUser);
		System.out.println(tbUserList.get(0).getCreateDate());
		TbRalfUser user2 = tbUserList.get(0);
		user2.setEmail("tony@king.com");
		service.update(user2);
		TbRalfUser user3 = service.getById("dorjear");
		System.out.println(user3.getEmail());
		service.deleteById("dorjear");
		

		context.close();
	}
}
