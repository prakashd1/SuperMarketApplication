package com.supermarket;

public class PercentageOffer {

	private int buyQuantity;
	private int discountQuantity;
	private int discountPercentage;

	public PercentageOffer(int buyQuantity, int discountQuantity, int discountPercentage) {
		this.buyQuantity = buyQuantity;
		this.discountQuantity = discountQuantity;
		this.discountPercentage = discountPercentage;
	}

	public int getBuyQuantity() {
		return buyQuantity;
	}

	public int getDiscountQuantity() {
		return discountQuantity;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

}
