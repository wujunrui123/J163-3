package com.lovo.service;

import java.util.List;

import com.lovo.bean.ResourcesBean;

public interface IResourcesService {
	/**
	 * 根据调度表id 查询资源详情
	 */
    public List<ResourcesBean> findResourByErid(int id);
}
