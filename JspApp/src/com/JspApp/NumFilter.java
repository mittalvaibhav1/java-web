package com.JspApp;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class NumFilter
 */
@WebFilter("/demo")
public class NumFilter implements Filter {

	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		if(num1 > 1) {
		chain.doFilter(request, response);
		}
		else {
			response.getWriter().print("OOPS");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
