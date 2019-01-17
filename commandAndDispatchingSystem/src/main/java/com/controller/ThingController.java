package com.controller;

import org.springframework.stereotype.Controller;

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
import com.lovo.bean.RoleEntity;
import com.lovo.bean.ThingEntity;
import com.lovo.bean.UserBean;
import com.lovo.bean.UserRoleEntity;
import com.lovo.service.IRoleService;
import com.lovo.service.IThingService;
import com.lovo.service.IUserRoleService;
import com.lovo.service.IUserService;



@Controller
public class ThingController {

	@Autowired
	private IThingService thingService;
	
	/**
	 * 事件一览
	 * @return
	 */
	@RequestMapping("find.lovo")
	@ResponseBody
	public List<ThingEntity> findListRole(){
		PageHelper.startPage(1, 2);
		Map<String, Object>map=new HashMap<String,Object>();
		map.put("thingName", null);
		map.put("area", null);
		map.put("startDate", null);
		map.put("endDate", null);
		map.put("thingType", "否");
		map.put("thingState", null);
		List<ThingEntity>list=thingService.find(map);
	    for (ThingEntity thingEntity : list) {
			System.out.println(thingEntity.toString());
		}
	
		
		//把结果放入模型
	    return list;
	}
	
	

	
	
	
	
	
}
