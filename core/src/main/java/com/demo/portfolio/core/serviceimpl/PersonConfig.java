package com.demo.portfolio.core.serviceimpl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "PersonConfig")
public @interface PersonConfig {
	
	@AttributeDefinition(name="Enable Profile")
	public boolean person_enable();

	@AttributeDefinition(name="Person Name")
	public String person_name();
	
	@AttributeDefinition(name="person Gendre",
			options = { @Option(label = "Male", value = "male"), @Option(label = "FeMale", value = "female") })
	public String person_gendre();
	
}
