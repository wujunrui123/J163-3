package com.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.lovo.bean.UserBean;
import com.lovo.service.IEventService;
import com.lovo.service.IUserRoleService;
import com.lovo.service.IUserService;

@Controller
public class EventController {
	@Autowired
    private IEventService eventService;
	@Autowired
    private IUserService userService;
	
	@RequestMapping("event.lovo")
	@ResponseBody
	public String getuserli(String name) {
	
	
		return name;
	}
	//测试代码
	@Test
	public void testQueryUserListLikeName() {
	    //设置分页条件，Parameters:pageNum 页码pageSize 每页显示数量count 是否进行count查询
	    PageHelper.startPage(1, 3, true);
	    List<UserBean> users = this.userService.getListUser();
	    
	    for (UserBean user : users) {
	        System.out.println(user);
	    }
	}

	

	
}
