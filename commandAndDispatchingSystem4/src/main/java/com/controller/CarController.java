package com.controller;

import java.lang.ProcessBuilder.Redirect;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lovo.bean.CarBean;
import com.lovo.service.ICarService;

@Controller
public class CarController {

	 @Autowired
	 private ICarService carService;
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
		 carService.updateState(id, sendData, new SimpleDateFormat("yyyy-MM-dd").format(new Date()), "在线", plateNumber);
		 List<CarBean> list = carService.findCarByzaixian(Integer.parseInt(id));
		 sq.getSession().setAttribute("list", list);
		 sq.getSession().setAttribute("id", id);
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
