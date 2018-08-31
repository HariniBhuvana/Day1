package com.harini.day1;

public class DiscountBill {
	public static double billDetails(double newItem) {
		double discount = (double) (newItem * 0.35);
		double newItemPrice = newItem - discount;
		return newItemPrice;
	}

}
