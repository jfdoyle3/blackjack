package com.careerdevs.cards;

public class SingleCard implements Deck {
	
	
	public void shuffle() {
		return;
	}
	
	public Card draw() {
		return new Card(1,"♠");
	}
	
	public boolean deckEmpty() {
		return false;
	}

}
