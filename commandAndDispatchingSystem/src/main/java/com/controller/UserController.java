package com.controller;

<<<<<<< HEAD
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovo.bean.UserBean;
import com.lovo.bean.WorkBean;
import com.lovo.service.IPowerService;
import com.lovo.service.IUserService;
import com.lovo.service.IWorkService;
import com.lovo.service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	@Autowired
	private IWorkService workService;
	@Autowired
	private IPowerService powerService;
	
	

	/**
	 * 查询用户集合用户权限管理（添）
	 * @param rq
	 * @return
	 */
	@RequestMapping("user.lovo")
	public String getuserli(HttpServletRequest rq) {
		PageHelper.startPage(1, 1, true);

	    List<UserBean> userli= userService.getListUser();
	    rq.setAttribute("userli", userli);
	    PageInfo<UserBean> pageInfo = new PageInfo<UserBean>(userli);
	    rq.setAttribute("zong",  pageInfo.getPages());
		return "user1";
	}
	
	/**
	 * （添）
	 * @param curr
	 * @param sq
	 * @return
	 */
	@RequestMapping("chauser.lovo")
	@ResponseBody
	public  List<UserBean> chauser(int curr,HttpServletRequest sq) {
		PageHelper.startPage(curr, 1, true);
       System.out.println("分页跳转");
	    List<UserBean> userli= userService.getListUser();
	   
		return userli;
	}
	
	
	
	
	
	
	
	@RequestMapping("login.lovo")
	@ResponseBody
	public UserBean login(String userName,String password,HttpServletRequest rq) {
		UserBean user =  userService.login(userName, password);
		
		if(user != null) {
			Integer id = user.getUserID();
			rq.getSession().setAttribute("id", id);
			rq.getSession().setAttribute("UserBean", user);
			rq.getSession().setAttribute("username", user.getUserName());
			rq.getSession().setAttribute("powerli",powerService.getListPower(user.getUserID()));
			return user;
		}
		return user;
	}
	
	@RequestMapping("updateMe.lovo")
	public ModelAndView updateMe(HttpServletRequest rq,String password) {
		UserBean ub=(UserBean) rq.getSession().getAttribute("UserBean");
		int id=ub.getUserID();
		userService.updateUser( password, id);
		ModelAndView mv=new ModelAndView();
		RedirectView rv=new RedirectView("jsp/findUserTable.jsp");
		mv.setView(rv);
		return mv;
	}
	
	@RequestMapping("userAdd.lovo")
	public String add(HttpServletRequest rq) {
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
		return "redirect:/jsp/findUserTable.jsp";
	}

	@RequestMapping("userList.lovo")
	@ResponseBody
	public List<UserBean> findAll(HttpServletRequest rq) {
		List<UserBean> list = userService.getListUser();
		for (int i = 0; i < list.size(); i++) {
			String isSex=list.get(i).getSex();
			if(isSex.equals("0")) {
				list.get(i).setSex("女");
			}else {
				list.get(i).setSex("男");
			}
		}
		rq.getSession().setAttribute("userList", list);
		return list;
	}

	@RequestMapping("findByItem.lovo")
	public String findByItem(HttpServletRequest rq) {
		String sex=rq.getParameter("sex");
		if("noChoose".equals(sex)) {
			sex=null;
		}
		String name=rq.getParameter("name");
		if("".equals(name)) {
			name=null;
		}
		Map<String, String> map=new HashMap<String, String>();
		map.put("sex", sex);
		map.put("name", name);
		List<UserBean> list = userService.findByItem(map);
		for (int i = 0; i < list.size(); i++) {
			String isSex=list.get(i).getSex();
			if(isSex.equals("0")) {
				list.get(i).setSex("女");
			}else {
				list.get(i).setSex("男");
			}
		}
		rq.getSession().setAttribute("userList", list);
		return "redirect:/jsp/findUserTable.jsp";
	}
	
	@RequestMapping("findUser.lovo")
	public ModelAndView findById(HttpServletRequest rq) {
		ModelAndView mv=new ModelAndView("findUser");
		int id = Integer.parseInt(rq.getParameter("id"));
		UserBean user = userService.getUserByUserId(id);
		String sex=user.getSex();
		if(sex.equals("0")) {
			user.setSex("女");
		}else {
			user.setSex("男");
		}	
		
		mv.addObject("UserBean", user);
		return mv;
	}

	@RequestMapping("delUser.lovo")
	public String del(HttpServletRequest rq) {
		int id = Integer.parseInt(rq.getParameter("id"));
		userService.delUser(id);
		return "redirect:/jsp/findUserTable.jsp";
	}
	@RequestMapping("jiaojieban.lovo")
	public ModelAndView jiaojieban(String log,String firstPwd,String secondName,String secondPwd,HttpServletRequest rq) {
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		String endDate=s.format(new java.util.Date());
		WorkBean wb=workService.findByEndTime(endDate);
		int workID=wb.getWorkID();
		ModelAndView mv=null;
		UserBean ub1=(UserBean) rq.getSession().getAttribute("UserBean");
		if(!ub1.getPassword().equals(firstPwd)) {
			System.out.println("first密码错误");
			return mv=new ModelAndView("jiaojieban");
		}
		UserBean ub2=userService.login(secondName, secondPwd);
		if(ub2 != null) {
			Integer id = ub2.getUserID();
			rq.getSession().setAttribute("id", id);
			rq.getSession().setAttribute("UserBean", ub2);
			workService.writeLog(log, workID);
		}else {
			System.out.println("second密码错误");
			return mv=new ModelAndView("jiaojieban");
		}
		
		mv=new ModelAndView();
		RedirectView rv=new RedirectView("log.lovo");
		mv.setView(rv);
		return mv;
	}
=======
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

>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
}
