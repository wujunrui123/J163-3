package com.lovo.bean;

import java.util.List;

/**
 * 事件实体
 * @author Administrator
 *
 */
public class TheeventBean {
/** 事件id*/
	private Integer messageId;
	/**事件名称*/
	private String eventName;
	/**事件状态*/
	private String area;

	/**事件类型*/
	private String type;
	/**事件地址*/
	private String site;
	/**调度人员数量*/
	private Integer numberpeople;
	/**调度车辆数量*/
	private int arnumber;
	/**
	 * 车辆集合
	 */
	private List<CarBean> carbean;
	/**人员集合*/
	private List<EmployeesBean> employeesBean;
	
	public List<CarBean> getCarbean() {
		return carbean;
	}
	public void setCarbean(List<CarBean> carbean) {
		this.carbean = carbean;
	}
	public List<EmployeesBean> getEmployeesBean() {
		return employeesBean;
	}
	public void setEmployeesBean(List<EmployeesBean> employeesBean) {
		this.employeesBean = employeesBean;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public Integer getNumberpeople() {
		return numberpeople;
	}
	public void setNumberpeople(Integer numberpeople) {
		this.numberpeople = numberpeople;
	}
	public int getArnumber() {
		return arnumber;
	}
	public void setArnumber(int arnumber) {
		this.arnumber = arnumber;
	}
}
