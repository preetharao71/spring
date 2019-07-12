package annodemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/config.xml")
public class AppConfig {
    private @Value("#{fooprop.name}") String name;
   //hello world for testing.....
    @Bean
    public FooService fooService() {
    	System.out.println("name........."+name);
        return new FooServiceImpl();
    }

}
interface FooService{
	public void doFoo(); 
}
class FooServiceImpl implements FooService
{
	@Override
	public void doFoo() {
		System.out.println("foooooooooooooooooooooooo");
	}
}