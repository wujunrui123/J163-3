package com.controller;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lovo.bean.RoleEntity;
import com.lovo.bean.UserBean;
import com.lovo.bean.UserRoleEntity;
import com.lovo.service.IRoleService;
import com.lovo.service.IUserRoleService;
import com.lovo.service.IUserService;



@Controller
public class RoleController {

@Autowired
	private IRoleService roleService;
	@Autowired
	private IUserService userService ;
	@Autowired
    private IUserRoleService userRoleService;
	/**
	 * 根据用户id查询用户拥有的权限
	 * @return
	 */
	@RequestMapping("findListRole.lovo")
	public String findListRole(int id,HttpServletRequest rq){
	     UserBean user=userService.getUserByUserId(id);
		
		//获得角色集合
		List<RoleEntity> listRole=roleService.getListRole(id);
		//获取不拥有的角色集合
		List<RoleEntity> notRole=roleService.getNotRole(id);
		//把结果放入模型
		Map<String, Object>map=new HashMap<String,Object>();
		map.put("listRole", listRole);
		map.put("user", user);
		map.put("notRole", notRole);
		rq.getSession().setAttribute("map", map);
		
		
		
		return "redirect:/jsp/role.jsp";
	}
	/**
	 * 根据用户id给用户添加角色
	 * @param ur
	 * @param rq
	 * @return
	 */
	@RequestMapping("addRole.lovo")
	public ModelAndView addRole(UserRoleEntity ur,HttpServletRequest rq) {
		userRoleService.addRoleByUserid(ur);
		ModelAndView mv=new ModelAndView();
		RedirectView rv=new RedirectView("findListRole.lovo?id="+ur.getUserid());
		mv.setView(rv);
		return mv;
	}
	/**
	 * 根据用户id  删除角色
	 * @param ur
	 * @param rq
	 * @return
	 */
	@RequestMapping("delRole.lovo")
	public ModelAndView delRole(UserRoleEntity ur,HttpServletRequest rq) {
		userRoleService.delRoleByUserid(ur.getUserid(),ur.getRoleid());
		ModelAndView mv=new ModelAndView();
		RedirectView rv=new RedirectView("findListRole.lovo?id="+ur.getUserid());
		mv.setView(rv);
		return mv;
		
	}

	
	
	
	
	
}
