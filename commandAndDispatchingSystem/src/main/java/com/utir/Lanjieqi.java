package com.utir;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.bean.PowerEntity;
import com.lovo.bean.UserBean;

public class Lanjieqi implements HandlerInterceptor {
	public static final String POWERERROR="你的权限不足！！！";
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 String ServletPath=request.getServletPath();
		 System.out.println(ServletPath);
			UserBean user = (UserBean) request.getSession().getAttribute("user");
		  boolean bl=false;
		  if(user!=null) {
		  List<PowerEntity> listPower=(List<PowerEntity>) request.getSession().getAttribute("powerli");
			   if(null!=listPower&&!listPower.isEmpty()){
				   //对比权限
				   for (PowerEntity power : listPower) {
			
					if(power.getUrl().equals(ServletPath)){
						//有权限
						bl=true;
						return bl;
					}
				}
			   }
		   }
		    if(!bl){
		       request.setAttribute("errorMsg",Lanjieqi.POWERERROR);
		 	   request.getRequestDispatcher("erre.jsp").forward(request, response);
		 
		    }
			
			//判断是否拥有权限
				return bl;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
        
}
