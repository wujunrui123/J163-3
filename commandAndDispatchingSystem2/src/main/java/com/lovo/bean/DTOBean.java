package com.lovo.bean;
/**
 * 续报bean
 * @author Administrator
 *
 */

import java.util.List;

public class DTOBean {
     private int  tot;
     private List<EventBean> evelist;
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public List<EventBean> getEvelist() {
		return evelist;
	}
	public void setEvelist(List<EventBean> evelist) {
		this.evelist = evelist;
	}
	public DTOBean(int tot, List<EventBean> evelist) {
		super();
		this.tot = tot;
		this.evelist = evelist;
	}
   
     
}
