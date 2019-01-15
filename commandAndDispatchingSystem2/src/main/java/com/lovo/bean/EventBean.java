package com.lovo.bean;

public class EventBean {
	/**
	 *事件编号
	 */
      private String f_eventNum;
      /**
       * 发生时间
       */
      private String f_time;
      /**
       * 详细地址
       */
      private String f_address;
      /**
       * 所属区域
       */
      private String f_area;
      /**
       * 事件等级
       */
      private String f_level;
      /**
       * 事件类型
       */
      private int f_type;
      /**
       * 上报人
       */
      private String t_report;
      /**
       * 报警人
       */
      private String t_alarm;
      /**
       * 报警人电话
       */
      private String f_alarmTel;
      /**
       * 伤亡人数
       */
      private int f_casualty;
      /**
       * 事件状态
       */
      private String f_state="待处理";
      /**
       * 火势描述
       */
      private String f_firesituation;
      /**
       * 火源
       */
      private String f_firesi;
      /**
       * 坍塌面积
       */
      private String f_collapsearea;
      /**
       * 坍塌原因
       */
      private String f_collapse;
      
	public String getF_eventNum() {
		return f_eventNum;
	}
	public void setF_eventNum(String f_eventNum) {
		this.f_eventNum = f_eventNum;
	}
	public String getF_time() {
		return f_time;
	}
	public void setF_time(String f_time) {
		this.f_time = f_time;
	}
	public String getF_address() {
		return f_address;
	}
	public void setF_address(String f_address) {
		this.f_address = f_address;
	}
	public String getF_area() {
		return f_area;
	}
	public void setF_area(String f_area) {
		this.f_area = f_area;
	}
	public String getF_level() {
		return f_level;
	}
	public void setF_level(String f_level) {
		this.f_level = f_level;
	}
	public int getF_type() {
		return f_type;
	}
	public void setF_type(int f_type) {
		this.f_type = f_type;
	}
	public String getT_report() {
		return t_report;
	}
	public void setT_report(String t_report) {
		this.t_report = t_report;
	}
	public String getT_alarm() {
		return t_alarm;
	}
	public void setT_alarm(String t_alarm) {
		this.t_alarm = t_alarm;
	}
	public String getF_alarmTel() {
		return f_alarmTel;
	}
	public void setF_alarmTel(String f_alarmTel) {
		this.f_alarmTel = f_alarmTel;
	}
	public int getF_casualty() {
		return f_casualty;
	}
	public void setF_casualty(int f_casualty) {
		this.f_casualty = f_casualty;
	}
	public String getF_state() {
		return f_state;
	}
	public void setF_state(String f_state) {
		this.f_state = f_state;
	}
	public String getF_firesituation() {
		return f_firesituation;
	}
	public void setF_firesituation(String f_firesituation) {
		this.f_firesituation = f_firesituation;
	}
	public String getF_firesi() {
		return f_firesi;
	}
	public void setF_firesi(String f_firesi) {
		this.f_firesi = f_firesi;
	}
	public String getF_collapsearea() {
		return f_collapsearea;
	}
	public void setF_collapsearea(String f_collapsearea) {
		this.f_collapsearea = f_collapsearea;
	}
	public String getF_collapse() {
		return f_collapse;
	}
	public void setF_collapse(String f_collapse) {
		this.f_collapse = f_collapse;
	}
      
      
}
