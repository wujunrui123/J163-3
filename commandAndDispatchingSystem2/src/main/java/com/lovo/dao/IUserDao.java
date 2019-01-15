package com.lovo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lovo.bean.UserBean;


 public interface IUserDao {
    /**
     * 获取所用用户
     * @return
     */
	public List<UserBean> getListUser();
	/**
	 * 根据用户ID获取用户详细信息
	 * @param userId
	 * @return
	 */
	public UserBean getUserByUserId(int userId);	
	/**
	 * 登录，
	 * @param userName
	 * @param password
	 * @return 用户对象
	 */
	public UserBean login(String userName,String password);
}
