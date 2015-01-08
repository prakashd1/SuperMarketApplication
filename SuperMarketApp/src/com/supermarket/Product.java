package com.supermarket;

public class Product {

	public Product(String name, float price, FreeOffer offer, PercentageOffer discountOffer) {
		this.name = name;
		this.price = price;
		this.freeOffer = offer;
		this.percentageOffer = discountOffer;
	}

	private String name;
	private float price;

	private FreeOffer freeOffer;
	private PercentageOffer percentageOffer;

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public FreeOffer getFreeOffer() {
		return freeOffer;
	}

	public PercentageOffer getPercentageOffer() {
		return percentageOffer;
	}

}
