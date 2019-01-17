package com.lovo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.ContinueBean;
import com.lovo.bean.EventBean;
import com.lovo.bean.UserBean;

import com.lovo.dao.IEventDao;
import com.lovo.service.IEventService;

import antlr.debug.Event;
@Service(value="eventService")
public class EventServiceImpl  implements IEventService {

	@Autowired
    private IEventDao eventDao;
	
	@Override
	public List<EventBean> findAll(Map<String, Object> map) {
		List<EventBean> li=eventDao.findAll(map);
		for (EventBean eventBean : li) {
			List<ContinueBean> lic=eventDao.findcontByEvid(eventBean.getPk_id());
			if(lic!=null&&lic.size()!=0) {
				eventBean.setF_level(lic.get(0).getF_level());
			}
		}
		return li;
	}


	@Override
	public List<ContinueBean> findContByEvid(int eveid) {
		
		return eventDao.findcontByEvid(eveid);
	}


	@Override
	public void addEvent(Event e) {
		eventDao.addEvent(e);
		
	}


	@Override
	public EventBean findEventById(int eventid) {
		return eventDao.findEventById(eventid);
		
		
	}
  
}
