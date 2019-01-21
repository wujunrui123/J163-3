package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
