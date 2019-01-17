package com.lovo.test;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.lovo.bean.ThingEntity;
import com.lovo.service.IThingService;



public class MybatisT {
	ClassPathXmlApplicationContext app=null;
	
	@Before
	public void before() {
		app=new ClassPathXmlApplicationContext("jbdca.xml");
	}
	
	//@Test
	public void test() {
		IThingService is=(IThingService) app.getBean("thingService");
		ThingEntity thingEntity=is.findById(1);
		System.out.println(thingEntity.toString());
	}
	
	
	//@Test
	public void test2() {
		PageHelper.startPage(2, 2);
		IThingService is=(IThingService) app.getBean("thingService");
		Map<String, Object>map=new HashMap<String,Object>();
		map.put("thingName", "火灾");
		map.put("area", null);
		map.put("startDate", null);
		map.put("endDate", null);
		map.put("thingType", null);
		map.put("thingState", null);
		
		List<ThingEntity>list=is.find(map);
		for (ThingEntity thingEntity : list) {
			System.out.println(thingEntity);
		}	
	}
	/*测试添加*/
	//@Test
	public void test3() {
		ThingEntity thingEntity=new ThingEntity();
		thingEntity.setAddress("桐梓林56号");
		thingEntity.setArea("高新区");
		thingEntity.setCallDate("2019-01-01 17:09:34");
		thingEntity.setCallName("赵六");
		thingEntity.setFreeName("雷电");
		IThingService is=(IThingService) app.getBean("thingService");
		is.addThing(thingEntity);
	}
	
	/*事件修改测试*/
	//@Test
	public void test4() {
		
		IThingService is=(IThingService) app.getBean("thingService");
		is.updateThingTwo(1, "是");
	}
	
	/*测试删除*/
	@Test
	public void test5() {
		
		IThingService is=(IThingService) app.getBean("thingService");
		is.del(5);
	}
	
	
}
