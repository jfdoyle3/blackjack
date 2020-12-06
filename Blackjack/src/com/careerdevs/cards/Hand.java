package com.careerdevs.cards;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.objects.Actor;
import com.careerdevs.ui.Console;

public class Hand {

	private List<Card> cards = new ArrayList<>(); 
	private Actor actor;

	public Hand(Actor actor) {
		this.actor = actor;
	}

	// TODO: add a constructor takes one card for a split;
	public Actor getActor() {
		return actor;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

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
		boolean aceHigh = true;
		for (Card card : cards) {

			
			if (card.getValue() == 1 && total+11 > 22) {
				System.out.println("\n\nfoundAH:-" + aceHigh);
				total -= 10;
				aceHigh = true;
			}
			if (card.getValue() == 1 && aceHigh && total <= 21) {
				System.out.println("\n\nfoundAH:+" + aceHigh);
				total += 10;
				aceHigh = false;
			}
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
