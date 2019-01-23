package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.CommonEntity;
import com.lovo.bean.PowerEntity;
import com.lovo.dao.ICommonDao;
import com.lovo.service.ICommonService;


@Service(value="commonService")
public class CommonServiceImpl implements ICommonService {
	@Autowired
	private ICommonDao dao;

	@Override
	public void add(CommonEntity commonEntity) {
		dao.add(commonEntity);
		
	}

	@Override
	public void del(int id) {
		dao.del(id);
		
	}

	@Override
	public void update(int id, String key) {
		dao.update(id, key);
		
	}

	@Override
	public List<CommonEntity> findAll() {
		List<CommonEntity>list=dao.findAll();
		return list;
		
	}

	@Override
	public CommonEntity findById(int id) {
		CommonEntity commonEntity=dao.findById(id);
		return commonEntity;
	}

	@Override
	public List<CommonEntity> findByType(String type) {
		List<CommonEntity>list=dao.findByType(type);
		return list;
	}
    
}
