package vanilapack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("vanilapack/vanila.xml");
	IceCream icc=ctx.getBean("icecream",IceCream.class);
	Vanila v=icc.getVanila();
	System.out.println("vanila code...:"+v.getCode());
	icc.flavour();	
	System.out.println(icc.getAlist());
	System.out.println(icc.getAmap());;
	System.out.println(icc.getAset());
	System.out.println("ice cream Code...:"+icc.getCode());
}
}
