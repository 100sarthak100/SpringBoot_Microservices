package com.cardinalhealth.springbootmain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardinalhealth.springbootmain.model.ProductModel;
import com.cardinalhealth.springbootmain.service.ProductService;

@CrossOrigin(origins = {"http://localhost:9000"})

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping
	public ResponseEntity<List<ProductModel>> getProducts() {
		List<ProductModel> products = productService.getProducts();
		return new ResponseEntity<List<ProductModel>>(products, HttpStatus.OK);
	}

	@GetMapping("/{productId}")
	public ResponseEntity<ProductModel> getProduct(@PathVariable("productId") Integer productId) {
		ProductModel product = new ProductModel();
		if (productService.isProductExists(productId)) {
			product = productService.getProduct(productId);
			return new ResponseEntity<ProductModel>(product, HttpStatus.FOUND);
		}		
		else
		{
			return new ResponseEntity<ProductModel>(product, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<String> addProduct(@RequestBody ProductModel product) {
		String msg = null;
		if (productService.isProductExists(product.getProductId())) {
			msg = "Product with product id : " + product.getProductId() + " not saved or the product already exists";
			return new ResponseEntity<String>(msg, HttpStatus.CONFLICT);
		} else {
			productService.addProduct(product);
			msg = "Product with product id : " + product.getProductId() + " saved successfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}
	}
	
}
