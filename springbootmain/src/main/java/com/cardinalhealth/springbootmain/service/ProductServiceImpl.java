package com.cardinalhealth.springbootmain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardinalhealth.springbootmain.dao.ProductDAO;
import com.cardinalhealth.springbootmain.model.ProductModel;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public void addProduct(ProductModel product) {
		productDAO.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		productDAO.deleteById(productId);
	}

	@Override
	public void updateProduct(ProductModel product) {
		productDAO.save(product);
	}

	@Override
	public List<ProductModel> getProducts() {
		List<ProductModel> products = (List<ProductModel>) productDAO.findAll();
		return products;
	}

	@Override
	public ProductModel getProduct(int productId) {
		Optional<ProductModel> product = productDAO.findById(productId);
		System.out.println(product);
		ProductModel p = product.get();
		return p;	
	}
	
	@Override
	public List<ProductModel> findByProductName(String productName) {
		return productDAO.findByProductName(productName);
	}

	@Override
	public boolean isProductExists(int productId) {
		Boolean flag = productDAO.existsById(productId);
		return flag;
	}

}
