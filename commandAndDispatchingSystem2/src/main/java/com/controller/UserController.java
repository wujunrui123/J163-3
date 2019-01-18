package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.github.pagehelper.PageHelper;
import com.lovo.bean.UserBean;
import com.lovo.service.IUserService;
import com.lovo.service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
    private UserServiceImpl u;
	@Autowired
	private IUserService userService;

	/**
	 * 查询用户集合
	 * @param rq
	 * @return
	 */
	@RequestMapping("user.lovo")
	public String getuserli(HttpServletRequest rq) {
		PageHelper.startPage(1, 1, true);

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
	public UserBean login(String name,String pwd,HttpServletRequest sq) {
		UserBean user =  userService.login(name, pwd);
		if(user != null) {
			Integer id = user.getId();
			sq.getSession().setAttribute("id", id);
			return user;
		}
		return user;
	}

	/**
	 * 根据id查用户
	 * @param sq
	 * @return
	 */
	@RequestMapping("getUserByUserid.lovo")
	@ResponseBody
	public UserBean getUserByUserid(HttpServletRequest sq) {
		Integer id = (Integer) sq.getSession().getAttribute("id");
		UserBean user = userService.getUserByUserId(id);
		return user;
	}
	
	/**
	 * 修改用户的电话和密码
	 * @param tel
	 * @param emil
	 * @param id
	 * @return
	 */
	@RequestMapping("updateUserInfoById.lovo")
	@ResponseBody
	public String updateUserInfoById(String tel, String emil, String id) {
		userService.updateUserInfoByUserId(tel, emil, Integer.parseInt(id));
		return "0";
	}
	
	/**
	 * 修改密码
	 * @param password
	 * @param newpwd
	 * @param rnewpwd
	 * @param sq
	 * @return
	 */
	@RequestMapping("updatePasswordById.lovo")
	@ResponseBody
	public String updatePasswordByUserId(String password, String newpwd, String rnewpwd,HttpServletRequest sq) {
		Integer id = (Integer) sq.getSession().getAttribute("id");
		UserBean user = userService.getUserByUserId(id);
		if(!user.getPassword().equals(password)) {
			return "{'a':'0'}";
		}
		if(newpwd.equals(rnewpwd)) {
			userService.updatePasswordByUserId(newpwd, id);
			return "{'a':'1'}";
		}
		return "{'a':'2'}";
	}
	
}
