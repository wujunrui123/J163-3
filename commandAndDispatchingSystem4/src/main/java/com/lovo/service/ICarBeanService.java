package com.lovo.service;

import java.util.List;

import com.lovo.bean.CarBean;

/**
 * 车辆业务层
 * @author Administrator
 *
 */
public interface ICarBeanService {
  /**
   * 添加车辆
   * @param car 车辆实体
   */
	 public void addCar(CarBean car);
	 /**
	  * 根据车辆id修改车牌号
	  * @param id 车辆id
	  * @param plateNumber 车牌号
	  */
	 public void updateCar(String plateNumber,Integer id);
	/**
	 * 根据id删除车辆
	 * @param id
	 */
	 public void delCara(int id);
	 /**
	  * 根据id查询车辆
	  * @param id 车辆id
	  * @return 返回实体
	  */
	 public CarBean find(int id);
	 
	 /**
	  * 根据车牌动态查询车辆信息
	  * @param plateNumber 车牌号
	  * @return 车辆集合
	  */
	 public List<CarBean> findByItem(String plateNumber );
	 
}
