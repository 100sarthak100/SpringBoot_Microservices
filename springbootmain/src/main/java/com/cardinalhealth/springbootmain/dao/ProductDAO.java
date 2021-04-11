package com.cardinalhealth.springbootmain.dao;

import org.springframework.data.repository.CrudRepository;

import com.cardinalhealth.springbootmain.model.ProductModel;

public interface ProductDAO extends CrudRepository<ProductModel, Integer>{

}
