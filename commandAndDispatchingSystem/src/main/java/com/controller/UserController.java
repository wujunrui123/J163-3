package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.bean.UserBean;
import com.lovo.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("userAdd.lovo")
	public ModelAndView add(HttpServletRequest rq) {
		ModelAndView mv = new ModelAndView("findUserTable");
		String name = rq.getParameter("name");
		String userName = rq.getParameter("userName");
		String password = rq.getParameter("password");
		String phone = rq.getParameter("phone");
		String sex = rq.getParameter("sex");
		UserBean user = new UserBean();
		user.setName(name);
		user.setUserName(userName);
		user.setPassword(password);
		user.setPhone(phone);
		user.setSex(sex);
		userService.addUser(user);
		return mv;
	}

	@RequestMapping("userList.lovo")
	@ResponseBody
	public List<UserBean> findAll(HttpServletRequest rq) {
		List<UserBean> list = userService.getListUser();
		rq.getSession().setAttribute("userList", list);
		return list;
	}

	@RequestMapping("findUser.lovo")
	public ModelAndView findById(HttpServletRequest rq) {
		ModelAndView mv=new ModelAndView("findUser");
		int id = Integer.parseInt(rq.getParameter("id"));
		UserBean user = userService.getUserByUserId(id);
		mv.addObject("UserBean", user);
		return mv;
	}

	@RequestMapping("delUser.lovo")
	@ResponseBody
	public void del(HttpServletRequest rq) {
		int id = Integer.parseInt(rq.getParameter("id"));
		userService.delUser(id);
	}

}
