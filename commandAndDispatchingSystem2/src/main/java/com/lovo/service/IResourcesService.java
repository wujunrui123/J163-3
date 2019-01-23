package com.lovo.service;

import java.util.List;

import com.lovo.bean.DTOBean2;
import com.lovo.bean.ResourceareasBean;
import com.lovo.bean.ResourcesBean;

public interface IResourcesService {
	/**
	 * 根据调度表id 查询资源详情
	 */
    public List<ResourcesBean> findResourByErid(int id);
   /**
    * 查询以调用资源数量
    * @param id 事件id
    * @param type 资源类型
    * @return 数量
    */
    public DTOBean2 findNumByEveid(int id,String type);
    
    /**
     * 按照 地区和资源类型 查询资源
     * @param type  类型
     * @param area 所在地区
     * @return
     */
    public List<ResourceareasBean> findResByArea(String type,String area);
    
 
}
