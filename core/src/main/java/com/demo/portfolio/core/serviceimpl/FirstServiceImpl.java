package com.demo.portfolio.core.serviceimpl;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.portfolio.core.service.FirstService;

@Component(service = FirstService.class, name = "firstService", immediate = true)
public class FirstServiceImpl implements FirstService{
	
	public static final Logger log = LoggerFactory.getLogger(FirstServiceImpl.class);
	
	@Activate
	public void active() {
		System.out.println("Active");
		log.error("This is Active");
	}
	
	@Deactivate
	public void inActive() {
		System.out.println("deActive");
		log.error("This is  DeActive");
	}
	
	@Modified
	public void update() {
		System.out.println("modified");
		log.error("This is Modified");
	}
	
	@Override
	public String getInfo() {
		return "This is First service impl getInfo";
	}
}
