package com.sirius;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sirius.config.MyConfig;
import com.sirius.service.MyService;

public class AppMain {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	
	MyService mys=(MyService)context.getBean("myservice");
	
	mys.myServiceMethod();
}
}
