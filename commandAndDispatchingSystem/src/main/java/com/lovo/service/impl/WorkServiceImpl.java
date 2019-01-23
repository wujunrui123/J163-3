package com.lovo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.WorkBean;
import com.lovo.dao.IWorkDao;
import com.lovo.service.IWorkService;
@Service(value="workService")
public class WorkServiceImpl implements IWorkService{
	@Autowired
	private IWorkDao workDao;
	
	@Override
	public void addWork(WorkBean work) {
		workDao.addWork(work);
		
	}

	@Override
	public void delWork(int id) {
		workDao.delWork(id);
		
	}

	@Override
	public WorkBean findById(int id) {
		// TODO Auto-generated method stub
		return workDao.findById(id);
	}

	@Override
	public List<WorkBean> findAll() {
		// TODO Auto-generated method stub
		return workDao.findAll();
	}

	@Override
	public List<WorkBean> findByItem(Map<String, Object> map) {
		return workDao.findByItem(map);
		
	}

	@Override
	public void writeLog(String log, int id) {
		workDao.writeLog(log, id);
		
	}

	@Override
	public WorkBean findByEndTime(String endDate) {
		return workDao.findByEndTime(endDate);
	}

}
