package com.cardinalhealth.springbootmain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardinalhealth.springbootmain.dao.CartDAO;
import com.cardinalhealth.springbootmain.model.CartModel;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDAO cartDAO;
	
	@Override
	public void addProductToCart(CartModel product) {
		cartDAO.save(product);
	}

	@Override
	public void deleteProductFromCart(int productId) {
		cartDAO.deleteById(productId);
	}

	@Override
	public List<CartModel> getCartProducts() {
		List<CartModel> products = (List<CartModel>) cartDAO.findAll();
		return products;
	}
	
	@Override
	public CartModel getCartProductById(int productId) {
		Optional<CartModel> product = cartDAO.findById(productId);
		System.out.println(product);
		CartModel p = product.get();
		return p;	
	}

	@Override
	public boolean isProductExists(int productId) {
		Boolean flag = cartDAO.existsById(productId);
		return flag;
	}

}
