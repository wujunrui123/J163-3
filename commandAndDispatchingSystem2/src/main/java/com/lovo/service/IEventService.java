package com.lovo.service;


import java.util.List;

import com.lovo.bean.ContinueBean;
import com.lovo.bean.EventBean;

import antlr.debug.Event;


public interface IEventService {
	/**
	 * 查询所有事件信息 并查看是否有续报 有续报就覆盖主报信息
	 * @param userId 用户id
	 * @return 用户对象
	 */
	public List<EventBean> findAll();
	/**
	 * 根据事件id查询 续报信息
	 * @return
	 */
    public List<ContinueBean> findContByEvid();
    /**
     * 添加事件
     * @param e
     */
    public void addEvent(Event e);
	
}
