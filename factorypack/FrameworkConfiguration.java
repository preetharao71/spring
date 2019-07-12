package factorypack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

@Configuration
public class FrameworkConfiguration {	
	
	private ShoeShop shop;
	@Bean(name = "shop")
	public ShoeShop getShop() {
		if (shop == null) {
			shop = new RamuShoeShop();
			
		}
		return shop;
	}
	private ShoeFactory factory;
	@Bean(name="bsf")
	public ShoeFactory getBataShoeFactory() {
		if (factory == null) {
			factory = new BataShoeFactory();
		}
		return factory;
	}

	@Bean(name="lsf")
	public ShoeFactory getLakhaniShoeFactory() {
		if (factory == null) {
			factory = new LakhaniShoeFactory();
		}
		return factory;
	}

	
}
