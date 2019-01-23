package com.lovo.service;

import java.util.List;

import com.lovo.bean.EventResourceBean;
/**
 * 调度资源service
 * @author Administrator
 *
 */
public interface IEventResourceService {
	/**
	 * 按事件id查询资源调度集合
	 * @param eventId 事件id
	 * @return
	 */
   public List<EventResourceBean> findResourByEveId(int eventId);
}
