package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovo.bean.EmployeesBean;
import com.lovo.service.IEmployeesBeanService;

@Controller
public class EmployeesController {

	 @Autowired
	 private IEmployeesBeanService employeesBeanService;
	 /**
	  * 获取可派遣的员工
	  * @return
	  */
	 @RequestMapping("findPerson.lovo")
	 @ResponseBody
	 public  List<EmployeesBean> findPerson() {
		 List<EmployeesBean> list = employeesBeanService.findAll();
		 return list;
	 }
	 
	 @RequestMapping("findEmployeesList.lovo")
	 @ResponseBody
	 public List<EmployeesBean> findEmployeesList(String name){
		 List<EmployeesBean> list = employeesBeanService.findByItem(name);
		
		 return list;
	 }
	 
	 /**
	  * 修改人员
	  * @param plateNumber
	  * @param id
	  * @return
	  */
	 @RequestMapping("UpdateEmployees.lovo")
	 @ResponseBody
	 public String UpdateEmployees(String phone,String name ) {
		 
		 employeesBeanService.updateEmployees(phone, name);
		 
		 return "0";
	 }
	 
	 @RequestMapping("AddEmployees.lovo")
	 @ResponseBody
	 public String AddEmployees(String phone,String name,String state ) {
		 EmployeesBean e=new EmployeesBean();
		 e.setName(name);
		 e.setPhone(phone);
		 e.setState(state);
		 employeesBeanService.addEmployees(e);
		 
		 return "0";
	 }
}
