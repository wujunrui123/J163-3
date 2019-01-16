package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.lovo.bean.UserBean;
import com.lovo.bean.UserRoleEntity;
import com.lovo.service.IUserRoleService;
import com.lovo.service.impl.RoleServiceImpl;
import com.lovo.service.impl.UserServiceImpl;
@Controller
public class UserController {
	@Autowired
    private UserServiceImpl u;

	/**
	 * 查询用户集合
	 * @param rq
	 * @return
	 */
	@RequestMapping("user.lovo")
	public String getuserli(HttpServletRequest rq) {
	   List<UserBean> userli= u.getListUser();
	    rq.setAttribute("userli", userli);
		return "user1";
	}
	
    /**
     * 登陆
     * @param name
     * @param pwd
     * @return
     */
	@RequestMapping("login.lovo")
	@ResponseBody
	public String getuserli(String name,String pwd) {
	   
	
		return name;
	}
	
}
