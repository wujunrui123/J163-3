package com.lovo.service;

import java.util.List;

import com.lovo.bean.PowerEntity;


<<<<<<< HEAD

public interface IPowerService {
     /**
      * 根据用户id查询权限集合
      * @return 权限集合
      */
	public List<PowerEntity> getListPower(int userid) ;
    
=======
/**
 * 角色权限接口
 * @author Administrator
 *
 */
public interface IPowerService {
     /**
      *根据角色ID获取该角色拥有的权限
      * @param roleId
      * @return
      */
	public List<PowerEntity> getListPowerByRoleId(String roleId);
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
	
}
