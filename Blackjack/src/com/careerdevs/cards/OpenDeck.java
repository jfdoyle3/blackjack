package com.careerdevs.cards;

public class OpenDeck implements Deck {
	
	
	public void shuffle() {
		return;
	}
	
	public Card draw() {
		return new Card(1,"clubs");
	}
	
	public boolean deckEmpty() {
		return false;
	}

}
