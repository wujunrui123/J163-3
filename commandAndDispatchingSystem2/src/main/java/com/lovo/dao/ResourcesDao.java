package com.lovo.dao;

import java.util.List;

import com.lovo.bean.ResourcesBean;
/**
 * 资源详情持久层接口
 * @author Administrator
 *
 */
public interface ResourcesDao {
	/**
	 * 根据调度表id 查询资源详情
	 */
    public List<ResourcesBean> findResourByErid(int id);
}
