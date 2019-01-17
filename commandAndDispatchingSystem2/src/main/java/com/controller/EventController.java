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
import com.lovo.bean.DTOBean;
import com.lovo.bean.EventBean;
import com.lovo.bean.UserBean;
import com.lovo.service.IEventService;
import com.lovo.service.IUserService;

@Controller
public class EventController {
	@Autowired
    private IEventService eventService;
	@Autowired
    private IUserService userService;
	
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
	public String getuserli(HttpServletRequest rq) {
	     
	   /* rq.setAttribute("userli", userli);*/
		return "user1";
	}


	
}
