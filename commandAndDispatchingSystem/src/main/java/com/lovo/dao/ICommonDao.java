package com.lovo.dao;

import java.util.List;

import com.lovo.bean.CommonEntity;
import com.lovo.bean.PowerEntity;


/**
 * 公共模块接口
 * @author Administrator
 *
 */
public interface ICommonDao {
	
	/**
	 * 添加
	 * @param commonEntity
	 */
     public void add(CommonEntity commonEntity);
     
     /**
      * 
      * @param id
      */
     public void del(int id);
     
     
     /**
      * 根据value修改Key值
      * @param value
      * @param key
      */
     public void update(int id,String key);
     
     /**
      * 查询所有
      */
     public List<CommonEntity> findAll();
     
     public CommonEntity findById(int id);
     
     /**
      * 根据type查询集合
      * @param type
      * @return
      */
     public List<CommonEntity> findByType(String type);
     
	
}
