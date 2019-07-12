package shoepack;

public class LakhaniShoeFactory extends ShoeFactory{
@Override
public Shoe makeShoe() {
	
	return new SportsShoe();
}
}
