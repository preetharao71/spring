package annodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
public static void main(String[] args) {
//	ApplicationContext ctx1=new FileSystemXmlApplicationContext("config.xml");
	ApplicationContext ctx = 
		new AnnotationConfigApplicationContext(AppConfig.class);
		
	FooService fs=ctx.getBean(FooService.class);
	fs.doFoo();
}
}
