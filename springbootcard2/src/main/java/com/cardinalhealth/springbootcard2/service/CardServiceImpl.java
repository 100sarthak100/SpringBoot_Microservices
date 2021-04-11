package com.cardinalhealth.springbootcard2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardinalhealth.springbootcard2.dao.CardDAO;
import com.cardinalhealth.springbootcard2.model.CardModel;

@Service
public class CardServiceImpl implements CardService {
	
	@Autowired
	CardDAO cardDAO;

	@Override
	public void addCard(CardModel card) {
		cardDAO.save(card);
	}

	@Override
	public void deleteCard(int cardId) {
		cardDAO.deleteById(cardId);
	}

	@Override
	public void updateCard(CardModel card) {
		cardDAO.save(card);
	}

	@Override
	public List<CardModel> getCards() {
		List<CardModel> cards = (List<CardModel>) cardDAO.findAll();
		return cards;
	}

	@Override
	public CardModel getCard(int cardId) {
		Optional<CardModel> card = cardDAO.findById(cardId);
		CardModel c = card.get();
		return c;
	}

	@Override
	public boolean isCardExists(int cardId) {
		Boolean flag = cardDAO.existsById(cardId);
		return flag;
	}

}
