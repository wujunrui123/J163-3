package com.lovo.dao;

import java.util.List;
import java.util.Map;

import com.lovo.bean.DTOBean;
import com.lovo.bean.DTOBean2;

import com.lovo.bean.ResourceareasBean;
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
    /**
     * 查询以调用资源数量
     * @param id 事件id
     * @param type 资源类型
     * @return 数量
     */
     public DTOBean2 findNumByEveid(Map<String, Object> map);
     /**
      * 按照资源类型和所属区域查询资源
      * @param type 资源类型
      * @param area 所属区域
      * @return 资源名称集合
      */
     public List<ResourceareasBean> findResByArea(String type, String area);
}
