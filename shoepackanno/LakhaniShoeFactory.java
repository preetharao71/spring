package shoepackanno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("lsf")
@Service("lsf")
public class LakhaniShoeFactory extends ShoeFactory{

public Shoe makeShoe() {
	// TODO Auto-generated method stub
	return new Shoe();
}
}
