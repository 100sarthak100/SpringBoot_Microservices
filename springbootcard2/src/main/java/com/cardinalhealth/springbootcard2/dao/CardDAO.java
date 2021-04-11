package com.cardinalhealth.springbootcard2.dao;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cardinalhealth.springbootcard2.model.CardModel;

public interface CardDAO extends CrudRepository<CardModel, Integer>{

}
