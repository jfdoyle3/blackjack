package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.ui.Console;

public class Dealer  {

	private static boolean turn = false;
	private static List<Card> hand;

	public static List<Card> dealCards(Deck deck, int card) {
		hand = new ArrayList<>();
		for (int idx = 0; idx < card; idx++) {
			hand.add(deck.draw());
		}
		return hand;
	}

	public static int addUpCards(List<Card> cards) {
		return cards.stream().mapToInt(card -> card.getValue()).sum();
	}

	public static void hit(Deck deck, List<Card> hand) {
		hand.add(deck.draw());
	}

	public static int stand(List<Card> cards) {
		turn = true;
		return addUpCards(cards);

	}

}
