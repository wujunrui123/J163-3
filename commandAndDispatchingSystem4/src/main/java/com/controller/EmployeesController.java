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
}
