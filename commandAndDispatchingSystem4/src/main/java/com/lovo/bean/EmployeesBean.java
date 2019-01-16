package com.lovo.bean;

/**
 * 库存人员
 * @author Administrator
 *
 */
public class EmployeesBean {
	/** 人员id */
	private Integer inventoriesId;
	/** 人员姓名 */
	private String name;
	/** 人员电话 */
	private String phone;
	/** 出勤状态 */
	private String state;
	public Integer getInventoriesId() {
		return inventoriesId;
	}
	public void setInventoriesId(Integer inventoriesId) {
		this.inventoriesId = inventoriesId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
