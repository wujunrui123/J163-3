package com.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovo.bean.UserBean;
import com.lovo.bean.WorkBean;
import com.lovo.service.IUserService;
import com.lovo.service.IWorkService;

@Controller
public class WorkController {
	@Autowired
	private IWorkService workService;
	@Autowired
	private IUserService userService;

	@RequestMapping("workList.lovo")
	@ResponseBody
	public List<WorkBean> findAll(HttpServletRequest rq){
		List<WorkBean> list=workService.findAll();
		rq.getSession().setAttribute("workList", list);
		return list;
	}
	
	@RequestMapping("log.lovo")
	public String findA(HttpServletRequest rq){
		List<WorkBean> list=workService.findAll();
		rq.getSession().setAttribute("workList", list);
		return "redirect:jsp/findWorkTable.jsp";
	}
	
	
	@RequestMapping("addWorkFindAllUser.lovo")
	public String findAllUser(HttpServletRequest rq) {
		List<UserBean> userList=userService.getListUser();
		rq.getSession().setAttribute("userList", userList);
		return "redirect:/jsp/addWorker.jsp";
	}
	@RequestMapping("addWork.lovo")
	public String add(String userName,String startDate,String endDate,HttpServletRequest rq) {
		workService.addWork(new WorkBean(startDate, endDate, userName, ""));
		return "redirect:/jsp/findWorkTable.jsp";
	}
	@RequestMapping("delWork.lovo")
	public String del(HttpServletRequest rq) {
		int id = Integer.parseInt(rq.getParameter("id"));
		workService.delWork(id);
		return "redirect:/jsp/findWorkTable.jsp";
	}
	@RequestMapping("findWorkByItem.lovo")
	public String findByItem(String startDate,String endDate,String name,HttpServletRequest rq) {
		
		if("".equals(name)) {
			name=null;
		}
		Date start=null;
		if(!"".equals(startDate)) {
			start =Date.valueOf(startDate);
		}
		Date end=null;
		if(!"".equals(endDate)) {
			end =Date.valueOf(endDate);
		}
		System.out.println(start+","+end+","+name);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("startDateStart", start);
		map.put("startDateEnd", end);
		map.put("userName", name);
		List<WorkBean> list = workService.findByItem(map);
		
		rq.getSession().setAttribute("workList", list);
		return "redirect:/jsp/findWorkTable.jsp";
	}
}
