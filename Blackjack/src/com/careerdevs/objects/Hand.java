package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.ui.Console;

public class Hand {

	private List<Card> cards = new ArrayList<>();

	public List<Card> dealCards(Deck deck, int card) {
		for (int idx = 0; idx < card; idx++) {
			cards.add(deck.draw());
		}
		return cards;
	}

	public int getCount() {
		return cards.size();
	}

	public int addUpCards() {
		int total = 0;
		for (Card card : cards) {
			if (card.getValue() > 10) {
				total += 10;
			} else {
				total += card.getValue();
			}
		}
		return total;
	}

	public void showHand() {
		Console.displayHand(cards);
	}

}
