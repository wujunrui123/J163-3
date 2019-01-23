
package com.lovo.bean;


/**
 * 续报表
 * @author 吴俊锐
 *
 */
public class ContinueEntity {
/**
 * 	主键ID
 */
private int id;

/**
 * 等级
 */
private String grade;
/**
 * 伤亡人数
 */
private int peopleNum;
/**
 * 上报人员
 */
private String uploadName;
/**
 * 报警人员
 */
private String callName;
/**
 * 报警人员电话
 */
private String callphone;
/**
 * 上报时间
 */
private java.sql.Date uploadDate;
/**
 * 事件类
 */
private ThingEntity thingEntity;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
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
public String getCallName() {
	return callName;
}
public void setCallName(String callName) {
	this.callName = callName;
}
public String getCallphone() {
	return callphone;
}
public void setCallphone(String callphone) {
	this.callphone = callphone;
}
public java.sql.Date getUploadDate() {
	return uploadDate;
}
public void setUploadDate(java.sql.Date uploadDate) {
	this.uploadDate = uploadDate;
}

public ThingEntity getThingEntity() {
	return thingEntity;
}
public void setThingEntity(ThingEntity thingEntity) {
	this.thingEntity = thingEntity;
}
public ContinueEntity() {
	super();
	// TODO Auto-generated constructor stub
}



}