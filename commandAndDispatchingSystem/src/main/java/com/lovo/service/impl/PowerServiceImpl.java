package com.lovo.service.impl;

import java.util.List;
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
	
	


  
}
