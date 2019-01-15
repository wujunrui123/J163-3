package com.lovo.bean;
/**
 * 续报bean
 * @author Administrator
 *
 */
public class ContinueBean {
	/**
	 * id
	 * 
	 */
   private int pk_id;
   /**
    * 事件等级
    */
   private int f_level;
   /**
    * 事件编号
    */
   private String f_eventNum;
   /**
    * 伤亡人数
    */
   private int f_casualty;
   /**
    * 上报人
    */
   private String t_report;
   /**
    * 续报时间
    */
   private String f_repTime;
   /**
    * 上报人
    */
   private String f_AlarmMan;
   /**
    * 上报人电话
    */
   private String f_Alarntel;
public int getPk_id() {
	return pk_id;
}
public void setPk_id(int pk_id) {
	this.pk_id = pk_id;
}
public int getF_level() {
	return f_level;
}
public void setF_level(int f_level) {
	this.f_level = f_level;
}
public String getF_eventNum() {
	return f_eventNum;
}
public void setF_eventNum(String f_eventNum) {
	this.f_eventNum = f_eventNum;
}
public int getF_casualty() {
	return f_casualty;
}
public void setF_casualty(int f_casualty) {
	this.f_casualty = f_casualty;
}
public String getT_report() {
	return t_report;
}
public void setT_report(String t_report) {
	this.t_report = t_report;
}
public String getF_repTime() {
	return f_repTime;
}
public void setF_repTime(String f_repTime) {
	this.f_repTime = f_repTime;
}
public String getF_AlarmMan() {
	return f_AlarmMan;
}
public void setF_AlarmMan(String f_AlarmMan) {
	this.f_AlarmMan = f_AlarmMan;
}
public String getF_Alarntel() {
	return f_Alarntel;
}
public void setF_Alarntel(String f_Alarntel) {
	this.f_Alarntel = f_Alarntel;
}
   
}
