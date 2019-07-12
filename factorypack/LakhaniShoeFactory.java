package factorypack;

import org.springframework.stereotype.Component;

//@Component
public class LakhaniShoeFactory extends ShoeFactory{

public Shoe makeShoe() {
	// TODO Auto-generated method stub
	return new Shoe();
}
}
