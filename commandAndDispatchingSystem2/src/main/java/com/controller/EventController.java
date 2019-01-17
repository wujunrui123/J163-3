package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovo.bean.ContinueBean;
import com.lovo.bean.DTOBean;
import com.lovo.bean.EventBean;
import com.lovo.bean.EventResourceBean;
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
         
		
		  rq.setAttribute("eve", e);
		return "resources";
		
	}


	
}
