package cn.acyou.iblog.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import cn.acyou.iblog.entity.User;

/**
 * 过滤器
 * Servlet Filter implementation class AccessFilter
 */
public class AccessFilter implements Filter {
	
	private final Logger log=Logger.getLogger(AccessFilter.class);

    /**
     * Default constructor. 
     */
    public AccessFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	//列举不需要限制的URI
	private String[] visit=
			new String[]{"/iblog/web/login.html","/iblog/web/cover.html","/iblog/web/index.html","/iblog/web/register.html"};
	/**过滤没有session的HTML请求*/
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		HttpSession session=req.getSession();
		String path=req.getRequestURI();
		//System.out.println(path);
		log.warn("doFilter--->当前访问URL："+path);
		//判断访问路径是否以login结尾
		if(Arrays.asList(visit).contains(path)){
			chain.doFilter(request, response);
			return;
		}

		//获得session
		User user=(User)session.getAttribute("loginUser");
		if(user==null){
			//如果没有登录就重定向到登录页面
			//System.out.println(req.getContextPath());
			//res.sendRedirect(req.getContextPath()+"/v4.2/login.html");
			res.sendRedirect("/iblog/web/cover.html");
			return;
		}
		//如果登录过，就放过请求
		chain.doFilter(request, response);
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		
	}

}
