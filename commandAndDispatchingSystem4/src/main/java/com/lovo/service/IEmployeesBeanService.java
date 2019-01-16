package com.lovo.service;


import java.util.List;

import com.lovo.bean.EmployeesBean;

/**
 * 员工业务层
 * @author Administrator
 *
 */
public interface IEmployeesBeanService {


	  /**
	   * 添加员工
	   * @param car 车辆实体
	   */
		 public void addEmployees(EmployeesBean Employees);
		/**
		 * 根据员工id修改员工信息
		 * @param id 员工id
		 * @param phone 电话
		 */
		 public void updateEmployees(String phone,int  id);
		/**
		 * 根据id删除员工
		 * @param id
		 */
		 public void delEmployees(int  id);
		 
		 /**
		  * 根据id查询员工
		  * @param id 车辆id
		  * @return 返回实体
		  */
		 public EmployeesBean findEmployees(int id);
		 /**
		  * 根据姓名动态查询员工信息
		  * @param name 员工姓名
		  * @return 员工集合
		  */
		 public List<EmployeesBean> findByItem(String name );
}