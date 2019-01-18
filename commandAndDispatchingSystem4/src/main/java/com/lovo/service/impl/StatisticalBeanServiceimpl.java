package com.lovo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.StatisticalBean;
import com.lovo.dao.IStatisticalBeanDao;
import com.lovo.service.IStatisticalBeanService;
@Service(value="statisticalBeanService")
public class StatisticalBeanServiceimpl implements IStatisticalBeanService {

	@Autowired
	 private  IStatisticalBeanDao  StatisticalBeanDao;
	
	@Override
	public void addStatistical(StatisticalBean Statistical) {
		StatisticalBeanDao.addStatistical(Statistical);		
	}

	@Override
	public void updateStatistical(int totalCar, int totalPerson, int kuCunId2) {
		StatisticalBeanDao.updateStatistical(totalCar, totalPerson, kuCunId2);		
	}

	@Override
	public StatisticalBean find(int id) {
		// TODO Auto-generated method stub
		return StatisticalBeanDao.find(id);
	}

}
