package com.lovo.test;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.lovo.bean.CommonEntity;
import com.lovo.bean.ThingEntity;
import com.lovo.service.ICommonService;
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
	
	
	@Test
	public void test2() {
		PageHelper.startPage(1, 2);
		ICommonService is=(ICommonService) app.getBean("commonService");
		/*CommonEntity con=is.findById(1);
		
		System.out.println(con.toString());*/
		
		List<CommonEntity>list=is.findByType("类型");
		for (CommonEntity commonEntity : list) {
			System.out.println(commonEntity.toString());
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
	//@Test
	public void test5() {
		
		IThingService is=(IThingService) app.getBean("thingService");
		is.del(5);
	}
	
	
}
