package com.lovo.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.lovo.bean.PowerEntity;
import com.lovo.bean.ThingEntity;


/**
 * 事件上报接口
 * @author 吴俊锐
 *
 */
public interface IThingService {
	
	
	/**
	 * 动态条件查询上报信息
	 * @param thingName 事件名称
	 * @param area 发生区域
	 * @param startDate 起始时间
	 * @param endDate 结束时间
	 * @param thingType 事件类型
	 * @param thingState 事件状态
	 * @return 事件集合
	 */
    public List<ThingEntity> find(Map<String, Object>map);
    
    
   
	
    /**
     * 通过ID查询事件信息，并封装续报集合
     * @param id 事件ID
     * @return 事件实体
     */
    public ThingEntity findById(int id);
    
    /**
     * 添加事件
     * @param thingEntity 事件实体
     */
    public void addThing(ThingEntity thingEntity);
    
    /**
     * 修改事件
     * @param address 详细地址
     * @param grade 等级
     */
    public void updateThing(int id,String address,String grade);
    /**
     * 修改事件状态（将事件状态待处理修改为处理中，处理完毕）
     * @param thingState 事件状态
     */
    public void updateThingTwo(int id,String thingState);
    
    /**
     * 修改上报状态（将上报状态否改为是）
     * @param id
     * @param uploadType
     */
    public void updateType(int id,String uploadType);
    /**
     * 删除上报
     * @param id 事件ID
     */
    public void del(int id);
}
