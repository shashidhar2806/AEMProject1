package com.demo.portfolio.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.demo.portfolio.core.serviceimpl.PersonServiceImpl;

@Model(adaptables = SlingHttpServletRequest.class)
public class FirstSlingModel {
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String description;
	
	@ValueMapValue
	private String childDepth;
	
	@ValueMapValue
	private String[] pages;
	
	@OSGiService
	private PersonServiceImpl personServiceImpl;
	
	String osgiValue;
	
	@RequestAttribute
	private String type;
	
	public PersonServiceImpl getPersonServiceImpl() {
		return personServiceImpl;
	}

	public String getOsgiValue() {
		return osgiValue;
	}

	public String getType() {
		return type;
	}

	@PostConstruct
	public void init() {
		osgiValue = personServiceImpl.osgiMethod();
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getChildDepth() {
		return childDepth;
	}

	public String[] getPages() {
		return pages;
	}
	
	
	

}
