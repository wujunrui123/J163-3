package com.lovo.service.impl;

import java.util.List;

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
	public List<UserBean> getListUser() {
		
		return userDao.getListUser();
	}



	@Override
	public UserBean getUserByUserId(int userId) {
		
		return userDao.getUserByUserId(userId);
	}

	@Override
	public List<UserBean> getUNListUserByRole(List<UserBean> listAll, List<UserBean> listRoleUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBean login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addUser(UserBean user) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delUser(UserBean user) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update(UserBean user) {
		// TODO Auto-generated method stub
		
	}


}
