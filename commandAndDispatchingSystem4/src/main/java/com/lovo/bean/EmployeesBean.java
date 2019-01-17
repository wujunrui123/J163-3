package com.lovo.bean;

import java.util.List;

/**
 * 库存人员
 * @author Administrator
 *
 */
public class EmployeesBean {
	/** 人员id */
	private Integer inventoriesId;
	
	/**事件id*/
	private Integer ThingId;
	/** 人员姓名 */
	private String name;
	/** 人员电话 */
	private String phone;
	/** 出勤状态 */
	private String state;
	
	/**
	 * 派遣时间
	 */
	private String  sendData;
	/**归队时间*/
	private String BackDate;
	/**事件集合*/
	private List<TheeventBean> Theevent;
	public List<TheeventBean> getTheevent() {
		return Theevent;
	}
	public void setTheevent(List<TheeventBean> theevent) {
		Theevent = theevent;
	}
	public Integer getThingId() {
		return ThingId;
	}
	public void setThingId(Integer thingId) {
		ThingId = thingId;
	}
	public String getSendData() {
		return sendData;
	}
	public void setSendData(String sendData) {
		this.sendData = sendData;
	}
	public String getBackDate() {
		return BackDate;
	}
	public void setBackDate(String backDate) {
		BackDate = backDate;
	}
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
