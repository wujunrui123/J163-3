package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lovo.bean.TheeventBean;
import com.lovo.service.ICarService;
import com.lovo.service.IEmployeesBeanService;
import com.lovo.service.ITheeventBeanService;
import com.lovo.service.IUserService;

@Controller
public class TheeventController {

	 @Autowired
	 private ITheeventBeanService  theeventBeanService;
	 @Autowired
	 private ICarService carService;
	 @Autowired
	 private IEmployeesBeanService employeesBeanService;
	 /**
	  * 获取时间信息
	  * @param site
	  * @param type
	  * @param area
	  * @return
	  */
	 @RequestMapping("TheEvent.lovo")
	 @ResponseBody
	 public  List<TheeventBean> TheEvent(String site,String type,String area) {
		 List<TheeventBean> eventList = theeventBeanService.findBitm(area, type, site);
		 return eventList;
	 }
	 
	 /**
	  * 派遣
	  * @param person 人
	  * @param car 车
	  * @return
	  */
	 @RequestMapping("dispatch.lovo")
	 public ModelAndView dispatch(String messageId,String person,String car) {	
		 String[] perStr =  person.split(",");
		 for (String p : perStr) {
			 employeesBeanService.updateState(messageId, new SimpleDateFormat("yyyy-MM-dd").format(new Date()), null, "出勤", p);
		}
		 
		 String[] carStr =  car.split(",");
		 for (String c : carStr) {
			 carService.updateState(messageId, new SimpleDateFormat("yyyy-MM-dd").format(new Date()), null, "出勤", c);
		}
		 ModelAndView mv = new ModelAndView();
		 RedirectView rv = new RedirectView("jsp/main2.jsp");
		 
		 mv.setView(rv);
		 return mv;
	 }
}
