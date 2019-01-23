package com.lovo.service;

import java.util.List;

import com.lovo.bean.PowerEntity;



public interface IPowerService {
     /**
      * 根据用户id查询权限集合
      * @return 权限集合
      */
	public List<PowerEntity> getListPower(int userid) ;
    
	
}
