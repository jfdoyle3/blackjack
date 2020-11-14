package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private final static String[] SUITS = { "♠", "♥", "♧", "♦" };
	private final static int[] VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		for (var suit : SUITS) {
			for (var value : VALUES) {
				cards.add(new Card(value, suit));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		return cards.remove(cards.size() - 1);
	}
	
	public String deckEmpty() {
		if (cards.size()==0) {
			System.out.println("deck empty!!!"); 
		}
		return "Deck empty";
	}
	@Override
	public String toString() {
		return "Deck [cards=" + cards.toString() + "]";
	}

}
