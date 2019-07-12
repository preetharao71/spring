package annoshoepack;

import org.springframework.stereotype.Component;

@Component("bsf")
public class BataShoeFactory extends ShoeFactory{
@Override
public Shoe makeShoe() {
	
	return new LeatherShoe();
}
}
