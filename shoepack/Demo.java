package shoepack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("shoepack/vanila.xml");
	Seller shop=ctx.getBean("advisedshop",Seller.class);
	//System.out.println(shop.getFactory());
	Customer c1=new Customer();c1.setName("fss");
	Customer c2=new Customer();c2.setName("css");
	System.out.println(shop.sellShoe(c1));
	System.out.println(shop.sellShoe(c2));
	//shop.sellShoe(c2);
}
}
