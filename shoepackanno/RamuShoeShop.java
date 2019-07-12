package shoepackanno;

import javax.sql.DataSource;

import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("rss")
@Service("rss")
public class RamuShoeShop extends ShoeShop{
	
public Shoe sellShoe(Cust c) {
	// TODO Auto-generated method stub
	return getFactory().makeShoe();
}

}
