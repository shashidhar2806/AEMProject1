package com.demo.portfolio.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(
		   service = Servlet.class,
           property = {"Sling.servlet.paths=/bin/AemTask/articles"}
		   )
public class FirstServlet extends SlingSafeMethodsServlet{

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain");
		response.getWriter().print("My servlet");
	}
}
