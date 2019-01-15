package com.lovo.service.impl;

import java.util.List;

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
	public List<EventBean> findAll() {
		
		return null;
	}


	@Override
	public List<ContinueBean> findContByEvid() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void addEvent(Event e) {
		
		
	}
  
}
