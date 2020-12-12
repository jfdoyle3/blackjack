package com.careerdevs.cards;

public interface Deck {

	void shuffle();

	Card draw(boolean facing);

	boolean deckEmpty();

}