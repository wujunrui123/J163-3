package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.ResourcesBean;
import com.lovo.dao.ResourcesDao;
import com.lovo.service.IResourcesService;

/**
 * 资源详情业务层实现类
 * @author Administrator
 *
 */
@Service(value="resourcesService")
public class ResourcesServiceImpl implements IResourcesService{
	@Autowired
    private ResourcesDao resourcesDao;
	@Override
	public List<ResourcesBean> findResourByErid(int id) {
		
		return resourcesDao.findResourByErid(id);
	}
      
}
