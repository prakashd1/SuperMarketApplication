package com.supermarket;

public class FreeOffer {

	private int buyQuantity;
	private int freeQuantity;

	public FreeOffer(int buyQuantity, int freeQuantity) {
		super();
		this.buyQuantity = buyQuantity;
		this.freeQuantity = freeQuantity;
	}

	public int getBuyQuantity() {
		return buyQuantity;
	}

	public int getFreeQuantity() {
		return freeQuantity;
	}

}
