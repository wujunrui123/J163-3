package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.bean.UserBean;
import com.lovo.service.IUserService;

public class UserTest {
	ClassPathXmlApplicationContext app=null;
	@Before
	public void before() {
		app=new ClassPathXmlApplicationContext("jbdca.xml");
	}
	@Test
	public void test() {
		IUserService user=(IUserService) app.getBean("userService");
//		System.out.println(user.login("AAA", "BBB"));
//		user.addUser(new UserBean("BB", "C", "123", "1", "123"));
//		System.out.println(user.getListUser());
//		System.out.println(user.findByItem(null,"B"));
//		System.out.println(user.getUserByUserId(1));
//		user.delUser(1);
	}
}
