package shoepack;

public class LuckyShoeShop extends ShoeShop{
@Override
public Shoe sellShoe(Customer customer) {
	// TODO Auto-generated method stub
	return getFactory().makeShoe();
}
@Override
	public void dummy() {
		// TODO Auto-generated method stub
		System.out.println("dummy method called...");
	}

public void setup() {
	System.out.println("setup method called...");
}


}
