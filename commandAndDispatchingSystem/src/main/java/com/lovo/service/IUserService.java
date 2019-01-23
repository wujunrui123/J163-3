package com.lovo.service;

import java.util.List;
import java.util.Map;

import com.lovo.bean.UserBean;


public interface IUserService {
	 public void addUser(UserBean user);
	 
	 public void delUser(int userId);
	 
	 public void updateUser(String password,int userID);
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
	
	public List<UserBean> findByItem(Map<String, String> map);
	
	
}
