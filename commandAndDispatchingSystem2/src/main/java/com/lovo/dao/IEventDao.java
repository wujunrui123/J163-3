package com.lovo.dao;

import java.util.List;
import java.util.Map;

import com.lovo.bean.ContinueBean;
import com.lovo.bean.EventBean;

import antlr.debug.Event;

public interface IEventDao {
	/**
	 * 查询全部事件
	 * @return
	 */
	public List<EventBean> findAll(Map<String, Object> map);
	/**
	 *  根据事件id 查询续报
	 * @return
	 */
	public List<ContinueBean> findcontByEvid(int evid);
	  /**
     * 添加事件
     * @param e
     */
    public void addEvent(Event e);
    /**
     * 按事件id查询事件
     * @param eventid
     */
    public EventBean findEventById(int eventid);
}
