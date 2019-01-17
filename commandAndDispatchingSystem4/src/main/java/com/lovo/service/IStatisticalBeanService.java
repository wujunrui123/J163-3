package com.lovo.service;
/**
 * 库存统计业务层
 * @author Administrator
 *
 */
public interface IStatisticalBeanService {
   
	/**
	 * 统计车辆总数
	 * @return  返回总数
	 */
	public int  systemCar();
	/**
	 * 统计人数
	 * @return 返回总数
	 */
	public int systemEmployees();
	
	
}
