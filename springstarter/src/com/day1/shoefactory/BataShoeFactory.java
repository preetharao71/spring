package com.day1.shoefactory;

import com.day1.shoe.Les;
import com.day1.shoe.Shoe;


public class BataShoeFactory extends ShoeFactory {

	@Override
	public Shoe makeShoes() {
		System.out.println("Shoes made in Bata");
		return new Les();
	}

}
