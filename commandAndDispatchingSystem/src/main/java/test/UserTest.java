package test;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
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
//		System.out.println(user.login("a", "1"));
//		user.addUser(new UserBean("BB", "C", "123", "1", "123"));
//		System.out.println(user.getListUser());
//		Map<String, String> map=new HashMap<String, String>();
//		map.put("sex", "1");
//		System.out.println(user.findByItem(map));
//		System.out.println(user.getUserByUserId(1));
//		user.delUser(1);
		user.updateUser("666", 29);
=======
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
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
	}
}
