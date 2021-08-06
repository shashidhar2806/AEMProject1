package com.demo.portfolio.core.serviceimpl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.portfolio.core.service.FirstService;

@Component(name="SecoundServiceImpl", immediate = true)
public class SecoundServiceImpl {

	@Reference
	FirstService fs;
	
	public static final Logger log = LoggerFactory.getLogger(SecoundServiceImpl.class);
	
	@Activate
	public void active() {
		log.error("This is activate 2nd..." + fs.getInfo());
	}
	
	@Deactivate
	public void deActivate() {
		log.error("This is deActivate 2nd...");
	}
	
	@Modified
	public void update() {
		log.error("This is modified 2nd...");
	}
	
}
