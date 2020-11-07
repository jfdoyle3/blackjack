package com.careerdevs.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.careerdevs.objects.Card;
import com.careerdevs.objects.Deck;
import com.careerdevs.ui.Console;

public class Game {

	// System.out.println(deck.getDeck().get(index).getValue()+deck.getDeck().get(index).getSuitSym());
	public static void playGame() {

		Deck deck = new Deck();
		deck.shuffleDeck();
		for (int idx = 0; idx < deck.getDeck().size(); idx++) {
			Console.displayCard(deck, idx);
		}
		Console.horzLine();

		// Create List of Hands
		List<String> hand = new ArrayList<>();
		List<String> dealer = new ArrayList<>();

		// Dealing cards to Dealer and Player
		for (int idx = 0; idx < 4; idx++) {
			String topCard = deck.drawCard(idx);
			if (idx % 2 == 0) {
				hand.add(topCard);
			} else {
				dealer.add(topCard);
			}

		}

		// Output Player Hand
		System.out.println("Hand");
		for (String card : hand)
			System.out.print(card + " ");
		Console.horzLine();

		// Output dealer hand
		System.out.println("Dealer");
		for (String card : dealer)
			System.out.print(card + " ");
		Console.horzLine();

		// TODO: Totaling up Hand
		System.out.println("Hand Total: ");
		int cardAdded = 0;
		for (int idx = 0; idx < hand.size(); idx++) {
			String str = hand.get(idx).replaceAll("\\D+", "");
			int cardInt = Integer.parseInt(str);
			int cardInt1 = +cardAdded;
			System.out.print(cardInt1);
		}

	}

}
