package com.controller;

import java.lang.ProcessBuilder.Redirect;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.google.gson.Gson;
import com.lovo.bean.CarBean;
import com.lovo.bean.TheeventBean;
import com.lovo.bean.TheeventJsonBean;
import com.lovo.service.IAmqSenderService;
import com.lovo.service.ICarService;
import com.lovo.service.ITheeventBeanService;

@Controller
public class CarController {
	 @Autowired
	 private ITheeventBeanService  theeventBeanService;
	 @Autowired
	 private ICarService carService;
	 
	  @Resource(name="amqSenderService")
		private IAmqSenderService amqSenderService;
	 
	 /**
	  * 获取可派遣的车辆
	  * @return
	  */
	 @RequestMapping("findCar.lovo")
	 @ResponseBody
	 public  List<CarBean> findCar() {
		 List<CarBean> list = carService.findAll();
		 return list;
	 }
	 
	 @RequestMapping("findEventById.lovo")
	 public ModelAndView findEventById(String id,String name,String area,HttpServletRequest sq) {
		 List<CarBean> carList = carService.findBitm(Integer.parseInt(id));
		 sq.getSession().setAttribute("carList", carList);
		 sq.getSession().setAttribute("id", id);
		 sq.getSession().setAttribute("name", name);
		 sq.getSession().setAttribute("area", area);
		 ModelAndView mv = new ModelAndView();
		 RedirectView rv = new RedirectView("jsp/main4.jsp");
		 mv.setView(rv);
		 return mv;
	 }
	 
	 @RequestMapping("updateCar.lovo")
	 public ModelAndView updateCar(String id,String sendData,String plateNumber,HttpServletRequest sq) {
		 List<CarBean>  carList=new ArrayList<CarBean>();
		 
		 TheeventBean findById = theeventBeanService.findById(Integer.parseInt(id));
         String num= findById.getTheEventNum();
         
         String	min= new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		 carService.updateState(id, sendData, min, "在线", plateNumber);
		 List<CarBean> list = carService.findCarByzaixian(Integer.parseInt(id));
		 sq.getSession().setAttribute("list", list);
		 sq.getSession().setAttribute("id", id);
		 
		 
		 CarBean c1=new CarBean();
		 
		  c1.setPlateNumber(plateNumber);
		  c1.setBackDate(min);
		  c1.setState("回归");
		  carList.add(c1);
		 
		 
		  TheeventJsonBean json=new TheeventJsonBean();
			 json.setTheeventnumber(num);
		     json.setCar(carList);
		     
			 Gson gs=new Gson();
			String aa= gs.toJson(json);
			 amqSenderService.sendMsgQueue(aa);
		 
			 ModelAndView mv = new ModelAndView();
		 RedirectView rv = new RedirectView("jsp/main4.jsp");
		 mv.setView(rv);
		 return mv;
	 }
	 
	 /**
	  * 查询所有车辆
	  * @param state
	  * @return
	  */
	 @RequestMapping("findCarList.lovo")
	 @ResponseBody
	 public List<CarBean> findCarList(String state){
		 List<CarBean> list = carService.findByItem(state);
		
		 return list;
	 }
	 /**
	  * 修改车辆
	  * @param plateNumber
	  * @param id
	  * @return
	  */
	 @RequestMapping("UpdateplateNumber.lovo")
	 @ResponseBody
	 public String UpdateplateNumber(String plateNumber,String id ) {
		 
		 carService.updateCar(plateNumber, Integer.parseInt(id));
		 
		 return "0";
	 }
	 
	 @RequestMapping("AddCar.lovo")
	 @ResponseBody
	 public String AddCar(String plateNumber,String state ) {
		 CarBean c=new CarBean();
		 c.setPlateNumber(plateNumber);
		 c.setState(state);
		 carService.addCar(c);
		 return "0";
	 }
}
