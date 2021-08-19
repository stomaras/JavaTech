package com.tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addAlien")
public class IdFilter implements Filter {



	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// check if this filter really called 
		System.out.println("In filter");
		
		PrintWriter out = response.getWriter();
		
		// We typecasting the object ServletRequest
		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		if(aid > 1) {
			chain.doFilter(request, response);
		} else {
			out.print("Invalid Input");
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
