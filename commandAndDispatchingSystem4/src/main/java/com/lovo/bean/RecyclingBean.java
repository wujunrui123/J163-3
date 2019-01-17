package com.lovo.bean;

import java.sql.Date;
/**
 * 派遣回收
 * @author Administrator
 *
 */
public class RecyclingBean {
/**派遣回收id*/
	private Integer xingDongId;
	/**事件id*/
	private Integer eventSourceId;
	/**状态*/
	private String tate;
	/**派出时间*/
	private Date outDate;
	/**回收时间*/
	private Date backDate;
	/**事件类型*/
	private Integer type;
	/**事件名称*/
	private String resourceName;
	public Integer getXingDongId() {
		return xingDongId;
	}
	public void setXingDongId(Integer xingDongId) {
		this.xingDongId = xingDongId;
	}
	public Integer getEventSourceId() {
		return eventSourceId;
	}
	public void setEventSourceId(Integer eventSourceId) {
		this.eventSourceId = eventSourceId;
	}
	public String getTate() {
		return tate;
	}
	public void setTate(String tate) {
		this.tate = tate;
	}
	public Date getOutDate() {
		return outDate;
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	public Date getBackDate() {
		return backDate;
	}
	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
}
