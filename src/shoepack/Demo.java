package shoepack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {
public static void main(String[] args)throws Exception {
	
	//shop object should be fully created and then used...
	//ShoeShop shop=Bangalullululuuuru.getShoeShop();
	
	ConfigurableApplicationContext ctx=
			new ClassPathXmlApplicationContext("config.xml");
	
	Seller shop=(Seller)ctx.getBean("advisedshop");
	Customer customer=new Customer();
	customer.setName("ramu");
	Shoe shoe=shop.sellShoe(customer);
	
	System.out.println(shoe);
	shop.dummy();
	//shop.sellShoe(customer);
	Purchase p=(Purchase)shop;
	p.buyShoe();
	ctx.close();
}
}
