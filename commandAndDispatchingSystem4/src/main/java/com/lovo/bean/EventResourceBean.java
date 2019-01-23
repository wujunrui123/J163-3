package com.lovo.bean;
/**
 * 调度资源表
 * @author Administrator
 *
 */
public class EventResourceBean {
    private  int pk_id;
    private  int t_e_pk_id;
    private  String f_Duty;
    private  String f_DutyTel;
    private  String f_fname;
    private  String f_Type; 
    private  String f_outDate;
    private  String f_dispatchTime;
    private  int f_perNum;
    private  int f_carNum;
    private String  eveName;
    
    
    
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
