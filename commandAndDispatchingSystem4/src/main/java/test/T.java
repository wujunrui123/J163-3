package test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.bean.CarBean;
import com.lovo.bean.EmployeesBean;
import com.lovo.service.ICarBeanService;
import com.lovo.service.IEmployeesBeanService;



public class T {
	ClassPathXmlApplicationContext app = null;
//	ICarBeanService CarBeanService=null;
	IEmployeesBeanService employeesBeanService=null;
	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("jbdca.xml");
//		CarBeanService = (ICarBeanService) app.getBean("carBeanService");
		employeesBeanService = (IEmployeesBeanService) app.getBean("employeesBeanService");
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
//		
//		e.setBackDate("2017-03-02");
//		e.setSendData("2000-02");
//		employeesBeanService.addEmployees(e);
//		CarBeanService.updateCar("dfgfd", 1);
//		CarBeanService.updateState("66666", "8");
//		CarBean c=new CarBean();
//		c.setThingId(6666);
//		c.setPlateNumber("ddd");
//		c.setState("20");
//		c.setBackDate("2017-03-03");
//		c.setSendData("2017-03-03");
//		CarBeanService.addCar(c);
//		CarBeanService.delCara(1);
//		System.out.println(CarBeanService.find(2).getPlateNumber());
//		CarBeanService.findByItem("4");
	}

	

}
	