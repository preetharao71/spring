package com.day1.shoeshop;

import com.day1.shoe.Les;
import com.day1.shoe.Shoe;
import com.day1.shoefactory.ShoeFactory;

public abstract class ShoeShop implements ShoeSeller {

    private ShoeFactory factory;
    
    public Shoe sellShoes() {
    	return new Les();
    }
	

	public final ShoeFactory getFactory() {
		return factory;
	}

	public final void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}

	

	
}
