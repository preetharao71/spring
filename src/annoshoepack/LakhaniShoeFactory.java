package annoshoepack;

import org.springframework.stereotype.Component;

@Component("lsf")
public class LakhaniShoeFactory extends ShoeFactory{
@Override
public Shoe makeShoe() {
	
	return new SportsShoe();
}
}
