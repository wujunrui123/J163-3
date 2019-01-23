package com.lovo.bean;

import java.util.List;

public class TheeventJsonBean {
  
	/**调度编号*/
	private String Theeventnumber;
	/**负责人*/
	private String head;
	/**车辆集合*/
	private List<CarBean> car;
	/**人员集合*/
	private List<EmployeesBean> employees;
	public String getTheeventnumber() {
		return Theeventnumber;
	}
	public void setTheeventnumber(String theeventnumber) {
		Theeventnumber = theeventnumber;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public List<CarBean> getCar() {
		return car;
	}
	public void setCar(List<CarBean> car) {
		this.car = car;
	}
	public List<EmployeesBean> getEmployees() {
		return employees;
	}
	public void setEmployees(List<EmployeesBean> employees) {
		this.employees = employees;
	}
	
}
