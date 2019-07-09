package springstarter;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.day1.shoe.Shoe;
import com.day1.shoeshop.ShoeSeller;

public class MakeAndSellShoes {
	
	public static void main( String args[]) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		
				
		/*
		 * ShoeShop shop = MySpringContainer.getShoeShop(); ShoeSeller s=
		 * (ShoeSeller)shop; Shoe shoe = shop.sellShoes();
		 */
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("stan-config.xml");
		ShoeSeller s = (ShoeSeller)ctx.getBean("shop");
		Shoe myshoe =s.sellShoes();
		System.out.print("Shoe"+ myshoe);
		
	}

}
