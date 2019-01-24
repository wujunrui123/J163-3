package com.lovo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.StatisticalBean;
import com.lovo.dao.ICarDao;
import com.lovo.dao.IEmployeesBeanDao;
import com.lovo.dao.IStatisticalBeanDao;
import com.lovo.service.IStatisticalBeanService;
@Service(value="statisticalBeanService")
public class StatisticalBeanServiceimpl implements IStatisticalBeanService {

	@Autowired
	 private  IStatisticalBeanDao  StatisticalBeanDao;
	
	@Autowired
	 private IEmployeesBeanDao EmployeesBeanDao;
	
	@Autowired
	 private ICarDao CarBeanDao ;
	
	@Override
	public void addStatistical(StatisticalBean Statistical) {
		int car = CarBeanDao.systemCar();
		int Employees = EmployeesBeanDao.systemEmployees();
		StatisticalBean s=new StatisticalBean();
		s.setTotalCar(car);
		s.setTotalPerson(Employees);
		StatisticalBeanDao.addStatistical(s);		
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
