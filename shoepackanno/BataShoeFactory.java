package shoepackanno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("bsf")
@Service("bsf")
public class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		System.out.println("bata shoe factory cons called...");
	}

public Shoe makeShoe() {
	// TODO Auto-generated method stub
	return new Shoe();
}
}
