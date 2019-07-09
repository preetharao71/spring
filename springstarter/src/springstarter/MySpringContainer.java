package springstarter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.day1.shoefactory.ShoeFactory;
import com.day1.shoeshop.ShoeShop;

public class MySpringContainer {
	public static ShoeShop getShoeShop() throws FileNotFoundException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		  Properties prop = new Properties(); prop.load(new
		  FileInputStream("config.properties")); String shopclass=
		  prop.getProperty("shop"); String shoe= prop.getProperty("shoe"); String
		  factory = prop.getProperty("factory"); ShoeShop seller = (ShoeShop)
		  Class.forName(shopclass).newInstance(); ShoeFactory shoeFactory =
		  (ShoeFactory) Class.forName(factory).newInstance();
		  seller.setFactory(shoeFactory);
		 
		
		return seller;

	}
	
}
