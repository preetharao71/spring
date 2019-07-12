package shoepack;

public class RamuShoeShop extends ShoeShop{
@Override
public Shoe sellShoe(Customer c) {
	// TODO Auto-generated method stub
	
	return getFactory().makeShoe();
}
}
