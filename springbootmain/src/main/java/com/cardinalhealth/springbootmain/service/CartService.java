package com.cardinalhealth.springbootmain.service;

import java.util.List;

import com.cardinalhealth.springbootmain.model.CartModel;

public interface CartService {
	
	public void addProductToCart(CartModel product);
	
	public void deleteProductFromCart(int productId);

	public List<CartModel> getCartProducts();
	
	public CartModel getCartProductById(int productId);
	
	public boolean isProductExists(int productId);
}
