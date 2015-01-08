package com.supermarket;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	Map<Product, Integer> items = new HashMap<Product, Integer>();

	public void addProduct(Product p, int quantity) {
		items.put(p, quantity);
	}

	public Map<Product, Integer> getProducts() {
		return items;
	}

	public float getTotalCartValue() {

		float total = 0;
		for (Product p : items.keySet()) {
			total = total + (p.getPrice() * items.get(p)) - getFreeDiscountByProduct(p) - getPercentageDiscountByProduct(p);
		}
		return total;
	}

	public float getFreeDiscountByProduct(Product p) {

		if (p.getFreeOffer() == null)
			return 0;

		float discount = 0;

		int broughtQuantity = items.get(p);

		int buyQuantity = p.getFreeOffer().getBuyQuantity();
		int freeQuantity = p.getFreeOffer().getFreeQuantity();
		int free = broughtQuantity / (buyQuantity + freeQuantity);

		discount = (free * freeQuantity) * p.getPrice();

		return discount;
	}

	public float getPercentageDiscountByProduct(Product p) {
		if (p.getPercentageOffer() == null)
			return 0;
		float discount = 0;
		int broughtQuantity = items.get(p);

		int buyQuantity = p.getPercentageOffer().getBuyQuantity();
		int discountQuantity = p.getPercentageOffer().getDiscountQuantity();
		float discountPercentage = p.getPercentageOffer().getDiscountPercentage();

		int discountUnits = broughtQuantity / (buyQuantity + discountQuantity);

		discount = discountUnits * (p.getPrice() * (discountPercentage / 100));
		return discount;

	}

}
