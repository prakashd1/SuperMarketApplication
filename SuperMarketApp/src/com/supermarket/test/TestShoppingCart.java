package com.supermarket.test;

/**
 * 
 * @author Prakash Dayaramani
 *
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.supermarket.PercentageOffer;
import com.supermarket.FreeOffer;
import com.supermarket.Product;
import com.supermarket.ShoppingCart;

public class TestShoppingCart {

	ShoppingCart shoppingCart;
	Product doveSoap;
	Product doveSoapWithFreeOffer;
	Product axeDeo;
	Product doveSoapWithDiscount;

	@Before
	public void setup() {
		shoppingCart = new ShoppingCart();
		doveSoap = new Product("Dove", 30, new FreeOffer(1, 0), null);
		doveSoapWithFreeOffer = new Product("Dove", 30, new FreeOffer(2, 1), null);
		axeDeo = new Product("AxeDeo", 100, null, null);
		doveSoapWithDiscount = new Product("Dove", 30, null, new PercentageOffer(1, 1, 50));
	}

	@Test
	public void testAddProductToCart() {

		shoppingCart.addProduct(doveSoap, 5);
		Assert.assertEquals(shoppingCart.getTotalCartValue(), 150, 0);
	}

	@Test
	public void testAddProductToCartWithFreeOffer() {

		shoppingCart.addProduct(doveSoapWithFreeOffer, 3);
		Assert.assertEquals(shoppingCart.getTotalCartValue(), 60, 0);
	}

	@Test
	public void testAddProductToCartWithFreeOffer2() {

		shoppingCart.addProduct(doveSoapWithFreeOffer, 5);
		Assert.assertEquals(shoppingCart.getTotalCartValue(), 120, 0);
	}

	@Test
	public void testAddMultimpleProductsToCartWithAndWithoutFreeOffer() {

		shoppingCart.addProduct(doveSoapWithFreeOffer, 3);
		shoppingCart.addProduct(axeDeo, 2);
		Assert.assertEquals(shoppingCart.getTotalCartValue(), 260, 0);
	}

	@Test
	public void testAddProductWithPercentageOffer() {
		shoppingCart.addProduct(doveSoapWithDiscount, 2);
		System.out.println(shoppingCart.getTotalCartValue());
		Assert.assertEquals(45, shoppingCart.getTotalCartValue(), 0);
	}

}
