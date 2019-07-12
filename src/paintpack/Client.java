package paintpack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ConfigurableApplicationContext ctx=
			new ClassPathXmlApplicationContext("config.xml");
	
	PaintBrush pb=ctx.getBean("brush",PaintBrush.class);
	
	pb.doPaint();
}
}
