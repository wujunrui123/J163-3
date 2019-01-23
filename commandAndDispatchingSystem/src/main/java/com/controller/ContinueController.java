package com.controller;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
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
@RequestMapping("continueThing")
public class ContinueController {

	@Autowired
	private IThingService thingService;
	
	
	@Autowired
	private IContinueService continueService;
	
	/**
	 * 续报表
	 * @return
	 */
	@RequestMapping("findByThingId.lovo")
	@ResponseBody
	public Map<String, Object> findListRole(int thingID,String curr,HttpServletRequest rq){
		int curr1=Integer.parseInt(curr);
		PageHelper.startPage(curr1, 2);
		List<ContinueEntity>list=continueService.findByThingId(thingID);		
		PageInfo<ContinueEntity> pageInfo = new PageInfo<ContinueEntity>(list);
		int tot=pageInfo.getPages();
		//System.out.println(tot+"");
		Map<String, Object>map2=new HashMap<String,Object>();
		map2.put("list", list);
		map2.put("tot", tot);	
		//把结果放入模型
	    return map2;
	}

}
