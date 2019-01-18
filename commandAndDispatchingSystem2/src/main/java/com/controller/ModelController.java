package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lovo.bean.ModelEntity;
import com.lovo.service.IModelService;
/**
 * 预案模板controller
 * @author 罗义桃
 *
 */
@Controller
public class ModelController {
	
	@Autowired
	private IModelService modelService;
	
	/**
	 * 查询所有预案模板
	 * @param sq
	 * @return
	 */
	@RequestMapping("findModelAll.lovo")
	public ModelAndView findModelAll(HttpServletRequest sq) {
		List<ModelEntity> modelList = modelService.findModelAll();
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("jsp/PlanTemplate.jsp");
		sq.getSession().setAttribute("modelList", modelList);
		mv.setView(rv);
		return mv;
	} 
	
	@RequestMapping("findModelByName.lovo")
	public ModelAndView findModelByName(String modelName,HttpServletRequest sq){
		List<ModelEntity> modelList = modelService.findModelByName(modelName);
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("jsp/PlanTemplate.jsp");
		sq.getSession().setAttribute("modelList", modelList);
		mv.setView(rv);
		return mv;
	}
	
	/**
	 * 添加预案模板
	 * @param modelName
	 * @param type
	 * @param level
	 * @param perNum
	 * @param carNum
	 * @param perOfHos
	 * @param carOfHos
	 * @param creatPerson
	 * @return 返回预案模板主页
	 */
	@RequestMapping("addModel.lovo")
	public ModelAndView addModel(String modelName,String type,String level,String perNum,String carNum,String perOfHos,String carOfHos,String creatPerson) {
		ModelEntity model = new ModelEntity();
		model.setModelName(modelName);
		model.setType(type);
		model.setLevel(level);
		model.setPerNum(Integer.parseInt(perNum));
		model.setCarNum(Integer.parseInt(carNum));
		model.setPerOfHos(Integer.parseInt(perOfHos));
		model.setCarOfHos(Integer.parseInt(carOfHos));
		model.setCreatPerson(creatPerson);
		modelService.addModel(model);
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("jsp/PlanTemplate.jsp");
  		mv.setView(rv);
  		return mv;
	}
	/**
	 * 删除原模板
	 * @param id
	 * @return
	 */
	@RequestMapping("deleteModel.lovo")
	public ModelAndView deleteModel(String id) {
		modelService.delModel(Integer.parseInt(id));
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("findModelAll.lovo");
		mv.setView(rv);
		return mv;
	}
	
	@RequestMapping("findModelById.lovo")
	public ModelAndView findModelById(String id,HttpServletRequest sq){
		ModelEntity model = modelService.findModelById(Integer.parseInt(id));
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("jsp/yuan2.jsp");
		sq.getSession().setAttribute("model", model);
		mv.setView(rv);
		return mv;
	}
	
	@RequestMapping("deleteModelById.lovo")
	public ModelAndView deleteModelById(String type,String level,String perNum,String carNum,String perOfHos,String carOfHos,String id){
		modelService.updateModel(type, level, Integer.parseInt(perNum), Integer.parseInt(carNum), Integer.parseInt(perOfHos), Integer.parseInt(carOfHos), Integer.parseInt(id));
		ModelAndView mv = new ModelAndView();
		RedirectView rv = new RedirectView("findModelAll.lovo");
		mv.setView(rv);
		return mv;
	}
}
