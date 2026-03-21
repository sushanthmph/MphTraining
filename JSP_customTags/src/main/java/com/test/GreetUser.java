package com.test;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class GreetUser extends TagSupport {
	private static final long serialVersionUID=1L;
	
	public int doStartTag()
	{
		JspWriter out = null;
		try
		{
			out =pageContext.getOut();
			out.println("Welcome to JAVA AI world...");
		}
		catch(Exception e)
		{
			
		}
		
		
		
		return SKIP_BODY;
	}
}
