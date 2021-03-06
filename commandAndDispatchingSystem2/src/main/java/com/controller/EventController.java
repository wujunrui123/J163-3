package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovo.bean.ContinueBean;
import com.lovo.bean.DTOBean;
import com.lovo.bean.DTOBean2;
import com.lovo.bean.DTOBean4;
import com.lovo.bean.EventBean;
import com.lovo.bean.EventResourceBean;
import com.lovo.bean.ResourceareasBean;
import com.lovo.bean.ResourcesBean;
import com.lovo.bean.UserBean;
import com.lovo.service.IEventResourceService;
import com.lovo.service.IEventService;
import com.lovo.service.IResourcesService;
import com.lovo.service.IUserService;

@Controller
public class EventController {
	@Autowired
    private IEventService eventService;
	@Autowired
    private IEventResourceService eventResourceService;
	@Autowired
    private IResourcesService resourcesService;
	
	@RequestMapping("event.lovo")
	@ResponseBody
	public DTOBean getuserli(String num,String state, String statTime, String endTime,int curr) {
	   Map<String, Object> map=new HashMap<String, Object>();
	   if(num.length()==0) {
		   num=null;
	   }
	   if(state.length()==0) {
		   state=null;
	   }
	   if(statTime.length()==0) {
		   statTime=null;
	   }
	   if(endTime.length()==0) {
		   endTime=null;
	   }
	  
	   map.put("eventNum", num);
	
	  
	   map.put("state", state);
	 
	
	   map.put("stattime", statTime);
	 
	
	   map.put("endtime", endTime);
	 
	    PageHelper.startPage(curr, 1, true);
	   
		List<EventBean> li=eventService.findAll(map);
		
		
		 PageInfo<EventBean> pageInfo = new PageInfo<EventBean>(li);
		//将总页码和 集合放在 传输bean里   发送至页面
	 DTOBean  dto= new DTOBean(pageInfo.getPages(), li);
		return dto;
	}
	
	@RequestMapping("showEvent.lovo")
	public String getuserli(int id,HttpServletRequest rq) {
		  EventBean e= eventService.findEventById(id);
		  List<ContinueBean> con =eventService.findContByEvid(e.getPk_id());
		  List<EventResourceBean> resli=eventResourceService.findResourByEveId(e.getPk_id());
	      rq.setAttribute("e", e);
	      
	      if(e.getF_type().equals("火灾")) {
	    	  rq.setAttribute("describe1", e.getF_firesi());
	    	  rq.setAttribute("describe", e.getF_firesituation());
	    	  rq.setAttribute("type", "火灾情况描述");
	    	  rq.setAttribute("type1", "火源");
	      }else if(e.getF_type().equals("崩塌")){
	    	  rq.setAttribute("describe1", e.getF_collapse());
	    	  rq.setAttribute("describe", e.getF_collapsearea());
	    	  rq.setAttribute("type", "崩塌面积");
	    	  rq.setAttribute("type1", "坍塌原因");
	      }
         rq.setAttribute("conli", con);
         for (EventResourceBean ev : resli) {
			if(ev.getF_outDate()==null) {
				ev.setF_Duty("未派出");
				ev.setF_DutyTel("未派出");
				ev.setF_outDate("未派出");
			}
		}
	      rq.setAttribute("resli", resli);
		  return "eventShow";
	}
	
	
	@RequestMapping("showResource.lovo")
	public String getreouser(int id,HttpServletRequest rq) {
	
		  List<ResourcesBean> r= resourcesService.findResourByErid(id);
		  for (ResourcesBean re : r) {
			if(re.getF_backDate()==null) {
				re.setF_backDate("未归");
			}
		}
		  rq.setAttribute("reli", r);
		return "resources";
		
	}
	
	@RequestMapping("dispatch.lovo")
	public String dispatch(int id,HttpServletRequest rq) {
		  EventBean e= eventService.findEventById(id);
		   DTOBean2 d= resourcesService.findNumByEveid(id,"医院");
		   DTOBean2 d1= resourcesService.findNumByEveid(id,"消防队");
		   if(d==null) {
			  d=new DTOBean2();
		   }
		   if(d1==null) {
				  d1=new DTOBean2();
			   }
		 
		  rq.setAttribute("eve", e);
		  rq.setAttribute("d", d);
		  rq.setAttribute("d1", d1);

		return "schedulingResources";
	}
	
	@RequestMapping("select.lovo")
	@ResponseBody
	public DTOBean4 selectres(String area,HttpServletRequest rq) {
		List<ResourceareasBean> li=resourcesService.findResByArea("医院", area);
		List<ResourceareasBean> li1=resourcesService.findResByArea("消防队", area);
	      DTOBean4 d=  new DTOBean4(li, li1);
		return d;
	}


	
}
