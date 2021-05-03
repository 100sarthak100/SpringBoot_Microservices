package com.cardinalhealth.springbootmain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardinalhealth.springbootmain.model.CartModel;
import com.cardinalhealth.springbootmain.service.CartService;

@CrossOrigin(origins = {"http://localhost:9000"})

@RestController
@RequestMapping("cart")
public class CartController {
	@Autowired
	CartService cartService;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping
	public ResponseEntity<List<CartModel>> getProducts() {
		List<CartModel> products = cartService.getCartProducts();
		return new ResponseEntity<List<CartModel>>(products, HttpStatus.OK);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<CartModel> getProduct(@PathVariable("productId") Integer productId) {
		CartModel product = new CartModel();
		if (cartService.isProductExists(productId)) {
			product = cartService.getCartProductById(productId);
			return new ResponseEntity<CartModel>(product, HttpStatus.FOUND);
		}		
		else
		{
			return new ResponseEntity<CartModel>(product, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<String> addProduct(@RequestBody CartModel product) {
		String msg = null;
//		if (cartService.isProductExists(product.getProductId())) {
//			msg = "Product with product id : " + product.getProductId() + " not saved or the product already exists";
//			return new ResponseEntity<String>(msg, HttpStatus.CONFLICT);
//		} else {
//			
//		}
		cartService.addProductToCart(product);
//		msg = "Product with product id : " + product.getProductId() + " saved successfully";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<String> deleteProductFromCart(@PathVariable("productId") Integer productId) {
		if (cartService.isProductExists(productId)) {
			cartService.deleteProductFromCart(productId);
			String msg = "Product with product id : " + productId + " deleted successfully	";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} else {
			String msg = "Product with product id : " + productId
					+ " not deleted successfully; Product doesn't exists	";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}
	}
}
