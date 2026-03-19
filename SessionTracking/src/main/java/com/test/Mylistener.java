package com.test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class Mylistener implements HttpSessionListener {
	public static ServletContext ctx=null;
	public static int current, total=0;
	
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	total++;
    	current++;
    	
    	ctx=se.getSession().getServletContext();
    	ctx.setAttribute("tusers", total);
    	ctx.setAttribute("cusers", current);
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	current--;
    	ctx.setAttribute("cusers", current);
    }
	
}
