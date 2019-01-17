package com.lovo.bean;
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
	/**事件等级*/
	private Integer level;
	/**事件类型*/
	private Integer type;
	/**事件地址*/
	private String address;
	/**调度人员数量*/
	private Integer numberpeople;
	/**调度车辆数量*/
	private int arnumber;
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
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
