package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.ui.Console;

public class Dealer {

	private static boolean turn = false;
	private static List<Card> hand;

	public static List<Card> dealCards(Deck deck) {
		hand = new ArrayList<>();
		Card topCard = deck.draw();
		hand.add(topCard);

		return hand;

	}

	public static int addUpCards(List<Card> cards) {
		int sum = cards.stream().mapToInt(card -> card.getValue()).sum();
		return sum;
	}

	public static void hit(Deck deck, List<Card> hand) {
		Card topCard = deck.draw();
		hand.add(topCard);
	}

	public static int stand(List<Card> cards) {
		turn = true;
		int cardTally = addUpCards(cards);
		return cardTally;

	}

}
