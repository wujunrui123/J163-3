package com.lovo.dao;

import com.lovo.bean.StatisticalBean;

/**
 * 库存统计业务层
 * @author Administrator
 *
 */
public interface IStatisticalBeanDao {
   /**
    * 添加库存
    * @param Statistical
    */
	public void addStatistical(StatisticalBean Statistical);
	
	/**
	 * 根据id修改人员库存和车辆库存
	 * @param totalCar 车辆库存
	 * @param totalPerson 人员库存
	 * @param kuCunId2 库存id
	 */
	public void updateStatistical(int totalCar,int totalPerson,int kuCunId2);
	
	/**
	 * 根据id查询库存
	 * @param id 库存id
	 * @return
	 */
		public StatisticalBean find(int id);
}
