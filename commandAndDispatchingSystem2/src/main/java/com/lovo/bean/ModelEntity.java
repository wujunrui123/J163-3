package com.lovo.bean;
/**
 * 预案模板实体
 * @author 罗义桃
 *
 */
public class ModelEntity {
	/*预案模板id*/
	private Integer id;
	/*预案模板名称*/
    private String modelName;
    /*预案模板类型*/
    private String type;
    /*预案模板等级*/
    private String level;
    /*医疗人数*/
    private Integer perNum;
    /*医疗车辆*/
    private Integer carNum;
    /*消防人数*/
    private Integer perOfHos;
    /*消防车辆*/
    private Integer carOfHos;
    /*创建人*/
    private String creatPerson;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Integer getPerNum() {
		return perNum;
	}
	public void setPerNum(Integer perNum) {
		this.perNum = perNum;
	}
	public Integer getCarNum() {
		return carNum;
	}
	public void setCarNum(Integer carNum) {
		this.carNum = carNum;
	}
	public Integer getPerOfHos() {
		return perOfHos;
	}
	public void setPerOfHos(Integer perOfHos) {
		this.perOfHos = perOfHos;
	}
	public Integer getCarOfHos() {
		return carOfHos;
	}
	public void setCarOfHos(Integer carOfHos) {
		this.carOfHos = carOfHos;
	}
	public String getCreatPerson() {
		return creatPerson;
	}
	public void setCreatPerson(String creatPerson) {
		this.creatPerson = creatPerson;
	}
}
