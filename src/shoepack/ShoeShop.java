package shoepack;

public abstract class ShoeShop implements Seller{
	private ShoeFactory factory;
	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
