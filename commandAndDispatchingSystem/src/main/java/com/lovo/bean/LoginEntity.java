
package com.lovo.bean;


/**
 * 日志表
 * @author Administrator
 *
 */
public class LoginEntity {
	/**
	 * 日志主键
	 */
private int loginID;

/**
 * 交班人员
 */
private String userName;

/**
 * 日志
 */
private String login;

/**
 * 提交日期
 */
private java.sql.Date loginDate;

public int getLoginID() {
	return loginID;
}

public void setLoginID(int loginID) {
	this.loginID = loginID;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public java.sql.Date getLoginDate() {
	return loginDate;
}

public void setLoginDate(java.sql.Date loginDate) {
	this.loginDate = loginDate;
}

public LoginEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}