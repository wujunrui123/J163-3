package com.lovo.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.lovo.bean.EmployeesBean;

/**
 * 员工业务层
 * @author Administrator
 *
 */
public interface IEmployeesBeanDao {

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
		 public void delEmployees(int id);
		 
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
		 
		 /**
			 * 根据姓名修改人员的状态，派遣时间，返回时间，事件id
			 * @param ThingId 事件id
			 * @param sendData 派遣时间
			 * @param BackDate 返回时间
			 * @param state 状态
			 * @param name 姓名
			 */
			 public void updateState(String ThingId,String sendData,String BackDate,String state,String name);
		 
		 
		 /**
			 * 按事件id查询所有员工集合
			 * @param id
			 * @return 返回员工集合
			 */
			 public List<EmployeesBean> findBitm(int id);
			 
			 /**
			  *  根据转态查询人员集合
			  * @param state
			  * @return
			  */
			 public List<EmployeesBean> findAll();
			 
			 /**
				 * 统计人数
				 * @return 返回总数
				 */
				public int systemEmployees();
}
