package com.lovo.bean;
/**
 * 资源详情bean
 * @author Administrator
 *
 */
public class ResourcesBean {
     private int pk_id;
     /**
      * 物资类型
      */
     private String t_type;
     /**
      * 回归时间
      */
     private String f_backDate;
     /**
      * 名称
      */
     private String f_name;
     
	public int getPk_id() {
		return pk_id;
	}
	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public String getF_backDate() {
		return f_backDate;
	}
	public void setF_backDate(String f_backDate) {
		this.f_backDate = f_backDate;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
     
     
}
