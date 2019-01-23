package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.RoleEntity;
import com.lovo.dao.IRoleDao;
<<<<<<< HEAD

import com.lovo.service.IRoleService;
@Service(value="roleService")
public class RoleServiceImpl implements IRoleService {

	@Autowired
    private IRoleDao roleDao;
	
	@Override
	public List<RoleEntity> getListRole() {
		
		return roleDao.getAllRole();
	}

	@Override
	public List<RoleEntity> getListRole(int userid) {
		
		return roleDao.getListRole(userid);
	}

	@Override
	public List<RoleEntity> getNotRole(int userid) {
		List<RoleEntity> allRole= roleDao.getAllRole();
		List<RoleEntity> userRloe= roleDao.getListRole(userid);
=======
import com.lovo.service.IRoleService;
@Service(value="roleService")
public class RoleServiceImpl implements IRoleService {

	@Autowired
    private IRoleDao ir;
	
	@Override
	public List<RoleEntity> getListRole() {
		
		return ir.getAllRole();
	}

	@Override
	public List<RoleEntity> getListRole(int userid) {
		
		return ir.getListRole(userid);
	}

	@Override
	public List<RoleEntity> getNotRole(int userid) {
		List<RoleEntity> allRole= ir.getAllRole();
		List<RoleEntity> userRloe= ir.getListRole(userid);
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
		for (int i = 0; i < userRloe.size(); i++) {
		for (int j = 0; j < allRole.size(); j++) {
				    if(allRole.get(j).getRoleId()==userRloe.get(i).getRoleId()) {
				    	      allRole.remove(j);
				    	     break;   
				    }
			}
		}
	
		return allRole;
	}

}
