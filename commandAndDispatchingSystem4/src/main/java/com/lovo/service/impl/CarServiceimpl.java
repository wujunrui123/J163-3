package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.CarBean;
import com.lovo.dao.ICarDao;
import com.lovo.service.ICarService;
@Service(value="carService")
public class CarServiceimpl implements ICarService {
          
	@Autowired
	 private ICarDao CarBeanDao ;
	
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
	public List<CarBean> findBitm(int id) {
		// TODO Auto-generated method stub
		return CarBeanDao.findBitm(id);
	}

	@Override
	public List<CarBean> findAll() {
		// TODO Auto-generated method stub
		return CarBeanDao.findAll();
	}

	@Override
	public int systemCar() {
		// TODO Auto-generated method stub
		return CarBeanDao.systemCar();
	}

	@Override
	public void updateState(String ThingId, String sendData, String BackDate, String state, String name) {
		CarBeanDao.updateState(ThingId, sendData, BackDate, state, name);		
	}

	@Override
	public List<CarBean> findCarByzaixian(int id) {
		// TODO Auto-generated method stub
		return CarBeanDao.findCarByzaixian(id);
	}

}
