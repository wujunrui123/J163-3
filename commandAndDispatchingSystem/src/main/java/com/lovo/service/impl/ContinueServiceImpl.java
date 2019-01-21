package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.lovo.bean.ContinueEntity;
import com.lovo.dao.IContinueDao;
import com.lovo.service.IContinueService;

@Service(value="continueService")
public class ContinueServiceImpl implements IContinueService{

	@Autowired
	private IContinueDao dao;
	
	@Override
	public void add(ContinueEntity continueEntity) {
		dao.add(continueEntity);
		
	}

	@Override
	public ContinueEntity findById(int id) {
		
		return dao.findById(id);
	}

	@Override
	public void delById(int id) {
		dao.delById(id);
		
	}

	@Override
	public List<ContinueEntity> findByThingId(int thingID) {
		
		return dao.findByThingId(thingID);
	}

}
