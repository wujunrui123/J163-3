
package com.lovo.bean;


/**
 * 值班表
 * @author Administrator
 *
 */
public class WorkEntity {
	/**
	 * 值班主键
	 */
private int workID;
/**
 * 起始时间
 */
private java.sql.Date startDate;
/**
 * 结束时间
 */
private java.sql.Date endDate;
/**
 * 交接人员
 */
private String userName;
/**
 * 联系方式
 */
private String phone;
/**
 * 月份
 */
private String month;
public int getWorkID() {
	return workID;
}
public void setWorkID(int workID) {
	this.workID = workID;
}
public java.sql.Date getStartDate() {
	return startDate;
}
public void setStartDate(java.sql.Date startDate) {
	this.startDate = startDate;
}
public java.sql.Date getEndDate() {
	return endDate;
}
public void setEndDate(java.sql.Date endDate) {
	this.endDate = endDate;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public WorkEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}