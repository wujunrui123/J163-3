package com.lovo.bean;
/**
 * 调度资源表
 * @author Administrator
 *
 */
public class EventResourceBean {
	/**
	 * id
	 */
    private  int pk_id;
    /**
     * 事件id
     */
    private  int t_e_pk_id;
    /**
     * 负责人
     */
    private  String f_Duty;
    /**
     * 负责人电话
     */
    private  String f_DutyTel;
    /**
     * 资源名称
     */
    private  String f_fname;
    /**
     * 资源类型
     */
    private  String f_Type; 
    /**
     * 派出时间
     */
    private  String f_outDate;
    /**
     * 调度时间
     */
    private  String f_dispatchTime;
    /**
     * 人数
     */
    private  int f_perNum;
    /**
     * 车数
     */
    private  int f_carNum;
    /**
     * 事件名称
     */
    private String  eveName;
    /**
     * 事件编号
     */
    private String   eveNum;
    
    /**地址*/
    private String site;
    
    
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getEveNum() {
		return eveNum;
	}
	public void setEveNum(String eveNum) {
		this.eveNum = eveNum;
	}
	public String getEveName() {
		return eveName;
	}
	public void setEveName(String eveName) {
		this.eveName = eveName;
	}
	public int getT_e_pk_id() {
		return t_e_pk_id;
	}
	public void setT_e_pk_id(int t_e_pk_id) {
		this.t_e_pk_id = t_e_pk_id;
	}
	public int getPk_id() {
		return pk_id;
	}
	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}
	public String getF_Duty() {
		return f_Duty;
	}
	public void setF_Duty(String f_Duty) {
		this.f_Duty = f_Duty;
	}
	public String getF_DutyTel() {
		return f_DutyTel;
	}
	public void setF_DutyTel(String f_DutyTel) {
		this.f_DutyTel = f_DutyTel;
	}
	public String getF_fname() {
		return f_fname;
	}
	public void setF_fname(String f_fname) {
		this.f_fname = f_fname;
	}
	public String getF_Type() {
		return f_Type;
	}
	public void setF_Type(String f_Type) {
		this.f_Type = f_Type;
	}
	public String getF_outDate() {
		return f_outDate;
	}
	public void setF_outDate(String f_outDate) {
		this.f_outDate = f_outDate;
	}
	public String getF_dispatchTime() {
		return f_dispatchTime;
	}
	public void setF_dispatchTime(String f_dispatchTime) {
		this.f_dispatchTime = f_dispatchTime;
	}
	public int getF_perNum() {
		return f_perNum;
	}
	public void setF_perNum(int f_perNum) {
		this.f_perNum = f_perNum;
	}
	public int getF_carNum() {
		return f_carNum;
	}
	public void setF_carNum(int f_carNum) {
		this.f_carNum = f_carNum;
	}
    
} 
