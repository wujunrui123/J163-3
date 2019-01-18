package com.lovo.service;

import java.util.List;

import com.lovo.bean.CarBean;

/**
 * 车辆业务层
 * @author Administrator
 *
 */
public interface ICarService {
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
	 
	 /**
	  * 根据车辆id，修改车辆状态
	  * @param id 车辆id
	  * @param state 车辆状态
	  */
	 public void updateState(String state,String name);
	 
	 /**
		 * 按事件id查询所有车辆集合
		 * @param id
		 * @return 返回车辆集合
		 */
		 public List<CarBean> findBitm(int id);
		 
		 /**
		  *  根据转态查询车辆集合
		  * @param state
		  * @return
		  */
		 public List<CarBean> findAll(String state);
	 
			/**
			 * 统计车辆总数
			 * @return  返回总数
			 */
			public int  systemCar();
}