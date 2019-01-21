package com.lovo.dao;

import java.util.List;

import com.lovo.bean.ContinueEntity;


/**
 * 续报持久层接口
 * @author Administrator
 *
 */
public interface IContinueDao {
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
	 * @param thingID 事件id
	 * @return
	 */
	public List<ContinueEntity> findByThingId(int thingID);
}
