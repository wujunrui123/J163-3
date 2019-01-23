package com.lovo.dao;

import java.util.List;
<<<<<<< HEAD
import java.util.Map;

import com.lovo.bean.UserBean;


 public interface IUserDao {
	 public void addUser(UserBean user);
	 
	 public void delUser(int userId);
	 
	 public void updateUser(String password,int userID);
	 
    
	public List<UserBean> getListUser();
	/**
	 * 根据用户ID获取用户详细信息
	 * @param userId
	 * @return
	 */
	public UserBean getUserByUserId(int userID);	
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return 用户对象
	 */
	public UserBean login(String userName,String password);
	
	public List<UserBean> findByItem(Map<String, String> map);
=======

import com.lovo.bean.UserBean;


 public interface IUserDao {
	 public void addUser(UserBean user);
	 
	 public void delUser(int userId);
	 
	 public void updateUser(String phone,String password,String roleEntity,int userID);
	 
    
	public List<UserBean> getListUser();
	/**
	 * 根据用户ID获取用户详细信息
	 * @param userId
	 * @return
	 */
	public UserBean getUserByUserId(int userID);	
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return 用户对象
	 */
	public UserBean login(String userName,String password);
	
	public List<UserBean> findByItem(String sex,String name);
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
	
	
}
