package paintpack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("paint-config.xml");
		
		PaintBrush pb=(PaintBrush)ctx.getBean("pb");
		PaintBrush pb1=(PaintBrush)ctx.getBean("pb");
		PaintBrush pb2=(PaintBrush)ctx.getBean("pb");
//		
//		pb.paint();
	}
	
}
