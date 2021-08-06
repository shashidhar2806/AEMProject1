package com.demo.portfolio.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.json.JSONObject;
import org.osgi.service.component.annotations.Component;

@Component(
		service = Servlet.class,
		property = {
				"sling.servlet.resourceTypes=demo1/components/structure/page",
		        "sling.servlet.method=POST",
		        "sling.servlet.selector=test"
		})
public class ResoureceServletExample extends SlingAllMethodsServlet{

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("application/json");
		JSONObject obj = new JSONObject();
		
		try {
			obj.put("Test", "done");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
