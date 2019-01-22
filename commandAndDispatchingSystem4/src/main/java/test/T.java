package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.bean.CarBean;
import com.lovo.bean.EmployeesBean;
import com.lovo.bean.StatisticalBean;
import com.lovo.bean.TheeventBean;
import com.lovo.service.ICarService;
import com.lovo.service.IEmployeesBeanService;
import com.lovo.service.IStatisticalBeanService;
import com.lovo.service.ITheeventBeanService;

public class T {                              
	ClassPathXmlApplicationContext app = null;
	ICarService CarBeanService=null;
	IEmployeesBeanService employeesBeanService=null;
	ITheeventBeanService theevent=null;
	IStatisticalBeanService statisticalBeanService=null;
	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("jbdca.xml");
		CarBeanService = (ICarService) app.getBean("carService");
		employeesBeanService = (IEmployeesBeanService) app.getBean("employeesBeanService");
		theevent=(ITheeventBeanService) app.getBean("theeventBeanService");
		statisticalBeanService=(IStatisticalBeanService) app.getBean("statisticalBeanService");
	}

	@Test
	public void test() {
//		employeesBeanService.updateEmployees( "5555",1);
//		employeesBeanService.updateState("66666", "哈哈哈");
//		employeesBeanService.delEmployees(1);
//		System.out.println(employeesBeanService.findEmployees(2));
//		EmployeesBean e=new EmployeesBean();
//		e.setThingId(1255);
//		e.setName("哈哈哈");
//		e.setPhone("111111");
//		e.setState("fs");
//		e.setBackDate("2017-03-02");
//		e.setSendData("2000-02");
//		employeesBeanService.addEmployees(e);
//		System.out.println(employeesBeanService.findByItem("1"));
//		System.out.println(employeesBeanService.findAll());
//	int i=	employeesBeanService.systemEmployees();
//	int ss = CarBeanService.systemCar();
//		CarBeanService.updateCar("dfgfd", 1);
//		CarBeanService.updateState("58", "201-03-05", "2017-05-09", "出勤", "川Q123");
//		CarBean c=new CarBean();
//		c.setThingId(6666);
//		c.setPlateNumber("ddd");
//		c.setState("20");
//		c.setBackDate("2017-03-03");
//		c.setSendData("2017-03-03");
//		CarBeanService.addCar(c);
//		CarBeanService.delCara(1);
//		System.out.println(CarBeanService.find(2).getPlateNumber());
		System.out.println(CarBeanService.findByItem("出勤"));
//		System.out.println(CarBeanService.findAll());
//		System.out.println(CarBeanService.systemCar());
		
		
//		TheeventBean t=new TheeventBean();
//		t.setEventName("555");
//		t.setArea("555");
//		t.setArnumber(1);
//		t.setNumberpeople(2);
//		t.setSite("sdfs");
//		t.setType("5");
//		theevent.addTheevent(t);
//		theevent.updateTheevent("3", 1);
//		List<TheeventBean> list = theevent.findBitm(null, null, null);
//		for (TheeventBean theeventBean : list) {
//			System.out.println(theeventBean.getEventName());
//		}
//		StatisticalBean s=new StatisticalBean();
//		s.setTotalCar(ss);
//		s.setTotalPerson(i);
//		
//		statisticalBeanService.addStatistical(s);
//		statisticalBeanService.updateStatistical(1, 1, 5);
		
	}
	@Test
	public void findById() {
		System.out.println(theevent.findById(1));
	}
}
	