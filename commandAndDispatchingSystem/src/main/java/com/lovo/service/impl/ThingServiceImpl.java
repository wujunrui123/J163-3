package com.lovo.service.impl;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.PowerEntity;
import com.lovo.bean.ThingEntity;
import com.lovo.dao.IThingDao;
import com.lovo.service.IPowerService;
import com.lovo.service.IThingService;

@Service(value="thingService")
public class ThingServiceImpl implements IThingService {
	@Autowired
	private IThingDao dao;

	@Override
	public List<ThingEntity> find(Map<String, Object>map) {
		
		List<ThingEntity>list=dao.find(map);
		return list;
	}

	@Override
	public ThingEntity findById(int id) {
		ThingEntity thingEntity=dao.findById(id);
		return thingEntity;
	}

	@Override
	public void addThing(ThingEntity thingEntity) {
		dao.addThing(thingEntity);
		
	}

	@Override
	public void updateThing(int id,String address, String grade) {
		dao.updateThing(id, address, grade);
		
	}

	@Override
	public void updateThingTwo(int id,String thingState) {
		dao.updateThingTwo(id, thingState);
		
	}

	@Override
	public void del(int id) {
		dao.del(id);
		
	}
    
}
