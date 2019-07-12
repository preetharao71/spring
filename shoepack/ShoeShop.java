package shoepack;

public abstract class ShoeShop implements Seller{
	private ShoeFactory factory;

	final public ShoeFactory getFactory() {
		return factory;
	}

	final public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
