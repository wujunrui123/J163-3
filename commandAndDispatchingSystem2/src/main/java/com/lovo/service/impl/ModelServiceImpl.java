package com.lovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.bean.ModelEntity;
import com.lovo.dao.IModelDao;
import com.lovo.service.IModelService;

@Service(value="modelService")
public class ModelServiceImpl implements IModelService {
	
	@Autowired
    private IModelDao modelDao;
	
	@Override
	public void addModel(ModelEntity Model) {
		modelDao.addModel(Model);
	}

	@Override
	public List<ModelEntity> findModelAll() {
		return modelDao.findModelAll();
	}

	@Override
	public List<ModelEntity> findModelByName(String modelName) {
		return modelDao.findModelByName(modelName);
	}

	@Override
	public void delModel(Integer id) {
		modelDao.delModel(id);
	}

	@Override
	public void updateModel(String type, String level, Integer perNum, Integer carNum, Integer perOfHos,
			Integer carOfHos, Integer id) {
		modelDao.updateModel(type, level, perNum, carNum, perOfHos, carOfHos, id);
		
	}

	@Override
	public ModelEntity findModelById(Integer id) {
		return modelDao.findModelById(id);
	}

	@Override
	public List<ModelEntity> findModelByLevelAndType(String level, String type) {
		return modelDao.findModelByLevelAndType(level, type);
	}

}
