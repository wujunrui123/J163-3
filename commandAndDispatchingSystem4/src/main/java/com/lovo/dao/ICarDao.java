




package com.lovo.dao;



import java.util.List;

import com.lovo.bean.CarBean;

/**
 * 车辆业务层
 * @author Administrator
 *
 */
public interface ICarDao {
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
	 public void delCara(int  id);
	 
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
		 * 根据车牌修改车的状态，派遣时间，返回时间，事件id
		 * @param ThingId 事件id
		 * @param sendData 派遣时间
		 * @param BackDate 返回时间
		 * @param state 状态
		 * @param name 车牌
		 */
		 public void updateState(String ThingId,String sendData,String BackDate,String state,String name);
	 
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
	 public List<CarBean> findAll();
	 
		/**
		 * 统计车辆总数
		 * @return  返回总数
		 */
		public int  systemCar();
}

