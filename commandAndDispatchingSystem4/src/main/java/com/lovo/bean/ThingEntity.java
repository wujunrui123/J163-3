
package com.lovo.bean;

import java.util.List;

/**
 * 事件表
 * 
 * @author Administrator
 *
 */
public class ThingEntity {

	/**
	 * 事件ID（主键）
	 */
	private int thingID;
	/**
	 * 事件编号
	 */
	private String thingCard;
	
	/**
	 * 事件名称
	 */
	private String thingName;
	/**
	 * 事件类型
	 */
	private String thingType;
	/**
	 * 事件等级
	 */
	private String grade;
	/**
	 * 详细地址
	 */
	private String address;
	/**
	 * 伤亡人数
	 */
	private int peopleNum;
	
	/**
	 * 上报人员
	 */
	private String uploadName;
	
	/**
	 * 报警人联系方式
	 */
	private String phone;
	/**
	 * 报警时间
	 */
	private java.sql.Date callDate;
	
	/**
	 * 上报时间
	 */
	private java.sql.Date uploadDate;
	
	/**
	 * 是否上报
	 */
	private String uploadType;
	
	/**
	 * 事件状态
	 */
	private String thingState;
	/**
	 * 报警人员
	 */
	private String callName;
	
	/**
	 * 发生区域
	 */
	private String area;
	/**
	 * 火势情况描述
	 */
	private String freeText;
	/**
	 * 火源名称
	 */
	private String freeName;
	/**
	 * 坍塌面积
	 */
	private String crumArea;
	
	/**
	 * 坍塌原因
	 */
	private String crumText;
	/**
	 * 续报集合
	 */
	private List<ContinueEntity> continueEntityList;
	
	
	public ThingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getThingID() {
		return thingID;
	}
	public void setThingID(int thingID) {
		this.thingID = thingID;
	}
	public String getThingCard() {
		return thingCard;
	}
	public void setThingCard(String thingCard) {
		this.thingCard = thingCard;
	}
	public String getThingName() {
		return thingName;
	}
	public void setThingName(String thingName) {
		this.thingName = thingName;
	}
	public String getThingType() {
		return thingType;
	}
	public void setThingType(String thingType) {
		this.thingType = thingType;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	public String getUploadName() {
		return uploadName;
	}
	public void setUploadName(String uploadName) {
		this.uploadName = uploadName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public java.sql.Date getCallDate() {
		return callDate;
	}
	public void setCallDate(java.sql.Date callDate) {
		this.callDate = callDate;
	}
	public java.sql.Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(java.sql.Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getUploadType() {
		return uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
	public String getThingState() {
		return thingState;
	}
	public void setThingState(String thingState) {
		this.thingState = thingState;
	}
	public String getCallName() {
		return callName;
	}
	public void setCallName(String callName) {
		this.callName = callName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFreeText() {
		return freeText;
	}
	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}
	public String getFreeName() {
		return freeName;
	}
	public void setFreeName(String freeName) {
		this.freeName = freeName;
	}
	public String getCrumArea() {
		return crumArea;
	}
	public void setCrumArea(String crumArea) {
		this.crumArea = crumArea;
	}
	public String getCrumText() {
		return crumText;
	}
	public void setCrumText(String crumText) {
		this.crumText = crumText;
	}
	public List<ContinueEntity> getContinueEntityList() {
		return continueEntityList;
	}
	public void setContinueEntityList(List<ContinueEntity> continueEntityList) {
		this.continueEntityList = continueEntityList;
	}
	
	
	
}