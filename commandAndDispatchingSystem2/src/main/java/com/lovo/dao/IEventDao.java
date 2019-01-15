package com.lovo.dao;

import com.lovo.bean.ContinueBean;
import com.lovo.bean.EventBean;

import antlr.debug.Event;

public interface IEventDao {
	/**
	 * 查询全部事件
	 * @return
	 */
	public EventBean findAllEvent();
	/**
	 *  根据事件id 查询续报
	 * @return
	 */
	public ContinueBean findcontByEvid(int evid);
	  /**
     * 添加事件
     * @param e
     */
    public void addEvent(Event e);
}
