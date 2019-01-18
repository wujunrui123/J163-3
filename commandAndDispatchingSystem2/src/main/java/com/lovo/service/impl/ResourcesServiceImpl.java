package com.lovo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.DTOBean2;
import com.lovo.bean.ResourceareasBean;
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
	@Override
	public DTOBean2 findNumByEveid(int id, String type) {
		Map<String, Object> map=new HashMap<>();
		   map.put("id", id);
		   map.put("type", type);
		return resourcesDao.findNumByEveid(map);
	}
	
	@Override
	public List<ResourceareasBean> findResByArea(String type, String area) {
		
		return resourcesDao.findResByArea(type, area);
	}
      
}
