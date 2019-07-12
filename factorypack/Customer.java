package factorypack;	

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import factorypack.ShoeShop;

public class Customer {
	public static void main(String[] args) {
		//ApplicationContext ctx1 = new AnnotationConfigApplicationContext(RamuShoeShop.class);
	    //FooService fooService = ctx.getBean(FooService.class);

		//ApplicationContext ctx=new FileSystemXmlApplicationContext("config.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("shoe-config.xml");
		Seller myshop=ctx.getBean("ramuShoeShop",Seller.class);
		
		Cust cu=new Cust();cu.setName("ramu");
		System.out.println(myshop.sellShoe(cu));
	}
}
