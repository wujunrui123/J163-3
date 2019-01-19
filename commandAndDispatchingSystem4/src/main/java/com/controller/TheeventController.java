package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lovo.bean.TheeventBean;
import com.lovo.service.ITheeventBeanService;

@Controller
public class TheeventController {

	 @Autowired
	 private ITheeventBeanService  theeventBeanService;
	 
	 @RequestMapping("Theevent.lovo")
	 public ModelAndView Theevent(String area,String type,String site,HttpServletRequest request) {
		 List<TheeventBean> findBitm = theeventBeanService.findBitm(area, type, site);
		 
		 ModelAndView mv=new ModelAndView();
		 RedirectView rv=new RedirectView("jsp/main.jsp");
		 request.getSession().setAttribute("findBitm", findBitm);
		 mv.setView(rv);
		 
		 return mv;
	 }
}