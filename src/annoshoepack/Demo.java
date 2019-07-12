package annoshoepack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {
public static void main(String[] args)throws Exception {
	
	//shop object should be fully created and then used...
	//ShoeShop shop=Bangalullululuuuru.getShoeShop();
	
//	ConfigurableApplicationContext ctx=
	//		new ClassPathXmlApplicationContext("config.xml");
	
	//AnnotationConfigApplicationContext actx=
		//	new AnnotationConfigApplicationContext("annoconfig.xml");
	ApplicationContext actx=new ClassPathXmlApplicationContext("annoconfig.xml");
	Seller shop=(Seller)actx.getBean("lss");
	Customer customer=new Customer();
	customer.setName("ramu");
	Shoe shoe=shop.sellShoe(customer);
	
	System.out.println(shoe);
	
	//ctx.close();
}
}
