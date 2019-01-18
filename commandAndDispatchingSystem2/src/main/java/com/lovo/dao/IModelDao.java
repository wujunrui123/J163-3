package com.lovo.dao;

import java.util.List;
import com.lovo.bean.ModelEntity;

/**
 * 预案模板持久层
 * @author 罗义桃
 *
 */
public interface IModelDao {
	/**
	 * 添加预案模板
	 * @param e
	 */
	public void addModel(ModelEntity Model);
	/**
	 * 查询所有预案模板
	 * @return
	 */
	public List<ModelEntity> findModelAll();
	/**
	 * 根据模板名称模糊查询
	 * @return
	 */
	public List<ModelEntity> findModelByName(String modelName);
	/**
	 * 根据等级和类型查询预案模板
	 * @param level 等级
	 * @param type 预案
	 * @return
	 */
	public List<ModelEntity> findModelByLevelAndType(String level,String type);
	/**
	 * 根据id查询
	 * @return
	 */
	public ModelEntity findModelById(Integer id);
	/**
	 * 根据id删除预案模板
	 * @param id
	 */
	public void delModel(Integer id);
	/**
	 * 根据id修改预案模板
	 * @param type 类型
	 * @param level 等级
	 * @param perNum 医疗人数
	 * @param carNum 医疗车辆
	 * @param perOfHos 消防人数
	 * @param carOfHos 消防车辆
	 * @param id
	 */
	public void updateModel(String type,String level,Integer perNum,Integer carNum,Integer perOfHos,Integer carOfHos,Integer id);
}
