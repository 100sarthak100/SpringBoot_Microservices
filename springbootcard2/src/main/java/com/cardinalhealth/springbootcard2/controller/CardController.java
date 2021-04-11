package com.cardinalhealth.springbootcard2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardinalhealth.springbootcard2.model.CardModel;
import com.cardinalhealth.springbootcard2.service.CardService;

@CrossOrigin(origins = {"http://localhost:9000"})

@RestController
@RequestMapping("card")
public class CardController {
	@Autowired
	CardService cardService;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@GetMapping
	public ResponseEntity<List<CardModel>> getCards() {
		List<CardModel> cards = cardService.getCards();

		return new ResponseEntity<List<CardModel>>(cards, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<String> addCard(@RequestBody CardModel card) {
		String msg = null;
		if (cardService.isCardExists(card.getCardId())) {
			msg = "Card with card id : " + card.getCardId() + " not saved or the card already exists";
			return new ResponseEntity<String>(msg, HttpStatus.CONFLICT);
		} else {
			cardService.addCard(card);
			msg = "Card with card id : " + card.getCardId() + " saved successfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}
	}
	
	
	
	
	
	
	
}
