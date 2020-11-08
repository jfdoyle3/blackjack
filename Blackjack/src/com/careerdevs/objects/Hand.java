package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private static List<String> hand = new ArrayList<>();
	private static List<String> dealer = new ArrayList<>();

	public static void dealCards() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		for (int idx = 0; idx < 4; idx++) {
			String topCard = deck.drawCard(idx);
			if (idx % 2 == 0) {
				hand.add(topCard);
			} else {
				dealer.add(topCard);
			}

		}
	}
}
