package com.lovo.service;

import java.util.List;

import com.lovo.bean.ContinueEntity;

/**
 * 续报接口
 * @author 吴俊锐
 *
 */
public interface IContinueService {

	/**
	 * 添加续报
	 * @param continueEntity 续报实体
	 */
	public void add(ContinueEntity continueEntity);
	
	/**
	 * 查询续报
	 * @param id 续报ID
	 * @return 续报实体
	 */
	public ContinueEntity findById(int id);
	
	
	/**
	 * 删除续报
	 * @param id 续报ID
	 */
	public void delById(int id);
	
	/**
	 * 通过事件ID外键查询续报集合
	 * @param thingID 事件ID
	 * @return
	 */
	public List<ContinueEntity> findByThingId(int thingID);
	
	
	
}
