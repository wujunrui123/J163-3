package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.EventResourceBean;
import com.lovo.dao.IEventDao;
import com.lovo.dao.IEventResourceDao;
import com.lovo.service.IEventResourceService;

/**
 * 调度资源业务层实现类
 * @author Administrator
 *
 */
@Service(value="eventResourceService")
public class EventResourceServiceImpl implements IEventResourceService {
	@Autowired
    private IEventResourceDao eventResourceDao;
	@Override
	public List<EventResourceBean> findResourByEveId(int eventId) {
		return eventResourceDao.findResourByEveId(eventId);
	}
     
}
