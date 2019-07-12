package fanpack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import paintpack.PaintBrush;

public class Demo {
public static void main(String[] args) throws Exception{
	ApplicationContext ctx=new FileSystemXmlApplicationContext("paint-config.xml");
	
	Fan khaitan=(Fan)ctx.getBean("fan");
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("Press Enter to pull chain....");
		br.readLine();
		khaitan.pull();
	}
}
}
