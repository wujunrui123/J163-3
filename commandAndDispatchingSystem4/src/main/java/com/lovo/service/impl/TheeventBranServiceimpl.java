package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.TheeventBean;
import com.lovo.dao.ITheeventBeanDao;
import com.lovo.service.ITheeventBeanService;
@Service(value="theeventBeanService")
public class TheeventBranServiceimpl implements ITheeventBeanService {

	@Autowired
	 private ITheeventBeanDao theeventBeanDao;
	@Override
	public void addTheevent(TheeventBean Theevent) {
		theeventBeanDao.addTheevent(Theevent);

	}



	@Override
	public void updateTheevent(String area, int id) {
		theeventBeanDao.updateTheevent(area, id);

	}

	@Override
	public TheeventBean findById(Integer id) {
		// TODO Auto-generated method stub
		return theeventBeanDao.findById(id);
	}



	@Override
	public List<TheeventBean> findBitm(String area, String address) {
		// TODO Auto-generated method stub
		return theeventBeanDao.findBitm(area, address);
	}
}
