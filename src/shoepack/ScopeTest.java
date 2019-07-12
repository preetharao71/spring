package shoepack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	
	public static void main(String args[]) {
		
		ConfigurableApplicationContext ctx=
				new ClassPathXmlApplicationContext("config.xml");
		
		Seller seller =(Seller) ctx.getBean("targetShop");
		
		Customer cust = ( Customer) ctx.getBean("");
		//seller.sellShoe(customer)
	
		
	}
}
