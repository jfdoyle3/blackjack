package com.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.ui.Console;

public class Dealer {

	private static boolean turn=false;
	private static List<Card> hand = new ArrayList<>();
	private static List<Card> dealer = new ArrayList<>();

	public static void dealCards() {
		Deck deck = new Deck();

		deck.shuffle();

		for (int idx = 0; idx < 4; idx++) {
			Card topCard = deck.draw();
			if (idx % 2 == 0) {
				hand.add(topCard);
			} else {
				dealer.add(topCard);

			}
		}

		System.out.println("Hand");
		Console.displayHand(hand);
		System.out.println("Dealer");
		Console.displayHand(dealer);


	}

	public static int addUpCards(List<Card> cards) {
		int sum = cards.stream().mapToInt(card -> card.getValue()).sum();
		return sum;
	}
	
	
	public static void hit(Deck deck) {
		Card topCard = deck.draw();
			hand.add(topCard);
	}
	
	public static int stand(List<Card> cards) {
		turn=true;
		int cardTally = addUpCards(cards);
		return cardTally;
		
	}

}
