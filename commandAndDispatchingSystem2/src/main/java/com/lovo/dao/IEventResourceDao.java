package com.lovo.dao;

import java.util.List;
import java.util.Map;

import com.lovo.bean.ContinueBean;
import com.lovo.bean.EventBean;
import com.lovo.bean.EventResourceBean;

import antlr.debug.Event;
/**
 * 资源调度持久层接口
 * @author Administrator
 *
 */
public interface IEventResourceDao {
	/**
	 * 按事件id查询资源调度集合
	 * @param eventId 事件id
	 * @return
	 */
	 public List<EventResourceBean> findResourByEveId(int eventId);
}
