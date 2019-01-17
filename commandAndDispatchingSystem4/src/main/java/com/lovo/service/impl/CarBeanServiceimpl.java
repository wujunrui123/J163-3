package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.CarBean;
import com.lovo.dao.ICarBeanDao;
import com.lovo.service.ICarBeanService;
@Service(value="carBeanService")
public class CarBeanServiceimpl implements ICarBeanService {
          
	@Autowired
	 private ICarBeanDao CarBeanDao ;
	
	@Override
	public void addCar(CarBean car) {
		CarBeanDao.addCar(car);

	}

	@Override
	public void updateCar(String plateNumber,Integer id) {
		CarBeanDao.updateCar(plateNumber, id);

	}

	@Override
	public void delCara(int id) {
		CarBeanDao.delCara(id);

	}

	@Override
	public CarBean find(int id) {
		// TODO Auto-generated method stub
		return CarBeanDao.find(id);
	}

	@Override
	public List<CarBean> findByItem(String plateNumber) {
		
		return CarBeanDao.findByItem(plateNumber);
	}

	@Override
	public void updateState( String state,String name) {
		
		CarBeanDao.updateState( state,name);
	}

}
