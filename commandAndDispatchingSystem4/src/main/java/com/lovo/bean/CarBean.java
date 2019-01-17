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
	/**事件id*/
	private Integer ThingId;
	
	public Integer getThingId() {
		return ThingId;
	}
	public void setThingId(Integer thingId) {
		ThingId = thingId;
	}
	/** 车牌号码 */
	private String plateNumber;
	/** 外派状态 */
	private String state;
	/**
	 * 派遣时间
	 */
	private String  sendData;
	/**归队时间*/
	private String BackDate;
	
	
	public String getSendData() {
		return sendData;
	}
	public void setSendData(String sendData) {
		this.sendData = sendData;
	}
	public String getBackDate() {
		return BackDate;
	}
	public void setBackDate(String backDate) {
		BackDate = backDate;
	}
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
