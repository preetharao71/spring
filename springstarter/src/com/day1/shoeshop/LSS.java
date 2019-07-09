package com.day1.shoeshop;

import com.day1.shoe.Shoe;
import com.day1.shoeshop.ShoeShop;

public class LSS extends ShoeShop {

	public Shoe sellShoes() {
		return getFactory().makeShoes();
		
	}


	
	
}
