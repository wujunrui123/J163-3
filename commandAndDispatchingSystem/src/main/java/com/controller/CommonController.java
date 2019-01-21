package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

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
import com.lovo.bean.RoleEntity;
import com.lovo.bean.ThingEntity;
import com.lovo.bean.UserBean;
import com.lovo.bean.UserRoleEntity;
import com.lovo.service.ICommonService;
import com.lovo.service.IRoleService;
import com.lovo.service.IThingService;
import com.lovo.service.IUserRoleService;
import com.lovo.service.IUserService;

@Controller
@RequestMapping("common")
public class CommonController {

	@Autowired
	private ICommonService commonService;

	@RequestMapping("addCommon.lovo")
	public String addCommon(HttpServletRequest rq) {
		CommonEntity commonEntity = new CommonEntity();
		commonEntity.setType(rq.getParameter("role"));
		commonEntity.setKey(rq.getParameter("key"));
		commonEntity.setValue(rq.getParameter("value"));
		commonService.add(commonEntity);
		return "redirect:/jsp/commonTable.jsp";
	}

	@RequestMapping("findAll.lovo")
	@ResponseBody
	public Map<String, Object> findAll(String curr) {
		int curr2=Integer.parseInt(curr);
		PageHelper.startPage(curr2, 2);
		List<CommonEntity> list = (List<CommonEntity>) commonService.findAll();
		PageInfo<CommonEntity> pageInfo = new PageInfo<CommonEntity>(list);
		int tot=pageInfo.getPages();
		//System.out.println(tot+"");
		Map<String, Object>map2=new HashMap<String,Object>();
		map2.put("list", list);
		map2.put("tot", tot);
		
		return map2;
	}

	@RequestMapping("update.lovo")
	public String update(String id,HttpServletRequest rq){
		int nid=Integer.parseInt(id);
		CommonEntity commonEntity=commonService.findById(nid);
		rq.getSession().setAttribute("com", commonEntity);
		
		return "redirect:/jsp/updateCommon.jsp";
	}

	@RequestMapping("updateCommon.lovo")
	public String update(HttpServletRequest rq) {
		int id = Integer.parseInt(rq.getParameter("id"));
		commonService.update(id, rq.getParameter("key"));
		return "redirect:/jsp/commonTable.jsp";
	}
	
	@RequestMapping("del.lovo")
	public String del(String id) {
		int nid=Integer.parseInt(id);
		commonService.del(nid);
		return "redirect:/jsp/commonTable.jsp";
	}

}
