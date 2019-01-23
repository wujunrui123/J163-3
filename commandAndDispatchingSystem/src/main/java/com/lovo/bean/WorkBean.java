<<<<<<< HEAD
package com.lovo.bean;

import java.io.Serializable;

public class WorkBean implements Serializable{
	private int workID;
	private String startDate;
	private String endDate;
	private String userName;
	private String log;
	public int getWorkID() {
		return workID;
	}
	public void setWorkID(int workID) {
		this.workID = workID;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public WorkBean(String startDate, String endDate, String userName, String log) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.userName = userName;
		this.log = log;
	}
	public WorkBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
=======

package com.lovo.bean;
public class WorkBean {
private int workID;
private java.sql.Date startDate;
private java.sql.Date endDate;
private String userName;
private String phone;
private String month;
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
}