package com.lovo.service;

import java.util.List;

import com.lovo.bean.UserBean;


public interface IUserService {
	/**
	 * 查询用户信息
	 * @param userId 用户id
	 * @return 用户对象
	 */
	public UserBean getUserByUserId(int userId) ;
    /**
     * 获取所用用户
     * @return
     */
	public List<UserBean> getListUser();
	/**
	 * 获取角色不拥有的用户
	 * @param listAll
	 * @param listRoleUser
	 * @return
	 */
	public List<UserBean> getUNListUserByRole(List<UserBean> listAll,List<UserBean> listRoleUser);
	/**
	 * 登录，
	 * @param userName
	 * @param password
	 * @return 用户对象
	 */
	public UserBean login(String userName,String password);
	/**
	 * 添加用户
	 * @param user
	 */
	public  void addUser(UserBean user);
	/**
	 * 删除用户
	 * @param user
	 */
	public void delUser(UserBean user);
	/**
	 * 修改用户信息
	 * @param user
	 */
	public void update(UserBean user);
	
}
