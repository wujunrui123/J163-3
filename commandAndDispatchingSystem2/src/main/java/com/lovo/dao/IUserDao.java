package com.lovo.dao;

import java.util.List;

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
	/**
	 * 根据用户id修改用户电话、邮箱
	 * @param tel 电话
	 * @param emil 邮箱
	 * @param id 用户id
	 */
	public void updateUserInfoByUserId(String tel, String emil, int id);
	/**
	 * 根据用户id修改密码
	 * @param password
	 * @param id
	 */
	public void updatePasswordByUserId(String password, int id);
}
