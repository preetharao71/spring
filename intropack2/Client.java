package intropack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("intropack2/config.xml");
	
	Human shoiab=ctx.getBean("doctorshoiab",Human.class);
	
	System.out.println(shoiab);
	
	Doctor doctorshoiab=(Doctor)shoiab;
	
	doctorshoiab.doCure();
}
}
