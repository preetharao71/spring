package com.day1.shoefactory;

import com.day1.shoe.Shoe;


public abstract class ShoeFactory implements ShoeManufacturer {

	public abstract Shoe makeShoes();

}
