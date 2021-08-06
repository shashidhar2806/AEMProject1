package com.demo.portfolio.core.serviceimpl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(name="PersonServiceImpl", immediate = true, service = PersonServiceImpl.class)
@Designate(ocd = PersonConfig.class)
public class PersonServiceImpl {

	public static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	@Activate
	public void activate(PersonConfig config) {
		log.info("Is Profile enable : " + config.person_enable());
		log.info("Profile name : " + config.person_name());
		log.info("Profile Gendre : " + config.person_gendre());
	}
	
	public String osgiMethod() {
		return "From OSGI Service";
	}
}
