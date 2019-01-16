package com.lovo.bean;
/**
 * 库存统计表
 * @author Administrator
 *
 */
public class StatisticalBean {
	/**总量库存id*/
	private Integer kuCunId;
	public Integer getKuCunId() {
		return kuCunId;
	}
	public void setKuCunId(Integer kuCunId) {
		this.kuCunId = kuCunId;
	}
	/**总车辆*/
	private Integer totalCar;
	/**总人数*/
	private Integer totalPerson;
	
	public Integer getTotalCar() {
		return totalCar;
	}
	public void setTotalCar(Integer totalCar) {
		this.totalCar = totalCar;
	}
	public Integer getTotalPerson() {
		return totalPerson;
	}
	public void setTotalPerson(Integer totalPerson) {
		this.totalPerson = totalPerson;
	}


}
