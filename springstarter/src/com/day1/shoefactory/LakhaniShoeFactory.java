package com.day1.shoefactory;

import com.day1.shoe.Les;
import com.day1.shoe.Shoe;

public class LakhaniShoeFactory extends ShoeFactory{

	
	@Override
	public Shoe makeShoes() {
		
		Shoe s = new Les();
		System.out.println("Shoes made in Lakhani");
		return s;
	}
}
