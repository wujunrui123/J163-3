package com.lovo.bean;

import java.io.Serializable;

/**
 * 用户表
 * @author Administrator
 *
 */
public class UserBean implements Serializable{

	/**
	 * 用户ID（主键）
	 */
	private int userID;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 用户名
	 */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别
     */
    private String sex;
    /**
     * 联系方式
     */
    private String phone;
    
    /**
     * 职位对象
     */
    private RoleEntity roleEntity;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public RoleEntity getRoleEntity() {
		return roleEntity;
	}

	public void setRoleEntity(RoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(String name, String userName, String password, String sex, String phone) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.phone = phone;
	}
    
    
    
	
	
	
}
