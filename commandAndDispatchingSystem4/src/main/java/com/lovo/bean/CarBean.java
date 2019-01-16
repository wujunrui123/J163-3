package com.lovo.bean;

/**
 * 车辆库存
 * 
 * @author Administrator
 *
 */
public class CarBean {

	/** 资源库存id(车辆) */
	private Integer ziYuanId;
	/** 车牌号码 */
	private String plateNumber;
	/** 外派状态 */
	private String state;
	public Integer getZiYuanId() {
		return ziYuanId;
	}
	public void setZiYuanId(Integer ziYuanId) {
		this.ziYuanId = ziYuanId;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
