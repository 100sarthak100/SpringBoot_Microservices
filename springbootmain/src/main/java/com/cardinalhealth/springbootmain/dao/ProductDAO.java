package com.cardinalhealth.springbootmain.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cardinalhealth.springbootmain.model.ProductModel;

public interface ProductDAO extends CrudRepository<ProductModel, Integer>{
	public List<ProductModel> findByProductName(String productName);
}
