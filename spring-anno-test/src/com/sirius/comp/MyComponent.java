package com.sirius.comp;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:application.properties" })
public class MyComponent {
	
//	@Autowired
//	private SessionFactory factory;
	 @Autowired
	    private Environment environment;
public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

public MyComponent() {
	System.out.println("component object created...");
}

public String sayHello() {
	System.out.println(environment.getRequiredProperty("jdbc.driverClassName"));
	return "welcome to spring 100% annotation..";
}

//public SessionFactory getFactory() {
//	return factory;
//}
//
//public void setFactory(SessionFactory factory) {
//	this.factory = factory;
//}
}
