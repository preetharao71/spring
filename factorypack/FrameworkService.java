package factorypack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FrameworkService {

	private static  AnnotationConfigApplicationContext appContexts = null;
	
	public static Object getService(String serviceClass){
		if(appContexts == null){
			appContexts = new AnnotationConfigApplicationContext(FrameworkConfiguration.class);
		} 
		Object service = appContexts.getBean(serviceClass);
		return service;
	}
}
