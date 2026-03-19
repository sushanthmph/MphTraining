package com.test;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class Myfiter
 */
@WebFilter("/Login")
public class Myfiter extends HttpFilter  {
    private static final long serialVersionUID=1L;
	public void destroy() {
		System.out.println("filter destroy method");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("before servlet");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("After servlet");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("fiter init()");
	}

}
