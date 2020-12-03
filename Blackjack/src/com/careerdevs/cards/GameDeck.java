package com.careerdevs.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameDeck implements Deck {

	private final static String[] SUITS = { "♠", "♥", "♧", "♦" };
	private final static int[] VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13};
	private List<Card> cards;
	private boolean isEmpty=false;

	public GameDeck() {
		cards = new ArrayList<>();
		for (var suit : SUITS) {
			for (var value : VALUES) {
				cards.add(new Card(value, suit));
			}
		}
	}

	@Override
	public void shuffle() {
		Collections.shuffle(cards);
	}

	@Override
	public Card draw() {
		return cards.remove(cards.size() - 1);
	}

	@Override
	public boolean deckEmpty() {
		if (cards.size() == 0) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Deck [cards=" + cards.toString() + "]";
	}

}