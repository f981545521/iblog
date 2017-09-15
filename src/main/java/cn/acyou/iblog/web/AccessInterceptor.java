package cn.acyou.iblog.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.acyou.iblog.entity.User;
import cn.acyou.iblog.util.JsonResult;

/**
 * 拦截器
 * @author youfang
 * @addTime 2017年7月21日 上午10:42:02
 */
@Component
public class AccessInterceptor implements HandlerInterceptor {

	
	/**在控制器调用之前；过滤.do的请求*/
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri=request.getRequestURI();
		//System.out.println("Interceptor:"+uri);
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("loginUser");
		if(user==null){
			JsonResult result=new JsonResult("需要重新登录!");
			//利用response对象返回结果
			response.setContentType("application/json;charset=utf-8");
			response.setCharacterEncoding("utf-8");
			//把JavaBean转换成JSON对象
			ObjectMapper mapper=new ObjectMapper();
			String json=mapper.writeValueAsString(result);
			//将JSON通过response输出；
			PrintWriter pw=response.getWriter();
			pw.println(json);
			response.flushBuffer();
			return false;
		}
		//登录了返回true放过请求
		
		//没登录返回false拦截
		
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
