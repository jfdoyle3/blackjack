package com.careerdevs.game;

import java.util.ArrayList;
import java.util.List;

import com.careerdevs.objects.Card;
import com.careerdevs.objects.Dealer;
import com.careerdevs.objects.Deck;
import com.careerdevs.ui.Console;

public class GameThree {
	private static int sum = 0;

	public static void playGame() {
		List<Integer> hand = new ArrayList<>();
		Deck deck = new Deck();

		deck.shuffle();
		System.out.println(deck.toString());

		Dealer.dealCards();
//		Card card = deck.draw();
//		Console.displayCard(card);
//		Card card2 = deck.draw();
//		Console.displayCard(card2);
//		Card card3 = deck.draw();
//		Console.displayCard(card3);
//		hand.add(card.getValue());
//		hand.add(card2.getValue());
//		hand.add(card3.getValue());
//		addHand(hand);

	}

	public static void addHand(List<Integer> card) {
		for (Integer i : card) {
			if (i > 10) {
				i = 10;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}