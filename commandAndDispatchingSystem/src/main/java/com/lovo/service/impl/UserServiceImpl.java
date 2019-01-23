package com.lovo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.UserBean;
import com.lovo.dao.IUserDao;
import com.lovo.service.IUserService;
@Service(value="userService")
public class UserServiceImpl implements IUserService {
	@Autowired
    private IUserDao userDao;

	@Override
	public void addUser(UserBean user) {
		userDao.addUser(user);
		
	}

	@Override
	public void delUser(int userId) {
		userDao.delUser(userId);
		
	}

	@Override
	public void updateUser(String password, int userID) {
		userDao.updateUser(password,  userID);
		
	}

	@Override
	public UserBean getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return userDao.getUserByUserId(userId);
	}

	@Override
	public List<UserBean> getListUser() {
		// TODO Auto-generated method stub
		return userDao.getListUser();
	}

	@Override
	public List<UserBean> getUNListUserByRole(List<UserBean> listAll, List<UserBean> listRoleUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBean login(String userName, String password) {
		// TODO Auto-generated method stub
		return userDao.login(userName, password);
	}

	@Override
	public List<UserBean> findByItem(Map<String, String> map) {
		// TODO Auto-generated method stub
		return userDao.findByItem(map);
	}

	


}
