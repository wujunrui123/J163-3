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
	
}