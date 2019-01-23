package com.lovo.service.impl;

import java.util.List;
<<<<<<< HEAD
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.lovo.bean.PowerEntity;
import com.lovo.bean.UserBean;


import com.lovo.dao.IPowerDao;

import com.lovo.service.IPowerService;

import antlr.debug.Event;
@Service(value="powerService")
public class PowerServiceImpl  implements IPowerService {

	@Autowired
    private IPowerDao powerDao;

	@Override
	public List<PowerEntity> getListPower(int userid) {
	
		return powerDao.getListPower(userid);
	}
	
	


  
=======

import org.springframework.stereotype.Service;

import com.lovo.bean.PowerEntity;
import com.lovo.service.IPowerService;

@Service(value="powerService")
public class PowerServiceImpl implements IPowerService {

	@Override
	public List<PowerEntity> getListPowerByRoleId(String roleId) {
		
		return null;
	}
    
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
}
