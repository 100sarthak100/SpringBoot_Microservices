package com.cardinalhealth.springbootcard2.service;

import java.util.List;

import com.cardinalhealth.springbootcard2.model.CardModel;

public interface CardService {
	public void addCard(CardModel card);
	
	public void deleteCard(int cardId);
	
	public void updateCard(CardModel card);

	public List<CardModel> getCards();

	public CardModel getCard(int cardId);
	
	public boolean isCardExists(int cardId);
}
