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
//		employeesBeanService.delEmployees(1);
		System.out.println(employeesBeanService.findEmployees(2));
//		EmployeesBean e=new EmployeesBean();
//		e.setName("哈哈哈");
//		e.setPhone("111111");
//		e.setState("fs");
//		employeesBeanService.addEmployees(e);
//		CarBeanService.updateCar("dfgfd", 1);
//		CarBean c=new CarBean();
//		c.setPlateNumber("ddd");
//		c.setState("8");
//		CarBeanService.addCar(c);
//		CarBeanService.delCara(1);
//		System.out.println(CarBeanService.find(2).getPlateNumber());
//		CarBeanService.findByItem("4");
	}

	

}
	