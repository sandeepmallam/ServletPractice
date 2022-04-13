package com.ServletFilter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/login")
public class Filter implements javax.servlet.Filter {

    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("enter filter");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		if( userName!=null && userName.equals("Sandeep") &&  password!=null && password.equals("chinna"))
			
			chain.doFilter(request, response);
		else
			response.getWriter().println("invalid username/password");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
