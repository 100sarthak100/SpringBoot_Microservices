package com.cardinalhealth.springbootcard2.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CardModel {
	@Id
	private int cardId;
	private String cardTitle;
	
	private String cardImg1File;
	private String cardImg1Text;

	private String cardImg2File;
	private String cardImg2Text;
	
	private String cardImg3File;
	private String cardImg3Text;
	
	private String cardImg4File;
	private String cardImg4Text;
	
	public CardModel() {
		// TODO Auto-generated constructor stub
	}
	
	public CardModel(int cardId, String cardTitle, String cardImg1File, String cardImg1Text, String cardImg2File,
			String cardImg2Text, String cardImg3File, String cardImg3Text, String cardImg4File, String cardImg4Text,
			String cardText) {
		super();
		this.cardId = cardId;
		this.cardTitle = cardTitle;
		this.cardImg1File = cardImg1File;
		this.cardImg1Text = cardImg1Text;
		this.cardImg2File = cardImg2File;
		this.cardImg2Text = cardImg2Text;
		this.cardImg3File = cardImg3File;
		this.cardImg3Text = cardImg3Text;
		this.cardImg4File = cardImg4File;
		this.cardImg4Text = cardImg4Text;
		this.cardText = cardText;
	}

	@Override
	public String toString() {
		return "CardModel [cardId=" + cardId + ", cardTitle=" + cardTitle + ", cardImg1File=" + cardImg1File
				+ ", cardImg1Text=" + cardImg1Text + ", cardImg2File=" + cardImg2File + ", cardImg2Text=" + cardImg2Text
				+ ", cardImg3File=" + cardImg3File + ", cardImg3Text=" + cardImg3Text + ", cardImg4File=" + cardImg4File
				+ ", cardImg4Text=" + cardImg4Text + ", cardText=" + cardText + "]";
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCardImg1File() {
		return cardImg1File;
	}

	public void setCardImg1File(String cardImg1File) {
		this.cardImg1File = cardImg1File;
	}

	public String getCardImg1Text() {
		return cardImg1Text;
	}

	public void setCardImg1Text(String cardImg1Text) {
		this.cardImg1Text = cardImg1Text;
	}

	public String getCardImg2File() {
		return cardImg2File;
	}

	public void setCardImg2File(String cardImg2File) {
		this.cardImg2File = cardImg2File;
	}

	public String getCardImg2Text() {
		return cardImg2Text;
	}

	public void setCardImg2Text(String cardImg2Text) {
		this.cardImg2Text = cardImg2Text;
	}

	public String getCardImg3File() {
		return cardImg3File;
	}

	public void setCardImg3File(String cardImg3File) {
		this.cardImg3File = cardImg3File;
	}

	public String getCardImg3Text() {
		return cardImg3Text;
	}

	public void setCardImg3Text(String cardImg3Text) {
		this.cardImg3Text = cardImg3Text;
	}

	public String getCardImg4File() {
		return cardImg4File;
	}

	public void setCardImg4File(String cardImg4File) {
		this.cardImg4File = cardImg4File;
	}

	public String getCardImg4Text() {
		return cardImg4Text;
	}

	public void setCardImg4Text(String cardImg4Text) {
		this.cardImg4Text = cardImg4Text;
	}

	public String getCardText() {
		return cardText;
	}

	public void setCardText(String cardText) {
		this.cardText = cardText;
	}

	private String cardText;
}
