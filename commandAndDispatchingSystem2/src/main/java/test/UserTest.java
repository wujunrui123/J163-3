package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.bean.DTOBean2;
import com.lovo.service.IResourcesService;
import com.lovo.service.IUserService;

public class UserTest {

	// 启动spring
	ClassPathXmlApplicationContext app = null;
	IUserService userService = null;
	IResourcesService ir=null;

	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (IUserService) app.getBean("userService");
		ir = (IResourcesService) app.getBean("resourcesService");
	}
	
	@Test
	public void updateUserInfoByUserId() {
		userService.updateUserInfoByUserId("123", "111", 1);
	}
	@Test
	public void updatePasswordByUserId() {
		userService.updatePasswordByUserId("111", 1);
	}
	@Test
	public void login() {
		System.out.println(userService.login("aa", "11"));
	}
	
	@Test
	public void getUserByUserId() {
		DTOBean2 d=ir.findNumByEveid(1, "医院");
	   System.out.println(d.getCar()+"/"+d.getPro());
	}
	
	
}
