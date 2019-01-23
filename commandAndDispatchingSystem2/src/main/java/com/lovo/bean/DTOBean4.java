package com.lovo.bean;
/**
 * 续报bean
 * @author Administrator
 *
 */

import java.util.List;

public class DTOBean4 {
    private List<ResourceareasBean> yi;
    private List<ResourceareasBean> xiao;
	public List<ResourceareasBean> getYi() {
		return yi;
	}
	public void setYi(List<ResourceareasBean> yi) {
		this.yi = yi;
	}
	public List<ResourceareasBean> getXiao() {
		return xiao;
	}
	public void setXiao(List<ResourceareasBean> xiao) {
		this.xiao = xiao;
	}
	public DTOBean4(List<ResourceareasBean> yi, List<ResourceareasBean> xiao) {
		super();
		this.yi = yi;
		this.xiao = xiao;
	}
	public DTOBean4() {
		super();
	}
    
	
}
