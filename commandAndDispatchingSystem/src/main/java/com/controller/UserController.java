package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lovo.bean.UserBean;
import com.lovo.bean.UserRoleEntity;
import com.lovo.service.IUserRoleService;
import com.lovo.service.impl.RoleServiceImpl;
import com.lovo.service.impl.UserServiceImpl;
@Controller
public class UserController {
	@Autowired
    private UserServiceImpl u;

	
	@RequestMapping("user.lovo")
	public String getuserli(HttpServletRequest rq) {
	   List<UserBean> userli= u.getListUser();
	    rq.setAttribute("userli", userli);
		return "user1";
	}
	

	
}
