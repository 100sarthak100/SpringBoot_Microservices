package com.cardinalhealth.springbootmain.service;

import java.util.List;

import com.cardinalhealth.springbootmain.model.ProductModel;

public interface ProductService {
	
	public void addProduct(ProductModel product);
	
	public void deleteProduct(int productId);
	
	public void updateProduct(ProductModel product);

	public List<ProductModel> getProducts();

	public ProductModel getProduct(int productId);
	
	public List<ProductModel> findByProductName(String productName);
	
	public boolean isProductExists(int productId);
	
}
