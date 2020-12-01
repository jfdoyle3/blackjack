package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.ui.Console;

public class Hand {

	private String owner;
	private static List<Card> hand;

	public Hand() {
		this.hand = new ArrayList<>();
	}

	public List<Card> dealCards(Deck deck, int card) {
		for (int idx = 0; idx < card; idx++) {
			hand.add(deck.draw());
		}
		return hand;
	}

	public static int addUpCards(List<Card> cards) {
		return cards.stream().mapToInt(card -> card.getValue()).sum();
	}

	
	public static void showHand(List<Card> playerHand) {
		Console.displayHand(playerHand);
	}
}
