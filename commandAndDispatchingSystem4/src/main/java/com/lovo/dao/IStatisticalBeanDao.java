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
	 * 根据ID修改库存
	 * @param id
	 */
	public void updateStatistical(int id);
}
