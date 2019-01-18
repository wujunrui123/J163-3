package com.lovo.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.EmployeesBean;
import com.lovo.dao.IEmployeesBeanDao;
import com.lovo.service.IEmployeesBeanService;
@Service(value="employeesBeanService")
public class EmployeesBeanServiceimpl implements IEmployeesBeanService {
            
	@Autowired
	 private IEmployeesBeanDao EmployeesBeanDao;

	@Override
	public void addEmployees(EmployeesBean Employees) {
		EmployeesBeanDao.addEmployees(Employees);		
	}

	@Override
	public void updateEmployees( String phone,int id) {
		EmployeesBeanDao.updateEmployees( phone,id);
		
	}

	@Override
	public void delEmployees(int id) {
		EmployeesBeanDao.delEmployees(id);		
	}

	@Override
	public EmployeesBean findEmployees(int id) {
		// TODO Auto-generated method stub
		return EmployeesBeanDao.findEmployees(id);
	}

	@Override
	public List<EmployeesBean> findByItem(String name) {
		// TODO Auto-generated method stub
		return EmployeesBeanDao.findByItem(name);
	}

	@Override
	public void updateState( String state,String name) {
		EmployeesBeanDao.updateState(state, name);
		
	}

	@Override
	public List<EmployeesBean> findBitm(int id) {
		// TODO Auto-generated method stub
		return EmployeesBeanDao.findBitm(id);
	}

	@Override
	public List<EmployeesBean> findAll(@Param("state")   String state) {
		// TODO Auto-generated method stub
		return EmployeesBeanDao.findAll(state);
	}

	@Override
	public int systemEmployees() {
		// TODO Auto-generated method stub
		return EmployeesBeanDao.systemEmployees();
	}
	

}
