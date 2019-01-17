package com.lovo.dao;

import java.util.List;

import com.lovo.bean.TheeventBean;

/**
 * 事件业务层
 * @author Administrator
 *
 */
public interface ITheeventBeanDao {

	/**
	 * 添加事件
	 * @param Theevent
	 */
	public void addTheevent(TheeventBean Theevent);
	/**
	 * 根据事件信息动态查询事件
	 * @param area 事件状态
	 * @param type 事件类型
	 * @param address 事件地址
	 * @return
	 */
	public List<TheeventBean> findBitm(String area,String type,String address);

  /**
   * 根据事件id修改事件状态
   * @param id 事件id
   * @param area 事件状态
   */
	public void updateTheevent(String area,int id  );
	

}
