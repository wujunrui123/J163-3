package com.lovo.bean;
/**
 * 续报bean
 * @author Administrator
 *
 */

import java.util.List;

public class ResourceareasBean {
   private String f_name;
   private String f_url;
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public String getF_url() {
	return f_url;
}
public void setF_url(String f_url) {
	this.f_url = f_url;
}
public ResourceareasBean(String f_name, String f_url) {
	super();
	this.f_name = f_name;
	this.f_url = f_url;
}
public ResourceareasBean() {
	super();
}
  
     
}
