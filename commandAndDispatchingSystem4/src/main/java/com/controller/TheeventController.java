package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.google.gson.Gson;
import com.lovo.bean.CarBean;
import com.lovo.bean.EmployeesBean;
import com.lovo.bean.StatisticalBean;
import com.lovo.bean.TheeventBean;
import com.lovo.bean.TheeventJsonBean;
import com.lovo.service.IAmqSenderService;
import com.lovo.service.ICarService;
import com.lovo.service.IEmployeesBeanService;
import com.lovo.service.IStatisticalBeanService;
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
	  @Resource(name="amqSenderService")
	private IAmqSenderService amqSenderService;
	
	  @Autowired
		 private IStatisticalBeanService statisticalBeanService;
	  
	 /**
	  * 获取时间信息
	  * @param site
	  * @param type
	  * @param area
	  * @return
	  */
	 @RequestMapping("TheEvent.lovo")
	 @ResponseBody
	 public  List<TheeventBean> TheEvent(String site,String area) {
		 List<TheeventBean> eventList = theeventBeanService.findBitm(area,site);
		
		 return eventList;
	 }
	 
	 @RequestMapping("getJsonp.lovo")
		@ResponseBody
		public void getJsonp(String theFunction,HttpServletResponse response) throws IOException {
		
		    StatisticalBean find = statisticalBeanService.find(1);
		    Integer car= find.getTotalCar();
		    Integer employees= find.getTotalPerson();
			theFunction = theFunction + "({carCount:"+car+",firemanCount:"+employees+"})";
			PrintWriter out  = response.getWriter();
			out.write(theFunction);
		}

	 
	 /**
	  * 派遣
	  * @param person 人
	  * @param car 车
	  * @return
	  */
	 @RequestMapping("dispatch.lovo")
	 @ResponseBody
	 public String dispatch(String messageId,String person,String car,String fz) {	
		
		 String chu="出勤";
		 String[] perStr =  person.split(",");
		 String[] carStr =  car.split(",");
	     
		 TheeventBean findById = theeventBeanService.findById(Integer.parseInt(messageId));
		          String num= findById.getTheEventNum();
		          
		       
		      
		  List<EmployeesBean>  perStrList=new ArrayList<>(perStr.length);
	
		  List<CarBean>  carList=new ArrayList<CarBean>(carStr.length);
	            
		 String	min= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	
		 for (String p : perStr) {
			   employeesBeanService.updateState(messageId, min, null, chu, p);
			   EmployeesBean e1=	new EmployeesBean();
				  e1.setName(p);
				  e1.setSendData(min);
				  perStrList.add(e1);
		}
		 for (String c : carStr) {
			  carService.updateState(messageId, min, null, chu, c);
			  CarBean c1=new CarBean();
			  c1.setPlateNumber(c);
			  c1.setSendData(min);
			  carList.add(c1);
		}
		 theeventBeanService.updateTheevent("处理中", Integer.parseInt(messageId));
		 
		  TheeventJsonBean json=new TheeventJsonBean();
		 json.setTheeventnumber(num);
		 json.setCar(carList);
		 json.setEmployees(perStrList);
		 json.setHead(fz);
		 
		 Gson gs=new Gson();
		String aa= gs.toJson(json);
		  
		 amqSenderService.sendMsgQueue(aa);
		 
		
		 return "0";
		 
		
		 
	 }
}
