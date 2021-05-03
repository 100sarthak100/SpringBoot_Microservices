package com.cardinalhealth.springbootmain.dao;

import org.springframework.data.repository.CrudRepository;

import com.cardinalhealth.springbootmain.model.CartModel;

public interface CartDAO extends CrudRepository<CartModel, Integer>{

}
