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
		List<String> hand = new ArrayList<>();
		List<String> dealer = new ArrayList<>();
		// Create List of Hands

		int intCard = deck.getDeck().get(0).getValue();
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

		String str = hand.get(0).replaceAll("\\D+", "");
		String str2 = hand.get(1).replaceAll("\\D+", "");
		int cardInt = Integer.parseInt(str);
		int cardInt2 = Integer.parseInt(str2);
		int cardTotal = cardInt + cardInt2;
		System.out.print(cardTotal);

	}

}
