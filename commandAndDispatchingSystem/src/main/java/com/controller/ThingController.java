package com.controller;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovo.bean.CommonEntity;
import com.lovo.bean.ContinueEntity;
import com.lovo.bean.RoleEntity;
import com.lovo.bean.ThingEntity;
import com.lovo.bean.UserBean;
import com.lovo.bean.UserRoleEntity;
import com.lovo.service.ICommonService;
import com.lovo.service.IContinueService;
import com.lovo.service.IRoleService;
import com.lovo.service.IThingService;
import com.lovo.service.IUserRoleService;
import com.lovo.service.IUserService;



@Controller
@RequestMapping("thing")
public class ThingController {

	@Autowired
	private IThingService thingService;
	@Autowired
	private ICommonService commonService;
	
	@Autowired
	private IContinueService continueService;
	
	/**
	 * 事件一览
	 * @return
	 */
	@RequestMapping("find.lovo")
	@ResponseBody
	public Map<String, Object> findListRole(String curr,String thingName,String endDate,String startDate,String area,String thingType,String uploadType,HttpServletRequest rq){
		List<CommonEntity>listType =commonService.findByType("类型");
		List<CommonEntity>listGrade =commonService.findByType("等级");
		rq.getSession().setAttribute("list", listType);
		rq.getSession().setAttribute("list2", listGrade);
		//System.out.println(curr);
		//String curr=rq.getParameter("curr");
//		String limit=rq.getParameter("limit");
//		String curr=(String) m.get("curr");
//		String limit=(String) m.get("limit");
		int curr1=Integer.parseInt(curr);

		
		
		
		PageHelper.startPage(curr1, 2);
		
		if(thingName.length()==0) {
			thingName=null;
		}
		if(endDate.length()==0) {
			endDate=null;
		}
		if(startDate.length()==0) {
			startDate=null;
		}
		if(area.length()==0) {
			area=null;
		}
		if(thingType.length()==0) {
			thingType=null;
		}
		if(uploadType.length()==0) {
			uploadType=null;
		}		
		Map<String, Object>map=new HashMap<String,Object>();
		map.put("thingName", thingName);
		
		
		
		map.put("area", area);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("thingType", thingType);
		map.put("uploadType", uploadType);
		List<ThingEntity>list=thingService.find(map);	
		PageInfo<ThingEntity> pageInfo = new PageInfo<ThingEntity>(list);
		int tot=pageInfo.getPages();
		//System.out.println(tot+"");
		Map<String, Object>map2=new HashMap<String,Object>();
		map2.put("list", list);
		map2.put("tot", tot);
		
		
		
		//把结果放入模型
	    return map2;
	}
	
	@RequestMapping("findById.lovo")
	public String findById(int id,HttpServletRequest rq){
		ThingEntity thingEntity=thingService.findById(id);
		rq.getSession().setAttribute("thingEntity", thingEntity);
		return "redirect:/jsp/findThing.jsp";
	}
	
	
	@RequestMapping("add.lovo")
	public String add(HttpServletRequest rq) {
		List<CommonEntity>list =commonService.findByType("类型");
		List<CommonEntity>list2 =commonService.findByType("等级");
		rq.getSession().setAttribute("list", list);
		rq.getSession().setAttribute("list2", list2);
		
		return "redirect:/jsp/addThing.jsp";
	}
	
	@RequestMapping("addContinue.lovo")
	public String addContinue(int id,HttpServletRequest rq) {
		ThingEntity thingEntity= thingService.findById(id);
		rq.getSession().setAttribute("thingEntity", thingEntity);
		
		return "redirect:/jsp/addContinueThing.jsp";
	}
	
	@RequestMapping("addContinueThing.lovo")
	public String addContinueThing(int id,String grade,int peopleNum,String callName,String phone,String uploadDate,String uploadName,HttpServletRequest rq) {
		ContinueEntity continueEntity=new ContinueEntity();
		continueEntity.setCallName(callName);
		continueEntity.setCallphone(phone);
		continueEntity.setGrade(grade);
		continueEntity.setPeopleNum(peopleNum);
		continueEntity.setThingID(id);
		continueEntity.setUploadDate(uploadDate);
		continueEntity.setUploadName(uploadName);
<<<<<<< HEAD
		ThingEntity thingEntity= thingService.findById(id);
		String thingCard=thingEntity.getThingCard();
		continueEntity.setThingCard(thingCard);
=======
		
		
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
		continueService.add(continueEntity);
		
		
		
		return "redirect:/jsp/main.jsp";
	}
	
	
	@RequestMapping("update.lovo")
	public String update(int id,HttpServletRequest rq) {
		ThingEntity thingEntity= thingService.findById(id);
		rq.getSession().setAttribute("thingEntity", thingEntity);		
		return "redirect:/jsp/updateThing.jsp";
	}
	
	
	@RequestMapping("updateType.lovo")
	public String updateType(int id,HttpServletRequest rq) {
//		int thingId=Integer.parseInt("id");
		thingService.updateType(id, "是");
		
		return "redirect:/jsp/main.jsp";
	}
	@RequestMapping("del.lovo")
	public String del(int id,HttpServletRequest rq) {
		thingService.del(id);
		return "redirect:/jsp/main.jsp";
	}
	
	
	
	@RequestMapping("addThing.lovo")
	public String addThing(HttpServletRequest rq) {
		ThingEntity thingEntity=new ThingEntity();
		thingEntity.setArea(rq.getParameter("area"));
		thingEntity.setAddress(rq.getParameter("address"));
		thingEntity.setThingName(rq.getParameter("thingName"));
		thingEntity.setThingType(rq.getParameter("thingType"));
		thingEntity.setGrade(rq.getParameter("grade"));
		thingEntity.setPeopleNum(Integer.parseInt(rq.getParameter("peopleNum")));
		thingEntity.setPhone(rq.getParameter("phone"));
		thingEntity.setCallName(rq.getParameter("callName"));
		thingEntity.setCallDate(rq.getParameter("callDate"));
		thingEntity.setThingState(rq.getParameter("thingState"));
		thingEntity.setUploadName(rq.getParameter("uploadName"));
		thingEntity.setFreeName(rq.getParameter("freeName"));
		thingEntity.setFreeText(rq.getParameter("freeText"));
		thingEntity.setCrumArea(rq.getParameter("crumArea"));
		thingEntity.setCrumText(rq.getParameter("crumText"));
		thingEntity.setUploadType(rq.getParameter("否"));
		Date date=new Date();
		String thingCard=date.getTime()+"";
		thingEntity.setThingCard(thingCard);
		thingService.addThing(thingEntity);
		
		
		return "redirect:/jsp/main.jsp";
	}
	
	@RequestMapping("ceshi.lovo")
	public String ceshi(HttpServletRequest rq){
		System.out.println("1");
		return "redirect:/jsp/main.jsp";
	}

	
	
	
	
	


	
	

	
	
	
	
	
}
