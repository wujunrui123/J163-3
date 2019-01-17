package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.service.IUserService;

public class UserTest {

	// 启动spring
	ClassPathXmlApplicationContext app = null;
	IUserService userService = null;

	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (IUserService) app.getBean("userService");
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
		System.out.println(userService.getUserByUserId(1));
	}
}
