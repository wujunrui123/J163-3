package com.lovo.dao;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;

import com.lovo.bean.WorkBean;

public interface IWorkDao {
	public void addWork(WorkBean work);
	public void delWork(int id);
	public WorkBean findById(int id);
	public List<WorkBean> findAll();
	public List<WorkBean> findByItem(Map<String, Object> map);
	public void writeLog(String log,int id);
	public WorkBean findByEndTime(String endDate);
=======
public interface IWorkDao {

>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
}
