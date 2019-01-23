package test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.bean.WorkBean;
import com.lovo.service.IUserService;
import com.lovo.service.IWorkService;

public class WorkTest {
	ClassPathXmlApplicationContext app=null;
	@Before
	public void before() {
		app=new ClassPathXmlApplicationContext("jbdca.xml");
	}

	@Test
	public void testwork() {
		IWorkService work=(IWorkService) app.getBean("workService");
//		work.addWork(new WorkBean("2018-01-01", "2018-02-01", "AB", "123456123"));
//		work.delWork(1);
//		System.out.println(work.findById(1));
//		System.out.println(work.findAll());
//		Map<String, Object> map=new HashMap<String,Object>();
//		map.put("startDateStart", Date.valueOf("2018-12-30"));
//		map.put("startDateEnd", null);
//		map.put("userName", null);
//		System.out.println(work.findByItem(map));
//		work.writeLog("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2);
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		String endDate=s.format(new java.util.Date());
		System.out.println(work.findByEndTime(endDate));
	}
}
